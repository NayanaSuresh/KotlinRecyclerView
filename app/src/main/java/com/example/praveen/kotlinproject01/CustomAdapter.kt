package com.example.praveen.kotlinproject01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userList:ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){


    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById(R.id.name) as TextView
        val adress = itemView.findViewById(R.id.adress) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false)
        return  ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return  userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
          val user:User = userList[position]
          holder.name.text = user.name
        holder.adress.text = user.adress

    }


}