package com.example.planeto

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var planet: List<PlanetData>) : RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var planetimg = view.planet_img
        var galaxy = view.galaxy
        var distance = view.distance
        var gravity = view.gravity

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,PlanetDetail::class.java)
            intent.putExtra("planet",planet[position])
            intent.putExtra("planetImage",dummyImage)
            holder.itemView.context.startActivity(intent)

        }
        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].galaxy
        holder.distance.text = planet[position].distance
        holder.gravity.text = planet[position].title

        when (planet[position].title!!.toLowerCase()) {
            "one" -> {
                dummyImage = R.drawable.ic_sun
            }
            "two" -> {
                dummyImage = R.drawable.ic_sun
            }
            "three" -> {
                dummyImage = R.drawable.ic_sun
            }
            "four" -> {
                dummyImage = R.drawable.ic_sun
            }
            "five" -> {
                dummyImage = R.drawable.ic_sun
            }
            "six" -> {
                dummyImage = R.drawable.ic_sun
            }
            "seven" -> {
                dummyImage = R.drawable.ic_sun
            }
            "eight" -> {
                dummyImage = R.drawable.ic_sun
            }
            "nine" -> {
                dummyImage = R.drawable.ic_sun
            }
            "ten" -> {
                dummyImage = R.drawable.ic_sun
            }
        }
        holder.planetimg.setImageResource(dummyImage!!)


    }

    override fun getItemCount(): Int {
        return planet.size
    }
}

