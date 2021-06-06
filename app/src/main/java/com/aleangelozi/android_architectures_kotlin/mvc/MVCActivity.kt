package com.aleangelozi.android_architectures_kotlin.mvc

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aleangelozi.android_architectures_kotlin.R
import java.util.*
import kotlin.collections.ArrayList

class MVCActivity : AppCompatActivity() {

    private val listValues: MutableList<String> = ArrayList()
    lateinit var adapter: ArrayAdapter<String>
    lateinit var list: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
        title = "MVC Activity"

        list = findViewById(R.id.list)
        adapter = ArrayAdapter(this, R.layout.row_layout, R.id.listText, listValues)

        list.adapter = adapter
        list.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                Toast.makeText(
                    this@MVCActivity, "You clicked " +
                            listValues[position], Toast.LENGTH_SHORT
                ).show()
            }

        val vals = ArrayList<String>()
        vals.add("USA")
        vals.add("Canada")
        vals.add("UK")
        vals.add("China")
        vals.add("Brazil")
        vals.add("USA")
        vals.add("Canada")
        vals.add("UK")
        vals.add("China")
        vals.add("Brazil")
        vals.add("USA")
        vals.add("Canada")
        vals.add("UK")
        vals.add("China")
        vals.add("Brazil")
        vals.add("USA")
        vals.add("Canada")
        vals.add("UK")
        vals.add("China")
        vals.add("Brazil")
        vals.add("USA")
        vals.add("Canada")
        vals.add("UK")
        vals.add("China")
        vals.add("Brazil")
        vals.add("USA")
        vals.add("Canada")
        vals.add("UK")
        vals.add("China")
        vals.add("Brazil")

        setValues(vals)

    }

    fun setValues(values: List<String>) {
        listValues.clear()
        listValues.addAll(values)
        adapter.notifyDataSetChanged()
    }

}