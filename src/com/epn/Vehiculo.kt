package com.epn

import java.util.*

class Vehiculo(var placa : String,var marca : String,var modelo: String){

    override fun toString(): String {
        return ("Se ha Ingresado el vehiculo con $placa  Marca $marca , Modelo $modelo")
    }
}