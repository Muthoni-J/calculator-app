package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var display: TextView
    lateinit var editfirst:EditText
    lateinit var editSecond :EditText
    lateinit var add :Button
    lateinit var sub :Button
    lateinit var multiply :Button
    lateinit var div :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display =findViewById(R.id.display_result)
        editfirst =findViewById(R.id.edit_first)
        editSecond =findViewById(R.id.edit_second)
        add =findViewById(R.id.Add)
        sub =findViewById(R.id.Subtract)
        multiply =findViewById(R.id.Multiply)
        div =findViewById(R.id.Divide)


        add.setOnClickListener{

            val res1 =editfirst.text.toString()
            val res2 =editSecond.text.toString()

            if (res1.isBlank()){
                editfirst.error = "First number required"
                return@setOnClickListener
            }
            if (res2.isBlank()){
                editSecond.error = "Second number required"
                return@setOnClickListener
            }

            addition(res1.toInt() ,res2.toInt())
        }
        sub.setOnClickListener {
            val res1 =editfirst.text.toString()
            val res2 =editSecond.text.toString()

            if (res1.isBlank()){
                editfirst.error = "First number required"
                return@setOnClickListener
            }
            if (res2.isBlank()){
                editSecond.error = "Second number required"
                return@setOnClickListener
            }

            subtraction(res1.toInt() ,res2.toInt())


        }
        multiply.setOnClickListener {

            val res1 =editfirst.text.toString()
            val res2 =editSecond.text.toString()

            if (res1.isBlank()){
                editfirst.error = "First number required"
                return@setOnClickListener
            }
            if (res2.isBlank()){
                editSecond.error = "Second number required"
                return@setOnClickListener
            }

            multiplication(res1.toInt(), res2.toInt())

        }

        div.setOnClickListener {
            val res1 =editfirst.text.toString()
            val res2 =editSecond.text.toString()

            if (res1.isBlank()){
                editfirst.error = "First number required"
                return@setOnClickListener
            }
            if (res2.isBlank()){
                editSecond.error = "Second number required"
                return@setOnClickListener
            }

            modulus(res1.toInt(), res2.toInt())
        }

    }
    private fun addition(res1:Int,res2 :Int)
    {
        val result = res1 + res2
        display.text = result.toString()
    }

    private fun subtraction(res1:Int,res2 :Int)
    {
        val result = res1 - res2
        display.text = result.toString()
    }

    private fun multiplication(res1:Int,res2 :Int)
    {
        val result = res1 * res2
        display.text = result.toString()
    }

    private fun modulus(res1:Int,res2 :Int)
    {
        val result = res1 % res2
        display.text = result.toString()
    }
}
