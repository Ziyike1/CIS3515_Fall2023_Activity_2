package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* Step 1: Populate this array */
        //val numberArray = Array Of Numbers
        val sizeArray = (1..100).toList()

        /* Step 2: Create adapter to display items from array in Spinner */
        //spinner.adapter = ArrayAdapter..
        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,sizeArray)


        // Step 3: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...
        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selected = sizeArray[position]
                displayTextView.textSize = selected.toFloat()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

    }
}