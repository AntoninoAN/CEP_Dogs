package com.example.cepdog.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

//https://dog.ceo/
//  https://dog.ceo/api/breeds/image/random/3 Fetch!
interface DogApi {
    @GET("api/breeds/image/random/{number}")
    suspend fun getDogs(@Path("number")
        numberInput: Int = 50): DoggyResponse

    companion object{
        fun getApi(): DogApi{
            return Retrofit.Builder()
                .baseUrl("https://dog.ceo/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DogApi::class.java)
        }
    }
}