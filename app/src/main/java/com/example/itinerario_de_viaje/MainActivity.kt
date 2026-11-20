package com.example.itinerario_de_viaje

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        val tvIrRegistro = findViewById<TextView>(R.id.tvIrRegistro)

        btnIngresar?.setOnClickListener {
            startActivity(Intent(this, ListaActivity::class.java))
        }

        tvIrRegistro?.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }
    }
}