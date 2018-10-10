package com.ajackal.dbmwattcalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val CONVERSION_TYPE = "com.ajackal.dbmwattcalculator.CONVERSION_TYPE"
const val RESULT = "com.ajackal.dbmwattcalculator.RESULT"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendDbm(view: View) {
        val conversionType = "dbm"
        val intent = Intent(this, dbmToWatts::class.java).apply {
            putExtra(CONVERSION_TYPE, conversionType)
        }
        startActivity(intent)
    }

    fun sendWatts(view: View) {
        val conversionType = "watt"
        val intent = Intent(this, WattsToDbm::class.java).apply {
            putExtra(CONVERSION_TYPE, conversionType)
        }
        startActivity(intent)
    }
}
