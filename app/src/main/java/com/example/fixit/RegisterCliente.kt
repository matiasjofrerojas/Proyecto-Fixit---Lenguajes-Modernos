package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class RegisterCliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_cliente)
    }

    fun ReturnRegisterUser(view: View) {
        val intent = Intent(this, SelectUser::class.java)
        startActivity(intent)
    }

}

