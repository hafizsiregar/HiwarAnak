package com.example.hiwaranak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ListPercakapanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_percakapan)

        val btnperkenalan: ImageButton = findViewById(R.id.btn_perkenalan)
        btnperkenalan.setOnClickListener(this)

        val btnbelajar: ImageButton = findViewById(R.id.btn_belajar)
        btnbelajar.setOnClickListener(this)

        val btnkeluarga: ImageButton = findViewById(R.id.btn_keluarga)
        btnkeluarga.setOnClickListener(this)

        val btnsholat: ImageButton = findViewById(R.id.btn_sholat )
        btnsholat.setOnClickListener(this)

        val btntempattinggal: ImageButton = findViewById(R.id.btn_tempat_tinggal)
        btntempattinggal.setOnClickListener(this)

        val btnpekerjaan: ImageButton = findViewById(R.id.btn_pekerjaan)
        btnpekerjaan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_perkenalan -> {
                val moveIntent = Intent(this@ListPercakapanActivity,PerkenalanActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_belajar -> {
                val moveIntent = Intent(this@ListPercakapanActivity,BelajarActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_keluarga -> {
                val moveIntent = Intent(this@ListPercakapanActivity,KeluargaActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_sholat -> {
                val moveIntent = Intent(this@ListPercakapanActivity,SholatActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_tempat_tinggal -> {
                val moveIntent = Intent(this@ListPercakapanActivity,TempatTinggalActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_pekerjaan -> {
                val moveIntent = Intent(this@ListPercakapanActivity,PekerjaanActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}