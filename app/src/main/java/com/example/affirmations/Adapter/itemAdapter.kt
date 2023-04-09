package com.example.affirmations.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class itemAdapter(private val context: Context, private val Dataset:List<Affirmation>):
    RecyclerView.Adapter<itemAdapter.itemHolder>() {
    class itemHolder(private val view:View):RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemHolder {
        val adapterLayout = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return itemHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return Dataset.size
    }

    override fun onBindViewHolder(holder: itemHolder, position: Int) {
        val item = Dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

}