package com.example.itinerario_de_viaje

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        // Detecta automáticamente el botón en activity_detalle.xml sin fallar por nombre de ID
        val root = findViewById<ViewGroup>(android.R.id.content)
        encontrarPrimerBoton(root)?.setOnClickListener {
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