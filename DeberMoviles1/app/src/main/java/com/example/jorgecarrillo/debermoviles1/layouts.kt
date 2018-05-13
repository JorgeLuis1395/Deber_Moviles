package com.example.jorgecarrillo.debermoviles1

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_layouts.*

class layouts : AppCompatActivity() {
    var arregloUsuarios: ArrayList<Usuario> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layouts)


        arregloUsuarios = Factory.usuarios
        val adaptadorUsuarios = ArrayAdapter<Usuario>(
                this,
                android.R.layout.activity_list_item,
                arregloUsuarios)


        val nombre = intent.getStringExtra("nombre")

        val usuarioSeleccionado= arregloUsuarios.get(0)

            textViewCedula.text= usuarioSeleccionado.cedula
            textViewNombre.text = usuarioSeleccionado.nombre
            textViewApellido.text = usuarioSeleccionado.apellido
            button3.setOnClickListener{v: View? ->  button3.setTextColor(Color.parseColor("blue"))
                button3.setBackgroundColor(Color.parseColor("yellow"))
                if (usuarioSeleccionado.like == true){
                    button3.setText("DisLike")}
                else
                    button9.setText("Like")
                }
        button4.setOnClickListener{v: View? -> detalle() }


        val usuarioSeleccionado1= arregloUsuarios.get(1)

        textViewced1.text= usuarioSeleccionado1.cedula
        nombre1.text = usuarioSeleccionado1.nombre
        textViewape1.text = usuarioSeleccionado1.apellido
        buttonlike.setOnClickListener{v: View? ->  buttonlike.setTextColor(Color.parseColor("red"))
            buttonlike.setBackgroundColor(Color.parseColor("blue"))
            if (usuarioSeleccionado1.like == true){
                buttonlike.setText("DisLike")}
            else
                button9.setText("Like")
        }
        buttondetalle.setOnClickListener{v: View? -> detalle() }


        val usuarioSeleccionado2= arregloUsuarios.get(2)

        textViewced2.text= usuarioSeleccionado2.cedula
        textViewnom2.text = usuarioSeleccionado2.nombre
        textViewape2.text = usuarioSeleccionado2.apellido
        button9.setOnClickListener{v: View? ->  button9.setTextColor(Color.parseColor("blue"))
            button9.setBackgroundColor(Color.parseColor("yellow"))
            if (usuarioSeleccionado2.like == true){
                button9.setText("DisLike")}
            else
                button9.setText("Like")
        }
        buttondetalle2.setOnClickListener{v: View? -> detalle() }


        textViewced3.text= usuarioSeleccionado.cedula
        textViewnom3.text = usuarioSeleccionado.nombre
        textViewapl3.text = usuarioSeleccionado.apellido
        buttonlike3s.setOnClickListener{ v: View? ->  buttonlike3s.setTextColor(Color.parseColor("blue"))
            buttonlike3s.setBackgroundColor(Color.parseColor("yellow"))
            if (usuarioSeleccionado.like == true){
                buttonlike3s.setText("DisLike")}
            else
                button9.setText("Like")
        }
        buttonDetalle3.setOnClickListener{v: View? -> detalle() }



    }
    fun detalle(){
        val intent = Intent(this, Descripcion::class.java)
        startActivity(intent)
    }

    }
