package com.epn

class Mecanica(var ced :  Int,var placa : String,var descripcion : String,var total: Double){
    override fun toString(): String {
        return "Mecanica(ced=$ced, placa='$placa', descripcion='$descripcion', total=$total)"
    }
}