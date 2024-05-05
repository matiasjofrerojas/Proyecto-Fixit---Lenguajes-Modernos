package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RegisterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registros)
    }

    fun OpenRegisterUser(view: View) {
        val intent = Intent(this, RegisterUser2::class.java)
        startActivity(intent)
    }

}