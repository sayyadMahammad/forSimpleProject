package com.example.sampleapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "fc769d34-4b26-4e0a-a4cf-986f71171bd8",
            Analytics::class.java, Crashes::class.java
        )

        var image = findViewById<ImageView>(R.id.imageView)
        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            image.setImageResource(R.drawable.billions)
        }
    }
}