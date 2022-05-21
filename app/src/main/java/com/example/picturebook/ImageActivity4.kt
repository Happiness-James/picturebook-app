package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImageActivity4 : AppCompatActivity() {
    lateinit var btnprevious3:Button
    lateinit var btnnext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image4)
        btnprevious3 = findViewById(R.id.btnprevious3)
        btnprevious3.setOnClickListener {
            val intent = Intent(this, ImageActivity3::class.java)
            startActivity(intent)
        }
        btnnext4 = findViewById(R.id.btnnext4)
        btnnext4.setOnClickListener {
            val intent = Intent(this, ImageActivity5::class.java)
            startActivity(intent)
        }
    }
}