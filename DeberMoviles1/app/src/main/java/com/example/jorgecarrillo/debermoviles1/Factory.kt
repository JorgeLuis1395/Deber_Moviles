package com.example.jorgecarrillo.debermoviles1

class Factory {
    companion object {
        var usuarios:ArrayList<Usuario> = ArrayList()

        init {
            usuarios.add(Usuario("1723358907", "Jorge", "Carrillo", "Divertido, amigable","1995/07/13", true))
            usuarios.add(Usuario("1726358809", "Aracely", "Flores","feliz","1993/11/08",true))
            usuarios.add(Usuario("1726352345", "Cristhian", "Carrillo","feliz","2005/11/08",false))
        }

    }
}