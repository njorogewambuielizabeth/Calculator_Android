
package com.example.easycalculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    lateinit var tilNumOne: TextInputLayout
    lateinit var tieNumOne: TextInputEditText
    lateinit var tilNumTwo: TextInputLayout
    lateinit var tieNumTwo: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResults : TextView
    var num1 by Delegates.notNull<Double>()
    var num2 by Delegates.notNull<Double>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumOne = findViewById(R.id.tilNumOne)
        tilNumTwo = findViewById(R.id.tilNumTwo)
        tieNumOne = findViewById(R.id.tieNumOne)
        tieNumTwo = findViewById(R.id.tieNumTwo)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResults = findViewById(R.id.tvResult)

        clickListener()


    }

    fun clickListener() {
        btnAdd!!.setOnClickListener {
            num1 = tieNumOne!!.text.toString().toDouble()
            num2 = tieNumTwo!!.text.toString().toDouble()
            var result = num1!! + num2!!
            tvResults!!.text = result.toString()

        }

        btnSubtract!!.setOnClickListener {
            num1 = tieNumOne!!.text.toString().toDouble()
            num2 = tieNumTwo!!.text.toString().toDouble()
            var result = num1!! - num2!!
            tvResults!!.text = result.toString()

        }


        btnMultiply!!.setOnClickListener {
            num1 = tieNumOne!!.text.toString().toDouble()
            num2 = tieNumTwo!!.text.toString().toDouble()
            var result = num1!! * num2!!
            tvResults!!.text = result.toString()


        }

        btnModulus!!.setOnClickListener {
            num1 = tieNumOne!!.text.toString().toDouble()
            num2 = tieNumTwo!!.text.toString().toDouble()
            var result = num1!! / num2!!
            tvResults!!.text = result.toString()


        }


    }
}

