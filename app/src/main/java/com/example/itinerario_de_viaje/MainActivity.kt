package com.example.itinerario_de_viaje

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToggleTema = findViewById<ImageButton>(R.id.btnToggleTema)
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        val tvIrRegistro = findViewById<TextView>(R.id.tvIrRegistro)

        // Detecta si el tema actual es oscuro
        val isNightMode = (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES

        // Muestra el sol si estamos en modo oscuro (para cambiar a claro), o la luna si estamos en modo claro
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

        btnIngresar?.setOnClickListener {
            startActivity(Intent(this, ListaActivity::class.java))
        }

        tvIrRegistro?.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }
    }
}