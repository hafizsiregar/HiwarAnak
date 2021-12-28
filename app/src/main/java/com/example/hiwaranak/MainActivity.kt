package com.example.hiwaranak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnstart: ImageButton = findViewById(R.id.btn_start)
        btnstart.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
          R.id.btn_start -> {
            val moveIntent = Intent(this@MainActivity,ListPercakapanActivity::class.java)
              startActivity(moveIntent)
          }
        }

    }
}