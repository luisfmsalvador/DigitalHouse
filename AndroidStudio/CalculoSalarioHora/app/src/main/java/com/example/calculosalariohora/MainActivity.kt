package com.example.calculosalariohora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            var horasTrabalhadas = 0
            try {
                horasTrabalhadas = edHorasTrabalhadas.text.toString().toInt()
            } catch (e:Exception){

            }

            var valorHora = 0.0
            try {
                valorHora = edValorHora.text.toString().toDouble()
            } catch(e:Exception){}

            if (horasTrabalhadas == 0) {
                println("Informe a quantidade de horas trabalhadas")
            } else if (valorHora == 0.0) {
                println("Informe o valor da horas")
            } else {
                txtResultado.text = "R$ " + "%.2f".format(salarioHora(horasTrabalhadas,valorHora))
            }
        }           
    }

    fun salarioHora(horasTrabalhadas:Int, valorHora:Double):Double{
        return horasTrabalhadas * valorHora
    }
}