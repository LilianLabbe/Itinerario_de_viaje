package com.example.itinerario_de_viaje

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgregarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar)

        // Busca automáticamente el botón dentro de la pantalla sin depender de un ID específico
        val root = findViewById<ViewGroup>(android.R.id.content)
        encontrarPrimerBoton(root)?.setOnClickListener {
            Toast.makeText(this, "Itinerario guardado", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    private fun encontrarPrimerBoton(grupo: ViewGroup): Button? {
        for (i in 0 until grupo.childCount) {
            val hijo = grupo.getChildAt(i)
            if (hijo is Button) return hijo
            if (hijo is ViewGroup) {
                encontrarPrimerBoton(hijo)?.let { return it }
            }
        }
        return null
    }
}