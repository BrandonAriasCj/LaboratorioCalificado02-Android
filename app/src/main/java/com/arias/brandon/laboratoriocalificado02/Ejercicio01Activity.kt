package com.arias.brandon.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.arias.brandon.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ocultar inicialmente el View verde (opcional)
        binding.cuadroVerde.visibility = View.GONE

        // Mostrar el cuadro verde
        binding.botonMostrar.setOnClickListener {
            binding.cuadroVerde.visibility = View.VISIBLE
        }

        // Ocultar el cuadro verde
        binding.botonOcultar.setOnClickListener {
            binding.cuadroVerde.visibility = View.GONE
        }
    }
}
