package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.conta


        //NÚMEROS
        binding.um.setOnClickListener {
            calculo.text = "${calculo.text}1"
        }
        binding.dois.setOnClickListener {
            calculo.text = "${calculo.text}2"
        }
        binding.tres.setOnClickListener {
            calculo.text = "${calculo.text}3"
        }
        binding.quatro.setOnClickListener {
            calculo.text = "${calculo.text}4"
        }
        binding.cinco.setOnClickListener {
            calculo.text = "${calculo.text}5"
        }
        binding.seis.setOnClickListener {
            calculo.text = "${calculo.text}6"
        }
        binding.sete.setOnClickListener {
            calculo.text = "${calculo.text}7"
        }
        binding.oito.setOnClickListener {
            calculo.text = "${calculo.text}8"
        }
        binding.nove.setOnClickListener {
            calculo.text = "${calculo.text}9"
        }
        binding.zero.setOnClickListener {
            calculo.text = "${calculo.text}0"
        }
        //OPERAÇÕES
        binding.fechaParenteses.setOnClickListener {
            calculo.text = "${calculo.text})"
        }
        binding.abertParenteses.setOnClickListener {
            calculo.text = "${calculo.text}("
        }
        binding.ponto.setOnClickListener {
            calculo.text = "${calculo.text}."
        }
        binding.multiplica.setOnClickListener {
            calculo.text = "${calculo.text}*"
        }
        binding.divide.setOnClickListener {
            calculo.text = "${calculo.text}/"
        }
        binding.menos.setOnClickListener {
            calculo.text = "${calculo.text}-"
        }
        binding.mais.setOnClickListener {
            calculo.text = "${calculo.text}+"
        }

        binding.backspace.setOnClickListener {
            calculo.text = calculo.text.dropLast(1)
        }

        binding.CE.setOnClickListener {
            calculo.text = ""
        }

        binding.igual.setOnClickListener {
            val resultadoCalculo = Expression(calculo.text.toString()).calculate()

            if (resultadoCalculo.isNaN()){
                binding.conta.text= "Entrada inválida!"
            }else{
                binding.conta.text = resultadoCalculo.toString()
            }

        }
    }
}