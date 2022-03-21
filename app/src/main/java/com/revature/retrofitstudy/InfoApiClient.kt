package com.revature.retrofitstudy

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object InfoApiClient {

    var BASE_URL ="https://quotable.io/"
    fun createInfoApiClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}