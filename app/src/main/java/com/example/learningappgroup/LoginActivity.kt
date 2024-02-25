package com.example.learningappgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val contact = findViewById<Button>(R.id.cntact)
        contact.setOnClickListener {
            val intent = Intent(this,ContactActivity::class.java)
            startActivity(intent)
        }
    }
}