package cs.mad.flashcards.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import cs.mad.flashcards.R
import cs.mad.flashcards.databinding.ActivityAdvancedStatsBinding
import cs.mad.flashcards.entities.WeatherInfo
import cs.mad.flashcards.services.WeatherService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

    override fun onResponse(call: Call<WeatherInfo>, response: Response<WeatherInfo>) {
        if (response.isSuccessful) {
            Log.d("onResponse", "download success!")
            // Get main property that is located inside WeatherInfo class.
            val weatherInfo = response.body()

            val cityValue = findViewById<TextView>(R.id.city_value)
            cityValue.text = weatherInfo?.name
        }
    }

    override fun onFailure(call: Call<WeatherInfo>, t: Throwable) {
        Log.e("onFailure", t.message!!)
    }
}