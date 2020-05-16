package com.developer.allef.boilerplateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import com.developer.allef.boilerplateapp.adapter.CardAdapter
import com.developer.allef.boilerplateapp.adapter.DataSource
import com.developer.allef.boilerplateapp.adapter.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardAdapter = CardAdapter(DataSource.getFeira().toMutableList())
        val listAdapter = ListAdapter(DataSource.getFeira().toMutableList())
        val mergeAdapter = MergeAdapter(cardAdapter,listAdapter)


        recycler_home.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mergeAdapter
        }

    }
}
