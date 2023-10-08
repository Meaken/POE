package com.example.poe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.collections.Map

class DisplaySighting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.displaysighting)

        val gohome = findViewById<View>(R.id.imageButton2)
        gohome.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@DisplaySighting, MainActivity::class.java)
            startActivity(intent)
        }

    }
}