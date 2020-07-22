package com.brj.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.brj.coderswag.Adapters.CategoryAdapter
import com.brj.coderswag.Model.Category
import com.brj.coderswag.R
import com.brj.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

        lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

//        categoryListView.setOnItemClickListener { adapterView, view, i, l ->  // for listView
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicked on ${category.title} cell.", Toast.LENGTH_SHORT).show()
//        }
    }
}