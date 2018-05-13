package com.example.jorgecarrillo.debermoviles1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            v: View? ->  irlayout()
        }
        button2.setOnClickListener{
            v: View? -> recicleview()
        }
    }
    fun irlayout(){
        val intent=Intent(this,Main2Activity::class.java)
        startActivity(intent)
    }
    fun recicleview(){
        val intent = Intent(this,CrearUsuario::class.java)
        startActivity(intent)
    }
}
