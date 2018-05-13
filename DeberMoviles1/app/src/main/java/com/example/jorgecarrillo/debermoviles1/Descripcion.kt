package com.example.jorgecarrillo.debermoviles1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_descripcion.*
import kotlinx.android.synthetic.main.activity_main.*

class Descripcion : AppCompatActivity() {
    var arregloUsuarios: ArrayList<Usuario> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descripcion)
        arregloUsuarios = Factory.usuarios
        val adaptadorUsuarios = ArrayAdapter<Usuario>(
                this,
                android.R.layout.activity_list_item,
                arregloUsuarios)


        val nombre = intent.getStringExtra("nombre")


        val usuarioSeleccionado= arregloUsuarios.get(0)
        textView8.text=usuarioSeleccionado.nombre
        textView9.text=usuarioSeleccionado.Descripcion
        button5.setOnClickListener{
            v: View? -> regresar()
        }
        val usuarioSeleccionado1= arregloUsuarios.get(1)
        textView8.text=usuarioSeleccionado1.nombre
        textView9.text=usuarioSeleccionado1.Descripcion
        button5.setOnClickListener{
            v: View? -> regresar()
        }
        val usuarioSeleccionado2= arregloUsuarios.get(2)
        textView8.text=usuarioSeleccionado2.nombre
        textView9.text=usuarioSeleccionado2.Descripcion
        button5.setOnClickListener{
            v: View? -> regresar()
        }
        //val usuarioSeleccionado= arregloUsuarios.get(0)
        textView8.text=usuarioSeleccionado.nombre
        textView9.text=usuarioSeleccionado.Descripcion
        button5.setOnClickListener{
            v: View? -> regresar()
        }
    }
    fun regresar(){
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
