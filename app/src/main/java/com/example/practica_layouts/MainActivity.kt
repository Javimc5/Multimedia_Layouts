package com.example.practica_layouts

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pressMeButton = findViewById<Button>(R.id.button)
        pressMeButton.setOnClickListener {
            setContentView(R.layout.activity_second)
        }
    }

}
