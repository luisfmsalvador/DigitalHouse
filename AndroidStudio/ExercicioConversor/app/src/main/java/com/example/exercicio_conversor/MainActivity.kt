package com.example.exercicio_conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnConverter).setOnClickListener{
            txtResultado.text = "%.2f °F".format(converterCelsiusToFahrenheit(edTemperatura.text.toString().toDouble()))
        }
    }
    
    fun converterCelsiusToFahrenheit(temperaturaCelsius:Double):Double{
        return temperaturaCelsius * 9 / 5 + 32
    }
}