package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button =findViewById (R.id.rollbutton)
        rollbutton.setOnClickListener {
            val toast=Toast.makeText(this,"Dice Roller",Toast.LENGTH_SHORT)
            toast.show()
            val firstdice= Dice()
            val thenumber=firstdice.Roll()
            val mytext:TextView=findViewById(R.id.textView)
            mytext.text=thenumber.toString()
        }
    }
}

class Dice {
    var sides=6
    fun Roll() :Int {
        val randomnumber=(1..6).random()
        println(randomnumber)
        return randomnumber
    }
}