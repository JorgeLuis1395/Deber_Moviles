package com.epn

class Vehiculo(private var ced :  Int, var placa : String, private var marca : String, private var modelo: String){

    override fun toString(): String {
        return ("El cliente con cedula $ced ,ha Ingresado el vehiculo con $placa,  Marca $marca , Modelo $modelo, '\n'")
    }
}