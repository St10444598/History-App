package com.app.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvHeading = findViewById<TextView>(R.id.tvHeading)
        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResponse = findViewById<TextView>(R.id.tvResponse)

        btnGenerate.setOnClickListener {

            val age= etAge.toString().toInt()

            if (age >=  20) {
                "Steve Irwin passed on at the age of 44."
            } else if(age >= 30) {
                "Ryan Cox passed on at the age of 28."
            } else if (age >= 40) {
                "Heath Ledger passed on at the age of 28."
            } else if (age >= 50) {
                "Michael Jackson passed on at the age of 50."
            } else if (age >= 60) {
                "Gregory Isaacs passed on at the age of 59."
            } else if (age >= 70) {
                "Elizabeth Taylor passed on at the age of 79."
            } else if (age >= 80) {
                "Whitney Houston passed on at the age of 48."
            } else if (age >= 90) {
                "Paul Walker passed on at the age of 40."
            } else if (age >= 100) {
                "Maya Angelou passed on at the age of 86."
            }else{
                tvResponse.text = "You have entered an invalid value."
            }


        }
        btnClear.setOnClickListener {
            etAge.clear()
        }

    }
}