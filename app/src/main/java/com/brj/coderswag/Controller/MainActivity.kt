package com.brj.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.brj.coderswag.Adapters.CategoryAdapter
import com.brj.coderswag.Adapters.CategoryRecycleAdapter
import com.brj.coderswag.Model.Category
import com.brj.coderswag.R
import com.brj.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener { adapterView, view, i, l ->  // for listView
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicked on ${category.title} cell.", Toast.LENGTH_SHORT).show()
//        }
    }
}