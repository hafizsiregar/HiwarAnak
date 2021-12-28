package com.example.hiwaranak

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class KeluargaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keluarga)

        var keluargahiwar: MediaPlayer = MediaPlayer.create(this, R.raw.keluarga)
        var play: ImageButton = findViewById(R.id.btn_play)
        play.setOnClickListener{
            if(!keluargahiwar.isPlaying) {
                keluargahiwar.start()

                play.setImageResource(R.drawable.ic_pause)
                Toast.makeText(this, "Media Sedang Diputar", Toast.LENGTH_LONG).show()
            }else{
                keluargahiwar.pause()

            }
        }
    }
}
