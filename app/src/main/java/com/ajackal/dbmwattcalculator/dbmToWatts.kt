package com.ajackal.dbmwattcalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlin.math.pow
import kotlin.math.roundToLong


class dbmToWatts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dbm_to_watts)
    }

    fun dbmConversion(view: View) {
        val editText = findViewById<EditText>(R.id.inputDbm)
        val dbmValue = editText.text.toString().toDouble()
        val exponent = dbmValue / 10
        val result = String.format("%.2f", 10.0.pow(exponent) / 1000)
        val intent = Intent(this, calculateResults::class.java).apply {
            putExtra(RESULT, result)
        }
        startActivity(intent)
    }
}
