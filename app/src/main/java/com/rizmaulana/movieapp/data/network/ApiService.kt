package com.rizmaulana.movieapp.data.network

import com.rizmaulana.movieapp.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET( "/shows")
    suspend fun getAllMovies() : Response<List<Movies>>
}