package com.example.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image = findViewById<ImageView>(R.id.imageView)
        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            image.setImageResource(R.drawable.billions)
        }
    }
}