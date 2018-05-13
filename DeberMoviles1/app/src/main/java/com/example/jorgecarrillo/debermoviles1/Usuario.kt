package com.example.jorgecarrillo.debermoviles1

import java.util.*

class Usuario constructor(var cedula: String,
                          var nombre: String,
                          var apellido: String,
                          var Descripcion: String,
                            var Fecha_Nacimiento:String,
                          var like: Boolean) {

    override fun toString(): String {
        return "com.example.jorgecarrillo.debermoviles1.Usuario(cedula=$cedula, nombre='$nombre', apellido='$apellido', Descripcion='$Descripcion', Fecha_Nacimiento=$Fecha_Nacimiento, like=$like)"
    }
}