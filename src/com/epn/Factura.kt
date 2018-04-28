package com.epn

import java.io.FileReader
class Factura(){
    fun leerFactura(){
        try {
            var leer= FileReader("Mecanica.txt")
            var c: Int?
            do {
                c= leer.read()
                print(c.toChar())
            } while(c!= -1)
        }catch (ex: Exception){
            print(ex.message)
        }
    }
}
