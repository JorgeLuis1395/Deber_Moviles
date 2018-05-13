package com.example.jorgecarrillo.debermoviles1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_crear_usuario.*

class CrearUsuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario)
        buttonCrearUsuario.setOnClickListener{
            v: View? ->  crearUsuario()
        }
    }
    fun crearUsuario(){
        val cedula=editTextCedula.text.toString()
        val nombre=editTextNombre.text.toString()
        val apellido= editTextApellido.text.toString()
        val descripcion=editTextDescripcion.text.toString()
        val fechaNacimiento= editTextFechaNacimiento.text.toString()
        Factory.usuarios.add(Usuario(cedula,nombre,apellido,descripcion,fechaNacimiento,true))
    }
    fun irlayout(){
        val intent=Intent(this,layouts::class.java)
        startActivity(intent)
    }
}
