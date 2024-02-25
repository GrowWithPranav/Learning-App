package com.example.learningappgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class signinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val textView = findViewById<TextView>(R.id.textView)
        val l = "Welcome to TechLearn Academy\n" +
                "Let’s begin the adventure"
        val b3 = findViewById<Button>(R.id.button3)
        val st = StringBuilder()
        Thread{
            for (letter in l){
                st.append(letter)
                Thread.sleep(100)
                runOnUiThread {
                    textView.text=st.toString()
                }
            }

        }.start()

        b3.setOnClickListener {
            val intent = Intent (this,LoginActivity::class.java)
            startActivity(intent)


            }


    }
}