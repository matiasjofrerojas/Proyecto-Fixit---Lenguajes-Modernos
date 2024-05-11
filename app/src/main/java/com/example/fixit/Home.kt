package com.example.fixit

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
    }

    fun openProfile (view: View){
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
}
