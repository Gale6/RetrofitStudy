package com.revature.retrofitstudy

import retrofit2.Response
import retrofit2.http.GET

interface InfoFetchApi {

    @GET("quotes")

    suspend fun getInfo(): Response<Meta>
}