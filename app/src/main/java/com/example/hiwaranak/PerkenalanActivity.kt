package com.example.hiwaranak

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class PerkenalanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perkenalan)

        var perkenalanhiwar: MediaPlayer = MediaPlayer.create(this, R.raw.perkenalan)
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