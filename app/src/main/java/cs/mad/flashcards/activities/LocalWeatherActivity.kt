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


class LocalWeatherActivity : AppCompatActivity(), Callback<WeatherInfo> {
    private lateinit var binding: ActivityLocalWeatherBinding
    val API_KEY = "0af6e62f4ea0c9d0d46f5e69e763805d"
    var zipCode = 35218

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocalWeatherBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_local_weather)

        WeatherService().weatherService.getWeatherInfo(zipCode, API_KEY).enqueue(this)
    }

    override fun onResponse(
        call: Call<WeatherInfo>,
        response: Response<WeatherInfo>
    ) {
        if (response.isSuccessful) {
            Log.d("onResponse", "download success!")
            // Get main property that is located inside WeatherInfo class.
            val weatherInfo = response.body()?.main
            weatherInfo?.let {
                // Update Textview
                // val textView = binding.jsonView
                // textView.text = weatherInfo.toString()
                val textView = findViewById<TextView>(R.id.json_view)
                textView.text = weatherInfo.toString()
                println(weatherInfo.toString())
            }
        }
    }

    override fun onFailure(call: Call<WeatherInfo>, t: Throwable) {
        Log.e("onFailure", t.message!!)
    }
}