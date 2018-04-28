package com.epn


class Persona(private var nombre : String, var cedula : Int, private var direccion: String, private var telefono: String, private var correo: String){
    override fun toString(): String {
        return "Persona '$nombre', $cedula, '$direccion', '$telefono', '$correo', '\n') "
    }


}