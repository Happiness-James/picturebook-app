package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImageActivity2 : AppCompatActivity() {
    lateinit var btnprevious:Button
    lateinit var btnnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)
        btnprevious = findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnnext2 = findViewById(R.id.btnnext2)
        btnnext2.setOnClickListener {
            val intent = Intent(this, ImageActivity3::class.java)
            startActivity(intent)
        }
    }
}