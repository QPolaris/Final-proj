package cs.mad.flashcards.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.annotation.RequiresApi
import cs.mad.flashcards.R
import cs.mad.flashcards.databinding.ActivityAdvancedStatsBinding
import cs.mad.flashcards.entities.WeatherInfo
import cs.mad.flashcards.services.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.time.Instant
import java.time.ZoneId

class AdvancedStats : AppCompatActivity(), Callback<WeatherInfo> {
    private lateinit var binding: ActivityAdvancedStatsBinding
    private lateinit var service: WeatherService
    val API_KEY = "0af6e62f4ea0c9d0d46f5e69e763805d"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_stats)
        binding = ActivityAdvancedStatsBinding.inflate(layoutInflater)

        service = WeatherService()
        val lat = this.intent.extras?.getString("Lat")?.toDouble()
        val lon = this.intent.extras?.getString("Lon")?.toDouble()

        if(lat != null && lon != null) {
            service.weatherService.getWeatherByCoord(lat, lon,
                API_KEY).enqueue(this)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onResponse(call: Call<WeatherInfo>, response: Response<WeatherInfo>) {
        if (response.isSuccessful) {
            Log.d("onResponse", "download success!")
            // Get main property that is located inside WeatherInfo class.
            val weatherInfo = response.body()

            val cityValue = findViewById<TextView>(R.id.city_value)
            cityValue.text = weatherInfo?.name

            val minTemp = findViewById<TextView>(R.id.min_temp_value)
            minTemp.text = "${weatherInfo?.main?.temp_min.toString()}°F"

            val maxTemp = findViewById<TextView>(R.id.max_temp_value)
            maxTemp.text = "${weatherInfo?.main?.temp_max.toString()}°F"

            val humidity = findViewById<TextView>(R.id.humidity_value)
            humidity.text = "${weatherInfo?.main?.humidity.toString()}%"

            val description = findViewById<TextView>(R.id.description_value)
            description.text = weatherInfo?.weather?.get(0)?.description

            val feelsLike = findViewById<TextView>(R.id.feels_like_value)
            feelsLike.text = "${weatherInfo?.main?.feels_like}°F"

            val sunrise = findViewById<TextView>(R.id.sunrise_value)
            val sunriseUnix = weatherInfo?.sys?.sunrise?.toLong() ?: 0
            val sunriseInstant = Instant.ofEpochSecond(sunriseUnix).atZone(ZoneId.systemDefault()).toLocalDateTime()
            sunrise.text = sunriseInstant.toLocalTime().toString()

            val sunset = findViewById<TextView>(R.id.sunset_value)
            val sunsetUnix = weatherInfo?.sys?.sunset?.toLong() ?: 0
            val sunsetInstant = Instant.ofEpochSecond(sunsetUnix).atZone(ZoneId.systemDefault()).toLocalDateTime()
            sunset.text = sunsetInstant.toLocalTime().toString()
        }
    }

    override fun onFailure(call: Call<WeatherInfo>, t: Throwable) {
        Log.e("onFailure", t.message!!)
    }
}