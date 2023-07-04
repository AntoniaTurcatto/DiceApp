package com.nnt.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {

    var isAnimating=false
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
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
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString()) //descreve a imagem para voice over
                    when(faceSorteada){
                        1 -> mudarImagem(R.drawable.d4_1, imagemDoDado,textoTela,faceSorteada)
                        2 ->mudarImagem(R.drawable.d4_2, imagemDoDado,textoTela,faceSorteada)
                        3 ->mudarImagem(R.drawable.d4_3, imagemDoDado,textoTela,faceSorteada)
                        4 ->mudarImagem(R.drawable.d4_4, imagemDoDado,textoTela,faceSorteada)
                    }
                }

                R.id.d6 ->{
                    faceSorteada=(1..6).random()
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when(faceSorteada){
                        1 -> mudarImagem(R.drawable.d6_1, imagemDoDado,textoTela,faceSorteada)
                        2 -> mudarImagem(R.drawable.d6_2, imagemDoDado,textoTela,faceSorteada)
                        3 -> mudarImagem(R.drawable.d6_3, imagemDoDado,textoTela,faceSorteada)
                        4 -> mudarImagem(R.drawable.d6_4, imagemDoDado,textoTela,faceSorteada)
                        5 -> mudarImagem(R.drawable.d6_5, imagemDoDado,textoTela,faceSorteada)
                        6 -> mudarImagem(R.drawable.d6_6, imagemDoDado,textoTela,faceSorteada)
                    }
                }
                R.id.d8 -> {
                    faceSorteada = (1..8).random()
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when (faceSorteada) {
                        1 -> mudarImagem(R.drawable.d8_1, imagemDoDado,textoTela,faceSorteada)
                        2 -> mudarImagem(R.drawable.d8_2, imagemDoDado,textoTela,faceSorteada)
                        3 -> mudarImagem(R.drawable.d8_3, imagemDoDado,textoTela,faceSorteada)
                        4 -> mudarImagem(R.drawable.d8_4, imagemDoDado,textoTela,faceSorteada)
                        5 -> mudarImagem(R.drawable.d8_5, imagemDoDado,textoTela,faceSorteada)
                        6 -> mudarImagem(R.drawable.d8_6, imagemDoDado,textoTela,faceSorteada)
                        7 -> mudarImagem(R.drawable.d8_7, imagemDoDado,textoTela,faceSorteada)
                        8 -> mudarImagem(R.drawable.d8_8, imagemDoDado,textoTela,faceSorteada)
                    }
                }
                R.id.d10 ->{
                    faceSorteada = (1..10).random()
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when (faceSorteada) {
                        1 -> mudarImagem(R.drawable.d10_1, imagemDoDado,textoTela,faceSorteada)
                        2 -> mudarImagem(R.drawable.d10_2, imagemDoDado,textoTela,faceSorteada)
                        3 -> mudarImagem(R.drawable.d10_3, imagemDoDado,textoTela,faceSorteada)
                        4 -> mudarImagem(R.drawable.d10_4, imagemDoDado,textoTela,faceSorteada)
                        5 -> mudarImagem(R.drawable.d10_5, imagemDoDado,textoTela,faceSorteada)
                        6 -> mudarImagem(R.drawable.d10_6, imagemDoDado,textoTela,faceSorteada)
                        7 -> mudarImagem(R.drawable.d10_7, imagemDoDado,textoTela,faceSorteada)
                        8 -> mudarImagem(R.drawable.d10_8, imagemDoDado,textoTela,faceSorteada)
                        9 -> mudarImagem(R.drawable.d10_9, imagemDoDado,textoTela,faceSorteada)
                        10 -> mudarImagem(R.drawable.d10_10, imagemDoDado,textoTela,faceSorteada)
                    }
                }
                R.id.d12 ->{
                    faceSorteada = (1..12).random()
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when (faceSorteada) {
                        1 -> mudarImagem(R.drawable.d12_1, imagemDoDado,textoTela,faceSorteada)
                        2 -> mudarImagem(R.drawable.d12_2, imagemDoDado,textoTela,faceSorteada)
                        3 -> mudarImagem(R.drawable.d12_3, imagemDoDado,textoTela,faceSorteada)
                        4 -> mudarImagem(R.drawable.d12_4, imagemDoDado,textoTela,faceSorteada)
                        5 -> mudarImagem(R.drawable.d12_5, imagemDoDado,textoTela,faceSorteada)
                        6 -> mudarImagem(R.drawable.d12_6, imagemDoDado,textoTela,faceSorteada)
                        7 -> mudarImagem(R.drawable.d12_7, imagemDoDado,textoTela,faceSorteada)
                        8 -> mudarImagem(R.drawable.d12_8, imagemDoDado,textoTela,faceSorteada)
                        9 -> mudarImagem(R.drawable.d12_9, imagemDoDado,textoTela,faceSorteada)
                        10 -> mudarImagem(R.drawable.d12_10, imagemDoDado,textoTela,faceSorteada)
                        11 -> mudarImagem(R.drawable.d12_11, imagemDoDado,textoTela,faceSorteada)
                        12 -> mudarImagem(R.drawable.d12_12, imagemDoDado,textoTela,faceSorteada)
                    }
                }
                R.id.d20 ->{
                    faceSorteada = (1..20).random()
                    imagemDoDado.contentDescription =resources.getString(R.string.result, faceSorteada.toString())
                    when (faceSorteada) {
                        1 -> mudarImagem(R.drawable.d20_1, imagemDoDado,textoTela,faceSorteada)
                        2 -> mudarImagem(R.drawable.d20_2, imagemDoDado,textoTela,faceSorteada)
                        3 -> mudarImagem(R.drawable.d20_3, imagemDoDado,textoTela,faceSorteada)
                        4 -> mudarImagem(R.drawable.d20_4, imagemDoDado,textoTela,faceSorteada)
                        5 -> mudarImagem(R.drawable.d20_5, imagemDoDado,textoTela,faceSorteada)
                        6 -> mudarImagem(R.drawable.d20_6, imagemDoDado,textoTela,faceSorteada)
                        7 -> mudarImagem(R.drawable.d20_7, imagemDoDado,textoTela,faceSorteada)
                        8 -> mudarImagem(R.drawable.d20_8, imagemDoDado,textoTela,faceSorteada)
                        9 -> mudarImagem(R.drawable.d20_9, imagemDoDado,textoTela,faceSorteada)
                        10 -> mudarImagem(R.drawable.d20_10, imagemDoDado,textoTela,faceSorteada)
                        11 -> mudarImagem(R.drawable.d20_11, imagemDoDado,textoTela,faceSorteada)
                        12 -> mudarImagem(R.drawable.d20_12, imagemDoDado,textoTela,faceSorteada)
                        13 -> mudarImagem(R.drawable.d20_13, imagemDoDado,textoTela,faceSorteada)
                        14 -> mudarImagem(R.drawable.d20_14, imagemDoDado,textoTela,faceSorteada)
                        15 -> mudarImagem(R.drawable.d20_15, imagemDoDado,textoTela,faceSorteada)
                        16 -> mudarImagem(R.drawable.d20_16, imagemDoDado,textoTela,faceSorteada)
                        17 -> mudarImagem(R.drawable.d20_17, imagemDoDado,textoTela,faceSorteada)
                        18 -> mudarImagem(R.drawable.d20_18, imagemDoDado,textoTela,faceSorteada)
                        19 -> mudarImagem(R.drawable.d20_19, imagemDoDado,textoTela,faceSorteada)
                        20 -> mudarImagem(R.drawable.d20_20, imagemDoDado,textoTela,faceSorteada)
                    }
                }

            }

    }
    private fun mudarImagem(IDDaImagem:Int,imagemDoDado: ImageView, textoTela:TextView, faceSorteada:Int){
        if(!isAnimating){
            isAnimating=true
            textoTela.text=resources.getString(R.string.rolling_the_dice)
            imagemDoDado.animate().apply {
                duration=700 //ms
                rotationXBy(360f)
                rotationYBy(360f)
                alpha(0f)//visibilidade
                scaleX(0f)
                scaleY(0f)
            }.withEndAction(){
                imagemDoDado.animate().apply {
                    alpha(1f)//100%visível
                    scaleX(1f)
                    scaleY(1f)
                }
                imagemDoDado.setImageResource(IDDaImagem)
                textoTela.text= resources.getString(R.string.result, faceSorteada.toString())
                isAnimating = false
            }.start()
        }
    }
}