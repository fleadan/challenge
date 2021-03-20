package com.example.videogames

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class GCAdapter(private val gameChars : List<character>) : RecyclerView.Adapter<GCAdapter.GCViewHolder>() {

    inner class GCViewHolder(renglon: View): RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre_char)
        var origen = renglon.findViewById<TextView>(R.id.origen_char)
        var estilo = renglon.findViewById<TextView>(R.id.estilo_char)
        var plot = renglon.findViewById<TextView>(R.id.plot_char)
        var foto = renglon.findViewById<ImageView>(R.id.foto_char)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GCViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.char_renglon,parent, false)
        return GCViewHolder(renglon_vista)
    }

    override fun onBindViewHolder(holder: GCViewHolder, position: Int) {
        val cha = gameChars[position]
        holder.foto.setImageResource(cha.picture)
        holder.nombre.text = cha.name
        holder.origen.text = cha.origin
        holder.estilo.text = cha.style
        holder.plot.text = cha.plot

        holder.itemView.setOnClickListener {
            val action = CharactersDirections.actionCharactersToCharInfo(cha)
            holder.itemView.findNavController().navigate(action)
        }


    }

    override fun getItemCount(): Int {
        return gameChars.size
    }
}