package com.epn

import java.io.FileWriter

class BaseDatos {
    private var listVehiculo = ArrayList<Vehiculo>()
    private var list = ArrayList<Persona>()
    private var listMecanica = ArrayList<Mecanica>()
    private var ced = 0
    private var pla = ""

    fun agregarCliente() {
        println("Ingrese el nombre")
        val nombre = readLine().toString()
        println("Ingrese la cedula del cliente")
        val cedula = readLine().toString().toInt()
        println("Ingrese la direccion")
        val direccion = readLine().toString()
        println("Ingrese el telefono")
        val telefono = readLine().toString()
        println("Ingrese el correo electronico")
        val correo = readLine().toString()
        val persona = Persona(nombre, cedula, direccion, telefono, correo)
        list.add(persona)
        println("Datos Ingresados")
        println(list)
        guardarInformacionPersonas(list.toString())
        ced= persona.cedula
    }
    fun agregarVehiculo() {
        println("Ingrese la placa del vehiculo")
        val placa = readLine().toString()
        println("Ingrese la marca del vehiculo")
        val marca = readLine().toString()
        println("Ingrese el modelo")
        val modelo = readLine().toString()
        val vehiculo = Vehiculo(ced, placa, marca, modelo)
        pla = vehiculo.placa
        listVehiculo.add(vehiculo)
        println("Datos Ingresados")
        println(listVehiculo)
        guardarInformacionVehiculo(listVehiculo.toString())

    }
    fun agregarMantenimiento() {
        println("Ingrese la descripción del mantenimiento")
        val descripcion = readLine().toString()
        println("Ingrese el total del Mantenimeinto")
        val total = readLine().toString().toDouble()
        val mantenimiento = Mecanica(ced,pla,descripcion,total)

        listMecanica.add(mantenimiento)
        println("Datos Ingresados")
        println(listMecanica)
        guardarInformacionMecanica(listMecanica.toString())

    }
    private fun guardarInformacionPersonas(str: String){
        try {
            val guardar= FileWriter("Personas.txt", true)
            guardar.write(str)
            guardar.close()
        }catch (ex:Exception){
            print(ex.message)
        }
    }
    private fun guardarInformacionVehiculo(str: String){
        try {
            val guardar= FileWriter("Vehiculo.txt", true)
            guardar.write(str)
            guardar.close()
        }catch (ex:Exception){
            print(ex.message)
        }
    }
    private fun guardarInformacionMecanica(str: String){
        try {
            val guardar= FileWriter("Mecanica.txt", true)
            guardar.write(str)
            guardar.close()
        }catch (ex:Exception){
            print(ex.message)
        }
    }
    fun consultarFactura( datos : Int){
        listMecanica.get(datos)
    }
}
