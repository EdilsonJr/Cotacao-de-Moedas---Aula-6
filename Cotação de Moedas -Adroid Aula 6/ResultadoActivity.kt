package com.example.aula6

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if(intent != null){
            val valor = intent.getStringExtra("vrValor")
            val moeda = intent.getStringExtra("vrMoeda")

            if(moeda == "dolar"){
                valor.toDouble() = valor * 5.35;
                resultado.text = valor;
            }
            else if(moeda == "euro"){
                valor.toDouble() = valor * 5.78;
                resultado.text = valor;
            }
            else if(moeda == "peso"){
                valor.toDouble() = valor * 0.082;
                resultado.text = valor;
            }
            else {
                resultado.text = "Moeda não está disponível"
            }
        }
    }

}