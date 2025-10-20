package com.example.practica_3_componentes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jugador = findViewById(R.id.button1) as Button

        jugador.setOnClickListener { lanzarNewPlayer() }
    }

    fun lanzarNewPlayer(){
            val i =Intent(this, NewPlayer::class.java)
            startActivity(i)
        }
}
