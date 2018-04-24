package com.epn


class Persona(var nombre : String,var cedula : String,var direccion: String,var telefono: String,var correo: String){

    override fun toString(): String {
       return("Se ha Ingresado la persona $nombre con cedula $cedula , direccion $direccion , telefono $telefono , correo $correo")

    }
}