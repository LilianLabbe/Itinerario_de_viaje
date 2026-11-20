package com.example.itinerario_de_viaje

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ia)

        val etPromptIa = findViewById<EditText>(R.id.etPromptIa)
        val btnPreguntarIa = findViewById<Button>(R.id.btnPreguntarIa)
        val tvRespuestaIa = findViewById<TextView>(R.id.tvRespuestaIa)

        btnPreguntarIa?.setOnClickListener {
            val prompt = etPromptIa?.text?.toString()?.trim().orEmpty()
            if (prompt.isNotEmpty()) {
                tvRespuestaIa?.text = "Sugerencia generada para \"$prompt\":\n\n• Día 1: Recorrido histórico y centro urbano.\n• Día 2: Parque natural y atracciones gastronómicas.\n• Día 3: Actividades culturales y tiempo libre."
            } else {
                tvRespuestaIa?.text = "Sugerencia generada:\n\n• Día 1: Recorrido histórico y centro urbano.\n• Día 2: Parque natural y atracciones gastronómicas."
            }
        }
    }
}