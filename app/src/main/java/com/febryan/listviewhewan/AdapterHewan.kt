package com.febryan.listviewhewan

import android.media.Image
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterHewan(val namaHewan : Array<String>, val gambarHewan : Array<Int>, val suaraHewan : Array<Int>) :
    RecyclerView.Adapter<AdapterHewan.MyViewHolder>() {
    class MyViewHolder (view : View) : RecyclerView.ViewHolder(view){
        val tvHewan = view.findViewById<TextView>(R.id.item_tv_hewan)
        val imgHewan = view.findViewById<ImageView>(R.id.item_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hewan, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterHewan.MyViewHolder, position: Int) {
        holder.tvHewan.text = namaHewan[position]
        holder.imgHewan.setImageResource(gambarHewan[position])
        holder.itemView.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(holder.itemView.context, suaraHewan[position])
            mediaPlayer.start()
        }
    }

    override fun getItemCount(): Int {
        return namaHewan.size
    }

}