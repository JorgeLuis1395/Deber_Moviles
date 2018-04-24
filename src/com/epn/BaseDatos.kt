package com.epn

import com.epn.Persona
import com.epn.Vehiculo

class BaseDatos() {
    var listVehiculo = ArrayList<Vehiculo>()
    var list = ArrayList<Persona>()
    fun agregarCliente() {
        println("Ingrese el nombre")
        val nombre = readLine().toString()
        println("Ingrese la cedula del cliente")
        val cedula = readLine().toString()
        println("Ingrese la direccion")
        val direccion = readLine().toString()
        println("Ingrese el telefono")
        val telefono = readLine().toString()
        println("Ingrese el telefono")
        val correo = readLine().toString()
        val persona = Persona(nombre, cedula, direccion, telefono, correo)
        list.add(persona)
        println("Datos Ingresados")
        println(list)
    }
    fun agregarVehiculo() {
        println("Ingrese la placa del vehiculo")
        val placa= readLine().toString()
        println("Ingrese la marca del vehiculo")
        val marca = readLine().toString()
        println("Ingrese el modelo")
        val modelo = readLine().toString()
        val vehiculo = Vehiculo(placa, marca, modelo)
        listVehiculo.add(vehiculo)
        println("Datos Ingresados")
        println(listVehiculo)
    }
    fun consultar(){

    }
}