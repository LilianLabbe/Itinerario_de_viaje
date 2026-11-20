package com.example.itinerario_de_viaje

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgregarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar)

        val btnGuardarViaje = findViewById<Button>(R.id.btnGuardarViaje)
        btnGuardarViaje?.setOnClickListener {
            Toast.makeText(this, "Itinerario guardado", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}