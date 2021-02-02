package com.example.listhewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.febryan.listviewhewan.AdapterHewan
import com.febryan.listviewhewan.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaHewan = arrayOf("Anjing","Ayam Jago","Bebek","Burung Hantu","Burung Pipit","Gajah","Kambing","Kucing","Kuda","Singa")

        val gambarHewan = arrayOf(R.drawable.anjing,
                                                R.drawable.ayam_jago,
                                                R.drawable.bebek,
                                                R.drawable.burung_hantu,
                                                R.drawable.burung_pipit,
                                                R.drawable.gajah,
                                                R.drawable.kambing,
                                                R.drawable.kucing,
                                                R.drawable.kuda,
                                                R.drawable.singa)

        val suaraHewan = arrayOf(R.raw.anjing,
                                                R.raw.ayam_jago,
                                                R.raw.bebek,
                                                R.raw.burung_hantu,
                                                R.raw.burung_pipit,
                                                R.raw.gajah,
                                                R.raw.kambing_bandot,
                                                R.raw.kucing,
                                                R.raw.kuda,
                                                R.raw.singa)

        val adapterHewan = AdapterHewan(namaHewan, gambarHewan, suaraHewan)

        rv_hewan.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = adapterHewan
        }

    }
}