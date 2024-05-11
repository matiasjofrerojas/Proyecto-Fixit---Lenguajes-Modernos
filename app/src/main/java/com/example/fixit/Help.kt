package com.example.fixit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.fixit.R

class Help : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
    }

    fun llamar(view: View) {
        // Crear un intent para iniciar la aplicación de marcado de teléfono con el número deseado
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:+56934709635")
        startActivity(intent)
    }

    fun correoEnviar(view: View) {
        // Crear un intent para iniciar la aplicación de correo electrónico con la dirección deseada
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:fixit@gmail.com")
        startActivity(intent)
    }
}