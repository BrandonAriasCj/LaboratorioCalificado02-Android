package com.arias.brandon.laboratoriocalificado02

data class Contacto(
    val nombre: String,
    val telefono: String,
    val email: String
)

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("✅ Contacto agregado correctamente.\n")
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("📭 No hay contactos en la agenda.\n")
        } else {
            println("📒 Lista de contactos:")
            contactos.forEach { println("👤 $it") }
            println()
        }
    }

    fun buscarContactoPorNombre(nombre: String) {
        val encontrados = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }

        if (encontrados.isEmpty()) {
            println("❌ No se encontraron contactos con el nombre \"$nombre\".\n")
        } else {
            println("🔍 Contactos encontrados:")
            encontrados.forEach { println("👤 $it") }
            println()
        }
    }
}

fun main() {
    val agenda = Agenda()

    while (true) {
        println("=== 📇 Agenda de Contactos ===")
        println("1. ➕ Agregar contacto")
        println("2. 📋 Listar contactos")
        println("3. 🔍 Buscar contacto por nombre")
        println("4. 🚪 Salir")
        print("Elige una opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Nombre: ")
                val nombre = readLine().orEmpty()
                print("Teléfono: ")
                val telefono = readLine().orEmpty()
                print("Email: ")
                val email = readLine().orEmpty()
                agenda.agregarContacto(Contacto(nombre, telefono, email))
            }
            2 -> agenda.listarContactos()
            3 -> {
                print("Introduce el nombre a buscar: ")
                val nombre = readLine().orEmpty()
                agenda.buscarContactoPorNombre(nombre)
            }
            4 -> {
                println("👋 Saliendo de la agenda...")
                break
            }
            else -> println("⚠️ Opción no válida.\n")
        }
    }
}
