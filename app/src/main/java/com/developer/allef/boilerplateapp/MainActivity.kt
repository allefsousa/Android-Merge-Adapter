package com.developer.allef.boilerplateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mergeAdapter = MergeAdapter()

        recycler_home.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mergeAdapter
        }

    }
}
