package dev.dalvent.justdo.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.dalvent.justdo.R
import dev.dalvent.justdo.data.Objective

class ObjectivesAdapter() : RecyclerView.Adapter<ObjectivesAdapter.ViewHolder>() {

    var objectives: List<Objective> = listOf()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.objective_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = objectives[position].name
    }

    override fun getItemCount(): Int {
        return objectives.size
    }
}