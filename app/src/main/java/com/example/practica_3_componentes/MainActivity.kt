package com.example.practica_3_componentes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al botón
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        // Al hacer clic, ir a la nueva Activity
        button1.setOnClickListener {
            val intent = Intent(this, NewPlayer::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Preferences::class.java)
            startActivity(intent)
        }
    }
}