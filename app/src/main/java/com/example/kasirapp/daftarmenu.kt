package com.example.kasirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class daftarmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftarmenu)

        val i_transaksi = findViewById(R.id.i_transaksi) as ImageView
        val i_daftarmenu = findViewById(R.id.i_daftarmenu) as ImageView
        val i_riwayat = findViewById(R.id.i_riwayat) as ImageView

        i_transaksi.setOnClickListener{
            val intent = Intent(this, transaksi::class.java)
            startActivity(intent)
        }
        i_daftarmenu.setOnClickListener{
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
        }
        i_riwayat.setOnClickListener{
            val intent = Intent(this, riwayat_transaksi::class.java)
            startActivity(intent)
        }
    }
}