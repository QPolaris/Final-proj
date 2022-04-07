package cs.mad.flashcards.services

import cs.mad.flashcards.entities.WeatherInfo
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class WeatherService() {
    companion object {
        val API_KEY = "0af6e62f4ea0c9d0d46f5e69e763805d"
        val BASE_URL = "http://api.openweathermap.org"
    }

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openweathermap.org/data/2.5/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val weatherService = retrofit.create(IWeatherService::class.java)

    interface IWeatherService {
        @GET("weather?us&units=imperial")
        fun getWeatherInfo(@Query("zip") zipCode: Int,
        @Query("appid") API_KEY: String): Call<WeatherInfo>
    }
}