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


        fun adicionarTexto(valor : String){ calculo.text = "${calculo.text}$valor" }

        //NÚMEROS
        binding.um.setOnClickListener    {adicionarTexto("1")}
        binding.dois.setOnClickListener  {adicionarTexto("2")}
        binding.tres.setOnClickListener  {adicionarTexto("3")}
        binding.quatro.setOnClickListener{adicionarTexto("4")}
        binding.cinco.setOnClickListener {adicionarTexto("5")}
        binding.seis.setOnClickListener  {adicionarTexto("6")}
        binding.sete.setOnClickListener  {adicionarTexto("7")}
        binding.oito.setOnClickListener  {adicionarTexto("8")}
        binding.nove.setOnClickListener  {adicionarTexto("9")}
        binding.zero.setOnClickListener  {adicionarTexto("0")}
        //OPERAÇÕES
        binding.fechaParenteses.setOnClickListener {adicionarTexto(")")}
        binding.abertParenteses.setOnClickListener {adicionarTexto("(")}
        binding.multiplica.setOnClickListener {adicionarTexto("*")}
        binding.divide.setOnClickListener {adicionarTexto("/")}
        binding.ponto.setOnClickListener {adicionarTexto(".")}
        binding.menos.setOnClickListener {adicionarTexto("-")}
        binding.mais.setOnClickListener {adicionarTexto("+")}
        binding.backspace.setOnClickListener { calculo.text = calculo.text.dropLast(1) }
        binding.CE.setOnClickListener { calculo.text = "" }



        binding.igual.setOnClickListener {
            if(binding.mensagem.text!=""){binding.mensagem.text= ""}

            binding.mensagem.text= ""
            val resultadoCalculo = Expression(calculo.text.toString()).calculate()

            if (calculo.text.endsWith("/0")){
                binding.mensagem.text= "Erro: Divisão por zero!"
            }
            else if (resultadoCalculo.isNaN()){
                binding.mensagem.text= "Entrada inválida!"
            }else{
                binding.conta.text = resultadoCalculo.toString()
            }

        }
    }
}