package com.devpass.spaceapp.presentation


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView
import com.devpass.spaceapp.R

class NextLaunchesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.nextlaunchrecyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}