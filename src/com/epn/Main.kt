package com.epn

import java.util.*
import com.epn.persona.Persona

fun main(args: Array<String>) {
 println("Hola")

    println("Ingresa tu nombre y pulsa enter: ")

    val persona = Persona("jorge", "17234567",
            "Condado", 234567, "dfgh")
    print(persona.toString())
}