package com.example.fixit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterUser2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_parte2)
    }

    fun OpenMenuInicio(view: View) {
        val intent = Intent(this, MenuInicio::class.java)
        startActivity(intent)
    }
}