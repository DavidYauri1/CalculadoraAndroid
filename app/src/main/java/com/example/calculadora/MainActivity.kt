package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var numuno:Double=0.0
    private var numdos:Double=0.0
    private var operacion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        uno.setOnClickListener{ numerosPresionados("1")}
        dos.setOnClickListener{ numerosPresionados("2")}
        tres.setOnClickListener{ numerosPresionados("3")}
        cuatro.setOnClickListener({numerosPresionados("4")})
        cinco.setOnClickListener{numerosPresionados("5")}
        seis.setOnClickListener{numerosPresionados("6")}
        siete.setOnClickListener{numerosPresionados("7")}
        ocho.setOnClickListener{numerosPresionados("8")}
        nueve.setOnClickListener{numerosPresionados("9")}


    }
    private fun numerosPresionados(digito:String){
        resultadoTextView.text="${resultadoTextView.text}$digito"

    }
    private fun operaciones(operacion:Int){

    }
    companion object{
        const val suma= 1
        const val resta =2
        const val multi = 3
        const val division =4

    }

}