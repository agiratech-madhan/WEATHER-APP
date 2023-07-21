package com.example.weatherapp.network

import com.weatherapp.models.WeatherResponse
import retrofit.Call
import retrofit.http.GET
import retrofit.http.Query

// TODO (STEP 4: Create a WeatherService interface)
/**
 *https://api.openweathermap.org/data/2.5/weather?lat=57&lon=-2.15&appid={API key}&units=metric
 * */

interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String?,
        @Query("appid") appid: String?
    ): Call<WeatherResponse>
}