package com.example.practica_3_componentes

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.newplayer)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //  Código del Spinner
        val telefonos = arrayOf("Teléfono 1", "Teléfono 2", "Teléfono 3", "Teléfono 4", "Teléfono 5")

        val spinnerPhone: Spinner = findViewById(R.id.spinnerPhone)
        val editTextPhone: EditText = findViewById(R.id.editTextPhone)

        val adaptador = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            telefonos
        )
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPhone.adapter = adaptador

        spinnerPhone.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val seleccionado = parent.getItemAtPosition(position).toString()
                editTextPhone.setText(seleccionado)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                editTextPhone.setText("")
            }
        }
    }
}
