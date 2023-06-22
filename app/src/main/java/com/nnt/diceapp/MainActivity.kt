package com.nnt.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textoTela:TextView=findViewById(R.id.teste)
        val botao:Button=findViewById(R.id.botao)
        var faceSorteada=1
        val imagemDoDado:ImageView=findViewById(R.id.Imagem)

        botao.setOnClickListener {
            faceSorteada=(1..6).random()
            textoTela.text=faceSorteada.toString()
            when(faceSorteada){
                1 -> imagemDoDado.setImageResource(R.drawable.d6_1)
                2 -> imagemDoDado.setImageResource(R.drawable.d6_2)
                3 -> imagemDoDado.setImageResource(R.drawable.d6_3)
                4 -> imagemDoDado.setImageResource(R.drawable.d6_4)
                5 -> imagemDoDado.setImageResource(R.drawable.d6_5)
                6 -> imagemDoDado.setImageResource(R.drawable.d6_6)
            }

        }
    }
}