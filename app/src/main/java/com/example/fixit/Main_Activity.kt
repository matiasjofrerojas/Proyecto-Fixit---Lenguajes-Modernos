package com.example.fixit

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnInicio: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.portada)

        // Inicializar el botón
        btnInicio = findViewById(R.id.btnInicio)

        // Configurar el clic del botón
        btnInicio.setOnClickListener {
            val intent = Intent(this@MainActivity, OtraActividad::class.java)
            startActivity(intent)
        }
    }
}

class OtraActividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seleccion_usuario)
    }
}
