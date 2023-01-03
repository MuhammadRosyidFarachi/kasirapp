package com.example.kasirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_login = findViewById(R.id.bt_login) as Button
        val bt_signin = findViewById(R.id.bt_login) as Button

        bt_login.setOnClickListener{
            val intent = Intent(this, daftarmenu::class.java)
            startActivity(intent)
        }

        bt_signin.setOnClickListener{
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }
}