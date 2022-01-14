package com.example.calculadora


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botao = findViewById<Button>(R.id.calcular)
        var resultado = findViewById<TextView>(R.id.resultado)

        botao.setOnClickListener {

            var nota1 = Integer.parseInt(findViewById<EditText>(R.id.nota1).text.toString())
            var nota2 = Integer.parseInt(findViewById<EditText>(R.id.nota2).text.toString())
            var media = (nota1 + nota2)/2
            var faltas = Integer.parseInt(findViewById<EditText>(R.id.faltas).text.toString())

            if(media >=6 && faltas <=10) {
                resultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final:" + media +"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno foi Reprovado" + "\n" + "Nota Final:" + media +"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}