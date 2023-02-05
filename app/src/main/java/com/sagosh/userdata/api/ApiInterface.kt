package com.sagosh.userdata.api

import com.sagosh.userdata.model.usres
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/users")
    suspend fun getUsers() : Response<usres>
}