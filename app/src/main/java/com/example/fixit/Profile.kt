package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_especialista)
    }

    fun backHome(View: View){
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }
}