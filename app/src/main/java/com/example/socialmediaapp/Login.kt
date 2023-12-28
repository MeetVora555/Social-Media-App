package com.example.socialmediaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val reg = findViewById<TextView>(R.id.txtregister)
        reg.setOnClickListener {
            val intent = Intent(this,register::class.java)
            startActivity(intent)
        }

        val login = findViewById<Button>(R.id.btnlogin)
        login.setOnClickListener {
            val intent = Intent(this,BottomNavigation::class.java)
            startActivity(intent)
        }
    }

}