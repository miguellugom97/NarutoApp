package com.miguellugo.narutoapp.data.remote

import com.miguellugo.narutoapp.domain.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NarutoApi {

    @GET("/naruto/ninjas")
    suspend fun getAllNinjas(
        @Query("page") page: Int = 1
    ) : ApiResponse

    @GET("/naruto/ninjas/search")
    suspend fun searchNinjas(
        @Query("name") name: String
    ) : ApiResponse

}