package com.example.starteraplication.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.starteraplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        val textCreateAccount = findViewById<TextView>(R.id.text_create_acc)
        val inputLogin = findViewById<EditText>(R.id.input_login)

        btnLogin.setOnClickListener {
            textCreateAccount.text = inputLogin.text
        }
    }
}