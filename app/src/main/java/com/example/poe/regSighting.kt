package com.example.poe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.collections.Map

class regSighting : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registersighting)

        val backhome = findViewById<View>(R.id.imageButton1)
        backhome.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@regSighting, MainActivity::class.java)
            startActivity(intent)
        }
    }
}