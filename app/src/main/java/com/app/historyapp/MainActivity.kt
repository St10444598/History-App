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

        //Code Attribution
        //This method was taken from
        //https://www.tutorialsfreak.com/kotlin-tutorial/kotlin-conditional-statements
        // Tutorialsfreak

        // Code Attribution
        // This Method was taken from
        //https://stackoverflow.com/questions/3307090/how-to-add-background-image-to-activity
        // Sephy
        // https://stackoverflow.com/users/263521/sephy

            if (etAge.toString().toInt() ==  44) {
                tvResponse.text = "${etAge.toString().toInt()} Steve Irwin was an Austrailian zookeeper."
            } else if(etAge.toString().toInt() == 28) {
              tvResponse.text =  "${etAge.toString().toInt()} Heath Ledger was an Austrailian actor."
            } else if ( etAge.toString().toInt() == 50) {
                tvResponse.text =  "${etAge.toString().toInt()} Michael Jackson was an American singer and dancer."
            } else if (etAge.toString().toInt() == 79) {
                tvResponse.text = "${etAge.toString().toInt()} Elizabeth Taylor was an British-American actress."
            } else if ( etAge.toString().toInt() == 86) {
                tvResponse.text = "${etAge.toString().toInt()} Maya Angelou was an American memoirist and poet."
            } else if (etAge.toString().toInt() == 95) {
                tvResponse.text =  "${etAge.toString().toInt()} Nelson R. Mandela was the first president of South Africa."
            } else if (etAge.toString().toInt() == 44) {
                tvResponse.text =   "${etAge.toString().toInt()} Paul Walker was an American actor."
            } else if (etAge.toString().toInt() == 99) {
                tvResponse.text =   "${etAge.toString().toInt()} Prince Phillip was the Duke of Edinburgh."
            } else if (etAge.toString().toInt() == 102) {
                tvResponse.text =   "${etAge.toString().toInt()} Elizabeth Bowes-Lyon was the British Queen Mother."
            }else if (etAge.toString().toInt() == 60){
                tvResponse.text = "${etAge.toString().toInt()} Theodore Roosevelt was an American president ."
            } else {
                tvResponse.text = "You have entered an invalid value"
            }


        }
        btnClear.setOnClickListener {
            etAge.clear()
        }

    }
}