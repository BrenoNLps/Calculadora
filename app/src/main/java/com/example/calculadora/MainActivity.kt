package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val calculo = findViewById<TextView>(R.id.conta)

            val botaoUm = findViewById<Button>(R.id.um)
            val botaoDois = findViewById<Button>(R.id.dois)
            val botaotres = findViewById<Button>(R.id.tres)
            val botaoQuatro = findViewById<Button>(R.id.quatro)
            val botaoCinco = findViewById<Button>(R.id.cinco)
            val botaoSeis = findViewById<Button>(R.id.seis)
            val botaoSete = findViewById<Button>(R.id.sete)
            val botaoOito = findViewById<Button>(R.id.oito)
            val botaoNove = findViewById<Button>(R.id.nove)
            val botaoZero = findViewById<Button>(R.id.zero)

            val botaoCE = findViewById<Button>(R.id.CE)
            val botaoFechaP = findViewById<Button>(R.id.fecha_parenteses)
            val botaoAbreP = findViewById<Button>(R.id.abert_parenteses)
            val botaoMenos = findViewById<Button>(R.id.menos)
            val botaoMais = findViewById<Button>(R.id.mais)
            val botaoVezes = findViewById<Button>(R.id.multiplica)
            val botaoDividir = findViewById<Button>(R.id.divide)



        }
    }
}