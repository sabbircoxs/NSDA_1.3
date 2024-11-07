package com.example.nsda_13

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.nsda_13.Joke
import com.example.nsda_13.JokeRepository

class JokeViewModel : ViewModel() {
    private val repository = JokeRepository()
    val joke: LiveData<Joke> = repository.joke
    val error: LiveData<String> = repository.error

    fun getNewJoke() {
        repository.fetchJoke()
    }
}
