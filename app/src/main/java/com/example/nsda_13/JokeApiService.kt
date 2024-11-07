package com.example.nsda_13

import com.example.nsda_13.Joke
import retrofit2.Call
import retrofit2.http.GET

interface JokeApiService {
    @GET("random_joke")
    fun getRandomJoke(): Call<Joke>
}
