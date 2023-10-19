package com.example.unitconverter


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt = findViewById<EditText>(R.id.kilo_edt)
        val btn = findViewById<Button>(R.id.convbtn)
        val restext = findViewById<TextView>(R.id.res_text)

        btn.setOnClickListener(){
        val kilos: Double = edt.text.toString().toDouble()
            restext.setText(""+ convertToPounds(kilos))
        }

    }
    fun convertToPounds(kilos: Double): Double{
        var pound = kilos * 2.2
        return pound
    }
}