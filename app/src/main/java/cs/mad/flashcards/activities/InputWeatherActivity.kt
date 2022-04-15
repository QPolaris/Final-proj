package cs.mad.flashcards.activities

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import cs.mad.flashcards.R
import cs.mad.flashcards.databinding.ActivityLocalWeatherBinding
import cs.mad.flashcards.entities.WeatherInfo
import cs.mad.flashcards.services.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class InputWeatherActivity : AppCompatActivity(), Callback<WeatherInfo> {
    private lateinit var binding: ActivityLocalWeatherBinding
    val API_KEY = "0af6e62f4ea0c9d0d46f5e69e763805d"
    var zipCode = 35124

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocalWeatherBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_local_weather)
        val extras = intent.extras
        if (extras != null) {
            zipCode = extras.getInt("key")
        }
        WeatherService().weatherService.getWeatherInfo(zipCode, API_KEY).enqueue(this)
    }

    override fun onResponse(
        call: Call<WeatherInfo>,
        response: Response<WeatherInfo>
    ) {
        if (response.isSuccessful) {
            Log.d("onResponse", "download success!")
            // Get main property that is located inside WeatherInfo class.
            val weatherInfo = response.body()
            weatherInfo?.let {
                // Update Textview
                // val textView = binding.jsonView
                // textView.text = weatherInfo.toString()
                val cityValue = findViewById<TextView>(R.id.city_value)
                cityValue.text = "${weatherInfo?.name?.toString()}"
                val tempValue = findViewById<TextView>(R.id.temp_value)
                tempValue.text = "${weatherInfo?.main?.temp.toString()}°"
                println(weatherInfo.toString())

                val windValue = findViewById<TextView>(R.id.wind_speed_value)
                windValue.text = "${weatherInfo?.wind.speed} MPH"
            }
        }
    }

    override fun onFailure(call: Call<WeatherInfo>, t: Throwable) {
        Log.e("onFailure", t.message!!)
    }
}