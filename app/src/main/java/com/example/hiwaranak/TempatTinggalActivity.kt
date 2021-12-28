package com.example.hiwaranak

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class TempatTinggalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tempat_tinggal)

        var tempathiwar: MediaPlayer = MediaPlayer.create(this, R.raw.tempat_tinggal)
        var play: ImageButton = findViewById(R.id.btn_play)
        play.setOnClickListener{
            if(!tempathiwar.isPlaying) {
                tempathiwar.start()

                play.setImageResource(R.drawable.ic_pause)
                Toast.makeText(this, "Media Sedang Diputar", Toast.LENGTH_LONG).show()
            }else{
                tempathiwar.pause()

            }
        }
    }
}