package com.epn.persona


class Persona(var nombre : String,var cedula : String,var direccion: String,var telefono: Int,var correo_electronico: String){

    override fun toString(): String {
        return "Se ha Ingresado la persona $nombre con cedula $cedula , direccion $direccion , telefono $telefono , correo $correo_electronico"
    }
}