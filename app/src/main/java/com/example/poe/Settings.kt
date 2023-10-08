package com.example.poe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.collections.Map

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting)

        val backhome = findViewById<View>(R.id.imageButton3)
        backhome.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@Settings, MainActivity::class.java)
            startActivity(intent)
        }

    }
}