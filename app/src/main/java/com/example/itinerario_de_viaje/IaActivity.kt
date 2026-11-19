package com.example.itinerario_de_viaje

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ia)

        val btnPreguntarIa = findViewById<Button>(R.id.btnPreguntarIa)
        val tvRespuestaIa = findViewById<TextView>(R.id.tvRespuestaIa)

        btnPreguntarIa?.setOnClickListener {
            tvRespuestaIa?.text = "Sugerencia generada: Día 1 recorrido histórico, Día 2 parque natural y gastronomía local."
        }
    }
}