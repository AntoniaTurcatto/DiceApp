package com.nnt.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao:Button=findViewById(R.id.botao)
        val imagemDoDado:ImageView=findViewById(R.id.Imagem)
        val chipGroup:ChipGroup=findViewById(R.id.chipGroup)
        val textoTela :TextView=findViewById(R.id.teste)
        chipGroup.setOnCheckedChangeListener{_,_->
            when(chipGroup.checkedChipId){
                R.id.d4 ->{
                    imagemDoDado.setImageResource(R.drawable.d4_1)
                    textoTela.text=resources.getString(R.string.title_d4)
                    botao.text=resources.getString(R.string.rolar_o_dado)
                }
                R.id.d6 ->{
                    imagemDoDado.setImageResource(R.drawable.d6_1)
                    textoTela.text=resources.getString(R.string.title_d6)
                    botao.text=resources.getString(R.string.rolar_o_dado)
                }
                R.id.d8 ->{
                    imagemDoDado.setImageResource(R.drawable.d8_1)
                    textoTela.text=resources.getString(R.string.title_d8)
                    botao.text=resources.getString(R.string.rolar_o_dado)
                }
                R.id.d10 ->{
                    imagemDoDado.setImageResource(R.drawable.d10_1)
                    textoTela.text=resources.getString(R.string.title_d10)
                    botao.text=resources.getString(R.string.rolar_o_dado)
                }
                R.id.d12 ->{
                    imagemDoDado.setImageResource(R.drawable.d12_1)
                    textoTela.text=resources.getString(R.string.title_d12)
                    botao.text=resources.getString(R.string.rolar_o_dado)
                }
                R.id.d20 ->{
                    imagemDoDado.setImageResource(R.drawable.d20_1)
                    textoTela.text=resources.getString(R.string.title_d20)
                    botao.text=resources.getString(R.string.rolar_o_dado)
                }
            }

            botao.setOnClickListener {
                jogarDado(imagemDoDado, chipGroup)
            }
        }
    }
    private fun jogarDado(imagemDoDado:ImageView, chipGroup:ChipGroup){
        val faceSorteada:Int
        val textoTela :TextView=findViewById(R.id.teste)

            when (chipGroup.checkedChipId){
                R.id.d4 ->{
                    faceSorteada=(1..4).random()
                    textoTela.text= resources.getString(R.string.result, faceSorteada.toString())
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString()) //descreve a imagem para voice over
                    when(faceSorteada){
                        1 -> imagemDoDado.setImageResource(R.drawable.d4_1)
                        2 ->imagemDoDado.setImageResource(R.drawable.d4_2)
                        3 ->imagemDoDado.setImageResource(R.drawable.d4_3)
                        4 ->imagemDoDado.setImageResource(R.drawable.d4_4)
                    }
                }

                R.id.d6 ->{
                    faceSorteada=(1..6).random()
                    textoTela.text= resources.getString(R.string.result, faceSorteada.toString())
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when(faceSorteada){
                        1 -> imagemDoDado.setImageResource(R.drawable.d6_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d6_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d6_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d6_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d6_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d6_6)
                    }
                }
                R.id.d8 -> {
                    faceSorteada = (1..8).random()
                    textoTela.text = resources.getString(R.string.result, faceSorteada.toString())
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when (faceSorteada) {
                        1 -> imagemDoDado.setImageResource(R.drawable.d8_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d8_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d8_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d8_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d8_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d8_6)
                        7 -> imagemDoDado.setImageResource(R.drawable.d8_7)
                        8 -> imagemDoDado.setImageResource(R.drawable.d8_8)

                    }
                }
                R.id.d10 ->{
                    faceSorteada = (1..10).random()
                    textoTela.text =  resources.getString(R.string.result, faceSorteada.toString())
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when (faceSorteada) {
                        1 -> imagemDoDado.setImageResource(R.drawable.d10_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d10_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d10_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d10_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d10_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d10_6)
                        7 -> imagemDoDado.setImageResource(R.drawable.d10_7)
                        8 -> imagemDoDado.setImageResource(R.drawable.d10_8)
                        9 -> imagemDoDado.setImageResource(R.drawable.d10_9)
                        10 -> imagemDoDado.setImageResource(R.drawable.d10_10)
                    }
                }
                R.id.d12 ->{
                    faceSorteada = (1..12).random()
                    textoTela.text = resources.getString(R.string.result, faceSorteada.toString())
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when (faceSorteada) {
                        1 -> imagemDoDado.setImageResource(R.drawable.d12_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d12_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d12_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d12_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d12_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d12_6)
                        7 -> imagemDoDado.setImageResource(R.drawable.d12_7)
                        8 -> imagemDoDado.setImageResource(R.drawable.d12_8)
                        9 -> imagemDoDado.setImageResource(R.drawable.d12_9)
                        10 -> imagemDoDado.setImageResource(R.drawable.d12_10)
                        11 -> imagemDoDado.setImageResource(R.drawable.d12_11)
                        12 -> imagemDoDado.setImageResource(R.drawable.d12_12)
                    }
                }
                R.id.d20 ->{
                    faceSorteada = (1..20).random()
                    textoTela.text =  resources.getString(R.string.result, faceSorteada.toString())
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when (faceSorteada) {
                        1 -> imagemDoDado.setImageResource(R.drawable.d20_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d20_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d20_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d20_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d20_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d20_6)
                        7 -> imagemDoDado.setImageResource(R.drawable.d20_7)
                        8 -> imagemDoDado.setImageResource(R.drawable.d20_8)
                        9 -> imagemDoDado.setImageResource(R.drawable.d20_9)
                        10 -> imagemDoDado.setImageResource(R.drawable.d20_10)
                        11 -> imagemDoDado.setImageResource(R.drawable.d20_11)
                        12 -> imagemDoDado.setImageResource(R.drawable.d20_12)
                        13 -> imagemDoDado.setImageResource(R.drawable.d20_13)
                        14 -> imagemDoDado.setImageResource(R.drawable.d20_14)
                        15 -> imagemDoDado.setImageResource(R.drawable.d20_15)
                        16 -> imagemDoDado.setImageResource(R.drawable.d20_16)
                        17 -> imagemDoDado.setImageResource(R.drawable.d20_17)
                        18 -> imagemDoDado.setImageResource(R.drawable.d20_18)
                        19 -> imagemDoDado.setImageResource(R.drawable.d20_19)
                        20 -> imagemDoDado.setImageResource(R.drawable.d20_20)

                    }
                }

            }

    }
}