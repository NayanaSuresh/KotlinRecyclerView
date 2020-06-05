package com.example.praveen.kotlinproject01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById(R.id.recyclerview) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        val users = ArrayList<User>()
        users.add(User("Nayana","Los Angeles"))
        users.add(User("Adarsh","London"))
        users.add(User("Akshay","Italy"))

        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }
}
