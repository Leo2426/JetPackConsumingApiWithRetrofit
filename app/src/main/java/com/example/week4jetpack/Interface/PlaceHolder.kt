package com.example.week4jetpack.Interface

import com.example.week4jetpack.Beans.Sitios
import retrofit2.Response
import retrofit2.http.GET

interface PlaceHolder {
    @GET("sitios.php")
    suspend fun getSitios(): Response<List<Sitios>>
}