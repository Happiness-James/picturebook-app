package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImageActivity5 : AppCompatActivity() {
    lateinit var btnprevious4:Button
    lateinit var btnhome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image5)
        btnprevious4 = findViewById(R.id.btnprevious4)
        btnprevious4.setOnClickListener {
            val intent = Intent(this, ImageActivity4::class.java)
            startActivity(intent)
        }
        btnhome = findViewById(R.id.btnhome)
        btnhome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}