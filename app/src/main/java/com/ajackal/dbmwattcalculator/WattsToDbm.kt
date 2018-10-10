package com.ajackal.dbmwattcalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlin.math.log10


class WattsToDbm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watts_to_dbm)
    }

    fun wattConversion(view: View) {
        val editText = findViewById<EditText>(R.id.inputWatts)
        val wattValue = editText.text.toString().toDouble()
        val result = String.format("%.2f", 10 * log10((1000 * wattValue)))
        val intent = Intent(this, calculateResults::class.java).apply {
            putExtra(RESULT, result)
        }
        startActivity(intent)
    }
}
