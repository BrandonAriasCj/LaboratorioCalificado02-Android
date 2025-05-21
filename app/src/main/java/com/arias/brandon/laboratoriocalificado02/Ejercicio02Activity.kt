package com.arias.brandon.laboratoriocalificado02
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.arias.brandon.laboratoriocalificado02.databinding.RegistroPedidoBinding

class Ejercicio02Activity : AppCompatActivity() {

    private lateinit var binding: RegistroPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegistroPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            val nombre = binding.etNombre.text.toString().trim()
            val numero = binding.etNumero.text.toString().trim()
            val productos = binding.etProductos.text.toString().trim()
            val ciudad = binding.etCiudad.text.toString().trim()
            val direccion = binding.etDireccion.text.toString().trim()

            if (nombre.isEmpty() || numero.isEmpty() || productos.isEmpty() || ciudad.isEmpty() || direccion.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Redirigir a nueva pantalla con los datos
            val intent = Intent(this, PedidoActivity::class.java).apply {
                putExtra("nombre", nombre)
                putExtra("numero", numero)
                putExtra("productos", productos)
                putExtra("ciudad", ciudad)
                putExtra("direccion", direccion)
            }
            startActivity(intent)
        }
    }
}
