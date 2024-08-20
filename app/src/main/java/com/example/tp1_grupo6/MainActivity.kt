package com.example.tp1_grupo6

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.tp1_grupo6.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configuración del binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Puedes acceder a los elementos de la vista aquí, por ejemplo:
        // binding.textView.text = "Hello Android!"
    }
}