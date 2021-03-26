package com.example.netflixfortv

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MovieScreen : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_screen)
        actionBar?.hide();
    }
}