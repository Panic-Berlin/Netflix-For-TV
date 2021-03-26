package com.example.netflixfortv

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

/**
 * Loads [MainFragment].
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.hide();
    }

    fun onLookClick(view: View) {
        val randomIntent = Intent(this, MovieScreen::class.java);
        startActivity(randomIntent);
    }
}