package com.example.hiwaranak

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class SholatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sholat)

        var perkenalanhiwar: MediaPlayer = MediaPlayer.create(this, R.raw.sholat)
        var play: ImageButton = findViewById(R.id.btn_play)
        play.setOnClickListener{
            if(!perkenalanhiwar.isPlaying) {
                perkenalanhiwar.start()

                play.setImageResource(R.drawable.ic_pause)
                Toast.makeText(this, "Media Sedang Diputar", Toast.LENGTH_LONG).show()
            }else{
                perkenalanhiwar.pause()

            }
        }
    }
}