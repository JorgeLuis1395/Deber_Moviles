package com.epn

fun main(args: Array<String>) {
    val datos = BaseDatos()
    val arc = Factura()
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
            println("Ingrese 3 para agregar Mantenimiento")
            println("Ingrese 4 para leer Factura")
            println("Ingrese 5 para consultar Factura")
            println("Ingrese 0 para Salir")
            val x = readLine().toString().toInt()
            when (x) {
                1 -> {
                    datos.agregarCliente()

                    println("Cliente Ingresado con Exito!!!!!!!")
                }
                2 -> {
                    datos.agregarVehiculo()
                }
                3 -> {
                    datos.agregarMantenimiento()
                }
                4 -> {
                    arc.leerFactura()
                }
                5 ->{
                    println("Ingrese la factura a consultar")
                    val y = readLine().toString().toInt()
                    println("Los datos de factura a consultar es")
                    datos.consultarFactura(y)
                }

                0 ->{
                 System.exit(0)
                }
            }
        } else {
            intentos += 1

        }
    }
}





