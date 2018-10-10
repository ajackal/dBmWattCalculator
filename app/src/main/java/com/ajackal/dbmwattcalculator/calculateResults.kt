package com.ajackal.dbmwattcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class calculateResults : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_results)

        val message = intent.getStringExtra(RESULT)

        val message2 = "The result is: $message"

        val textView = findViewById<TextView>(R.id.textViewResult).apply {
            text = message2
        }
    }
}
