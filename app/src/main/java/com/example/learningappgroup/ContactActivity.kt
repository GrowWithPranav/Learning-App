package com.example.learningappgroup

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        val pranav = findViewById<Button>(R.id.btnpranav)
        val yukta = findViewById<Button>(R.id.btnyukta)
        val sejal = findViewById<Button>(R.id.btnsejal)
        val sarthak = findViewById<Button>(R.id.btnsarthak)
        pranav.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:9172298185"))
            startActivity(intent)
        }
        yukta.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:8483058536"))
            startActivity(intent)
        }

        sejal.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:7020455820"))
            startActivity(intent)
        }
        sarthak.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:9022982346"))
            startActivity(intent)
        }
    }
}