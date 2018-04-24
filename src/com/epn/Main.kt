package com.epn

fun main(args: Array<String>) {
    var datos = BaseDatos()
    println("Ingrese el usuario")
    val usuario = readLine().toString()
    println("Ingrese la contrasena")
    val contrasena = readLine().toString()
    var intentos = 0
    while (intentos < 3) {
        if (usuario == "admin" && contrasena == "admin123") {
            println("Menu de Opciones")
            println("Ingrese 1 para agregar un Nuevo Cliente")
            println("Ingrese 2 para agregar un Nuevo Vehiculo")
            println("Ingrese 3 para Consultar un Cliente")
            println("Ingrese 4 para Consultar un Vehiculo")
            val x = readLine().toString().toInt()
            if (x == 1) {
                datos.agregarCliente()
                println("Cliente Ingresado con Exito!!!!!!!")

            } else {
                if (x == 2) {
                    datos.agregarVehiculo()
                }
                if (x == 3) {
                    datos.consultar()
                }
            }
        } else {
            intentos= intentos +1
            println(" ******* Acceso Incorrecto Intente de Nuevo =( ******")
        }
    }
}





