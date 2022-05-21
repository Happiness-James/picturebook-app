package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ImageActivity3 : AppCompatActivity() {
    lateinit var btnprevious2:Button
    lateinit var btnnext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image3)
        btnprevious2 = findViewById(R.id.btnprevious2)
        btnprevious2.setOnClickListener {
            val intent = Intent(this, ImageActivity2::class.java)
            startActivity(intent)
        }
        btnnext3 = findViewById(R.id.btnnext3)
        btnnext3.setOnClickListener {
            val intent = Intent(this, ImageActivity4::class.java)
            startActivity(intent)
        }
    }
}