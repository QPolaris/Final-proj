package cs.mad.flashcards.activities

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.widget.Toast
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import cs.mad.flashcards.R
import cs.mad.flashcards.databinding.ActivityLocalWeatherBinding
import cs.mad.flashcards.entities.WeatherInfo
import cs.mad.flashcards.services.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LocalWeatherActivity : AppCompatActivity(), Callback<WeatherInfo>, LocationListener {
    private lateinit var locationManager: LocationManager
    private lateinit var binding: ActivityLocalWeatherBinding
    private val locationPermissionCode = 2
    val API_KEY = "0af6e62f4ea0c9d0d46f5e69e763805d"
    var zipCode = 35218
    private lateinit var service: WeatherService
    private var weatherInfo: WeatherInfo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocalWeatherBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_local_weather)
        locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager

        service = WeatherService()
        // service.weatherService.getWeatherInfo(zipCode, API_KEY).enqueue(this)
        getLocation()

        val btn = findViewById<Button>(R.id.advanced_stats_btn)
        btn.setOnClickListener {
            val intent = Intent(this, AdvancedStats::class.java)
            intent.putExtra("Lat", this.weatherInfo?.coord?.lat.toString())
            intent.putExtra("Lon", this.weatherInfo?.coord?.lon.toString())
            startActivity(intent)
        }
    }

    private fun getLocation() {
        if ((ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED)) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), locationPermissionCode)
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5f,
            this)
    }

    override fun onLocationChanged(location: Location) {
        println("----------------- location -----------------")
        println(location.latitude)
        println(location.longitude)
        service.weatherService.getWeatherByCoord(location.latitude, location.longitude,
            API_KEY).enqueue(this)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == locationPermissionCode) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onResponse(
        call: Call<WeatherInfo>,
        response: Response<WeatherInfo>
    ) {
        if (response.isSuccessful) {
            Log.d("onResponse", "download success!")
            // Get main property that is located inside WeatherInfo class.
            val weatherInfo = response.body()
            this.weatherInfo = weatherInfo

            weatherInfo?.let {
                val cityValue = findViewById<TextView>(R.id.city_value)
                cityValue.text = weatherInfo?.name

                val tempValue = findViewById<TextView>(R.id.temp_value)
                tempValue.text = "${weatherInfo?.main?.temp.toString()}°"

                val windValue = findViewById<TextView>(R.id.wind_speed_value)
                windValue.text = "${weatherInfo?.wind.speed} MPH"
            }
        }
    }

    override fun onFailure(call: Call<WeatherInfo>, t: Throwable) {
        Log.e("onFailure", t.message!!)
    }
}