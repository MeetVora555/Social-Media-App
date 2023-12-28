package com.example.socialmediaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val txtlogin = findViewById<TextView>(R.id.txtlogin)
        txtlogin.setOnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }

        val register = findViewById<Button>(R.id.btnreg)
        register.setOnClickListener {
            val intent = Intent(this,BottomNavigation::class.java)
            startActivity(intent)
        }
    }
}