fun main(args: Array<String>) {
    println("Hola Mundo!") //remplaza
    var nombre: String? = "Jorge"//variable que puede cambiar inicia con var
    var edad: Int = 22
    val edad_actual = 22 // Variable constante no puede ser cambiada
    var casado = false
    nombre = null
    //casado = "Jorge" //duck tipo
    //edad_actual= 29
    when (casado) {
        true -> {
            println("Esta Casado")
        }
        null -> {
            println("Aun no asignado")
        }
        else -> {
            println("No esta Casado")
        }
    }

    val superHeroe = if (casado) {
        "SuperMandarina"
    } else {
        "Superman"
    }

}