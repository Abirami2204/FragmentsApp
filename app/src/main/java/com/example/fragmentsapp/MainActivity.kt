package com.example.fragmentsapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBasic = findViewById<Button>(R.id.btnBasic)
        val btnMarks = findViewById<Button>(R.id.btnMarks)

        // Default fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, BasicFragment())
            .commit()

        btnBasic.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, BasicFragment())
                .commit()
        }

        btnMarks.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, MarksFragment())
                .commit()
        }
    }
}