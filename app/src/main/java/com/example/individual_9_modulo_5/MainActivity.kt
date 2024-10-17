package com.example.individual_9_modulo_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val numbersList = listOf("one", "five", "two", "three", "four")
    private val instanceList = listOf(null, 1, "two", 3.0, "four")
    private val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        val buttonFilter1 = findViewById<Button>(R.id.buttonFilter1)
        val buttonFilter2 = findViewById<Button>(R.id.buttonFilter2)
        val buttonFilter3 = findViewById<Button>(R.id.buttonFilter3)

        // Filtro 1: Filtrar la lista numbersList por longitud mayor a 3 caracteres
        buttonFilter1.setOnClickListener {
            val filteredList = numbersList.filter { it.length > 3 }
            textViewResult.text = filteredList.joinToString(", ")
        }

        // Filtro 2: Filtrar la lista instanceList eliminando los valores nulos y no string
        buttonFilter2.setOnClickListener {
            val filteredList = instanceList.filterIsInstance<String>()
            textViewResult.text = filteredList.joinToString(", ")
        }

        // Filtro 3: Ordenar la lista unsortedList en orden ascendente
        buttonFilter3.setOnClickListener {
            val sortedList = unsortedList.sorted()
            textViewResult.text = sortedList.joinToString(", ")
        }
    }
}
