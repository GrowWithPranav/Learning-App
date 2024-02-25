package com.example.learningappgroup

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoView = findViewById<VideoView>(R.id.video)
        val offlineUri = Uri.parse("android.resource://$packageName/${R.raw.splash2}")
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()

        Handler().postDelayed(Runnable {
            val intent = Intent(this,signinActivity::class.java)
            startActivity(intent)
        },3000)

    }
}