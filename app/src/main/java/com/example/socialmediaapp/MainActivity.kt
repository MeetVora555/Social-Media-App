package com.example.socialmediaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnstart = findViewById<Button>(R.id.start)
        btnstart.setOnClickListener {
            val intent = Intent (this,Login::class.java)
            startActivity(intent)
        }
    }
}