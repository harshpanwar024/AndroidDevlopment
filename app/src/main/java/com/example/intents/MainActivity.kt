package com.example.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent=findViewById<Button>(R.id.intent)

        btnIntent.setOnClickListener()
        {
           intent=Intent(applicationContext,Second_MainActivity2::class.java)
            startActivity(intent)
        }

    }
}

