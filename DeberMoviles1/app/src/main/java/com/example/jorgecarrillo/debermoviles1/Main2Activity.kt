package com.example.jorgecarrillo.debermoviles1

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var personas = ArrayList<Persona>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        crearDatosPrueba()

        val layoutManager = LinearLayoutManager(this)
        personas.addAll(crearDatosPrueba())
        val adaptador = PersonasAdaptador(personas)
        recycler_view.layoutManager = layoutManager
        recycler_view.itemAnimator = DefaultItemAnimator()
        recycler_view.adapter = adaptador
        personas.addAll(crearDatosPrueba())
        adaptador.notifyDataSetChanged()
        Log.i("vista-principal", "Cambio personas ${personas.size}")
    }

    fun crearDatosPrueba(): ArrayList<Persona> {
        var personas = ArrayList<Persona>()
        personas.add(Persona("Jorge", "Carrillo", "1723358907","Cabello Castaño","13-07-1995","Like"))
        personas.add(Persona("Cristhian", "Lopez", "1718122213","Cabello Castaño","25-10-20055","No Like"))
        personas.add(Persona("Olga", "Ramirez", "18986525242","Cabello Castaño","23-11.1983","Like"))
        return personas
    }
    fun decripcion(){var intent=Intent(this,Descripcion::class.java)
        startActivity(intent)
    }
}

class Persona(var nombre: String, var apellido: String, var cedula: String, var descripcion:String, var fechaNaciminento:String, var like: String) {}

class PersonasAdaptador(private val listaPersonas: List<Persona>) : RecyclerView.Adapter<PersonasAdaptador.MyViewHolder>() {

    inner class MyViewHolder(view:  View) : RecyclerView.ViewHolder(view) {
        var nombre: TextView
        var apellido: TextView
        var cedula: TextView
        var like: Button
        var descripcion: Button

        init {
            nombre = view.findViewById(R.id.txtv_nombre) as TextView
            apellido = view.findViewById(R.id.txtv_apellido) as TextView
            cedula = view.findViewById(R.id.txtv_cedula) as TextView
            like=view.findViewById(R.id.buttonLike)as Button
            descripcion= view.findViewById(R.id.buttonDescripcion)as Button



            val left = apellido.paddingLeft
            val top = apellido.paddingTop
            Log.i("vista-principal", "Hacia la izquierda es $left y hacia arriba es $top")

            val layout = view.findViewById(R.id.relative_layout) as RelativeLayout
            layout.setOnClickListener({ v ->
                val nombreActual = v.findViewById(R.id.txtv_nombre) as TextView

                Log.i("vista-principal", "El nombre actual es: ${nombreActual.text}")
                nombreActual.text = "Otro texto"

            })
            cedula.setOnClickListener { v ->
                val cedulaActual = v.findViewById(R.id.txtv_cedula) as TextView
                val toast = Toast.makeText(v.context, "Hola ${cedulaActual.text}", Toast.LENGTH_LONG)
                toast.show()
                val intent = Intent(v.context, Main2Activity::class.java)
                startActivity(v.context, intent, null)

            }
            like.setOnClickListener{
                if(like.toString() == "Like")
                {
                    like.setText("No Like")
                    like.setBackgroundColor(Color.parseColor("Yellow"))
                }
                like.setText("No Like")
                like.setBackgroundColor(Color.parseColor("Yellow"))
            }
            like.setOnClickListener{

                like.setText("Like")
                like.setBackgroundColor(Color.parseColor("Yellow"))
            }
            descripcion.setOnClickListener{
                v: View? -> val intent2= Intent(v!!.context,Descripcion::class.java)
                startActivity(v.context,intent2,null)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.lista_fila_usuario, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val persona = listaPersonas[position]
        holder.nombre.setText(persona.nombre)
        holder.apellido.setText(persona.apellido)
        holder.cedula.setText(persona.cedula)
    }

    override fun getItemCount(): Int {
        return listaPersonas.size
    }



}
