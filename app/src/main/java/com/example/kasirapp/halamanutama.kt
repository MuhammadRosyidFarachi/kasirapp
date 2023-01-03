package com.example.kasirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class halamanutama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanutama)
            val i_login = findViewById(R.id.i_login) as ImageView
            val i_register = findViewById(R.id.i_register) as ImageView

        i_login.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        i_register.setOnClickListener{
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }
}