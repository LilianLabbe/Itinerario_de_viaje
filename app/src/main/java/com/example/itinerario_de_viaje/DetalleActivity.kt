package com.example.itinerario_de_viaje

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val btnMarcarRealizado = findViewById<Button>(R.id.btnMarcarRealizado)
        val btnEditarViaje = findViewById<Button>(R.id.btnEditarViaje)
        val btnEliminarViaje = findViewById<Button>(R.id.btnEliminarViaje)

        btnMarcarRealizado?.setOnClickListener {
            Toast.makeText(this, "Itinerario marcado como realizado", Toast.LENGTH_SHORT).show()
            finish()
        }

        btnEditarViaje?.setOnClickListener {
            Toast.makeText(this, "Modo edición no disponible en la vista previa", Toast.LENGTH_SHORT).show()
        }

        btnEliminarViaje?.setOnClickListener {
            Toast.makeText(this, "Itinerario eliminado", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}