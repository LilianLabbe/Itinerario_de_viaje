package com.example.itinerario_de_viaje

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        btnRegistrar?.setOnClickListener {
            Toast.makeText(this, "Cuenta creada con éxito", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, ListaActivity::class.java))
            finish()
        }
    }
}