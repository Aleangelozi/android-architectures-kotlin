package com.aleangelozi.android_architectures_kotlin.mvc

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity
import com.aleangelozi.android_architectures_kotlin.R
import java.util.*
import kotlin.collections.ArrayList

class MVCActivity : AppCompatActivity() {

    private val listValues: MutableList<String> = ArrayList()
    lateinit var adapter: ArrayAdapter<String>
    lateinit var list: ListView
    lateinit var controller: CountriesController
   lateinit var retryButton: Button
   lateinit var progress: ProgressBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
        title = "MVC Activity"

        controller = CountriesController(this)

        list = findViewById(R.id.list)
        retryButton = findViewById(R.id.retryButton)
        progress = findViewById(R.id.progress)
        adapter = ArrayAdapter(this, R.layout.row_layout, R.id.listText, listValues)

        list.adapter = adapter
        list.onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                Toast.makeText(
                    this@MVCActivity, "You clicked " +
                            listValues[position], Toast.LENGTH_SHORT
                ).show()
            }

        /*val vals = ArrayList<String>()
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

        setValues(vals)*/

    }

    fun setValues(values: List<String>) {
        listValues.clear()
        listValues.addAll(values)
        retryButton.visibility = View.GONE
        progress.visibility = View.GONE
        list.visibility = View.VISIBLE
        adapter.notifyDataSetChanged()
    }

    fun onRetry(view: View) {
        controller.onRefresh()
        list.visibility = View.GONE
        retryButton.visibility = View.GONE
        progress.visibility = View.VISIBLE
    }

    fun onError() {
        Toast.makeText(
            this@MVCActivity, getString(R.string.error_message)
                    , Toast.LENGTH_SHORT
        ).show()
        progress.visibility = View.GONE
        list.visibility = View.GONE
        retryButton.visibility = View.VISIBLE
    }

}