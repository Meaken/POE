package com.example.poe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val OpenLocation = findViewById<View>(R.id.buttonLocation1)
        OpenLocation.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@MainActivity, Map::class.java)
            startActivity(intent)
        }

        val OpenCreateSighting = findViewById<View>(R.id.buttonCreateSightings1)
        OpenCreateSighting.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@MainActivity, regSighting::class.java)
            startActivity(intent)
        }
        val OpenViewSighting = findViewById<View>(R.id.buttonViewSightings1)
        OpenViewSighting.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@MainActivity, DisplaySighting::class.java)
            startActivity(intent)
        }

        val OpenRare = findViewById<View>(R.id.buttonRarest1)
        OpenViewSighting.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@MainActivity, Checklist::class.java)
            startActivity(intent)
        }
        val openSettings = findViewById<View>(R.id.buttonSettings1)
        openSettings.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@MainActivity, Settings::class.java)
            startActivity(intent)
        }
        val Logout = findViewById<View>(R.id.buttonLogout1)
        Logout.setOnClickListener {
            // Create an Intent to open the SecondActivity
            val intent = Intent(this@MainActivity, LoginScreen::class.java)
            startActivity(intent)
        }

    }
}