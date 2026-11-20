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
        val cardViaje2 = findViewById<View>(R.id.cardViaje2)
        val cardViaje3 = findViewById<View>(R.id.cardViaje3)

        btnNuevoViaje?.setOnClickListener {
            startActivity(Intent(this, AgregarActivity::class.java))
        }

        btnAsistenteIa?.setOnClickListener {
            startActivity(Intent(this, IaActivity::class.java))
        }

        val abrirDetalle = View.OnClickListener {
            startActivity(Intent(this, DetalleActivity::class.java))
        }

        cardViaje1?.setOnClickListener(abrirDetalle)
        cardViaje2?.setOnClickListener(abrirDetalle)
        cardViaje3?.setOnClickListener(abrirDetalle)
    }
}