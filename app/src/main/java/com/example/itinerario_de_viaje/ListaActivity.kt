package com.example.itinerario_de_viaje

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val btnToggleTema = findViewById<ImageButton>(R.id.btnToggleTema)
        val btnNuevoViaje = findViewById<Button>(R.id.btnNuevoViaje)
        val btnAsistenteIa = findViewById<Button>(R.id.btnAsistenteIa)
        val cardViaje1 = findViewById<View>(R.id.cardViaje1)
        val cardViaje2 = findViewById<View>(R.id.cardViaje2)
        val cardViaje3 = findViewById<View>(R.id.cardViaje3)

        // Detecta si el tema actual es oscuro
        val isNightMode = (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES

        // Muestra el sol si estamos en modo oscuro (para alternar a claro), o la luna si estamos en claro
        if (isNightMode) {
            btnToggleTema?.setImageResource(R.drawable.ic_modo_sol)
        } else {
            btnToggleTema?.setImageResource(R.drawable.ic_modo_luna)
        }

        btnToggleTema?.setOnClickListener {
            if (isNightMode) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
        }

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