package com.example.itinerario_de_viaje

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val btnNuevoViaje = findViewById<Button>(R.id.btnNuevoViaje)
        val btnAsistenteIa = findViewById<Button>(R.id.btnAsistenteIa)
        val cardViaje1 = findViewById<View>(R.id.cardViaje1)

        btnNuevoViaje?.setOnClickListener {
            startActivity(Intent(this, AgregarActivity::class.java))
        }

        btnAsistenteIa?.setOnClickListener {
            startActivity(Intent(this, IaActivity::class.java))
        }

        cardViaje1?.setOnClickListener {
            startActivity(Intent(this, DetalleActivity::class.java))
        }
    }
}