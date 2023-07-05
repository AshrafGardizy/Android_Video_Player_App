package com.example.videoplayerapp


import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vdLocal:VideoView = findViewById(R.id.videoView1)
        val vdInternet = findViewById<VideoView>(R.id.videoView2)
        vdLocal.setVideoPath("android.resource://"+packageName+"/"+R.raw.alan)
        vdLocal.start()
        // Media Controller
        val  mediaController = MediaController(this)
        mediaController.setAnchorView(vdLocal)
        mediaController.setMediaPlayer(vdLocal)
        vdLocal.setMediaController(mediaController)
        //Video from internet
        val uri = Uri.parse("https://cdn.videvo.net/videvo_files/video/premium/video0394/large_watermarked/902-1_902-0402-PD2_preview.mp4")
        vdInternet.setVideoURI(uri)
        //Media Controller
        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(vdInternet)
        mediaController2.setMediaPlayer(vdInternet)
        vdInternet.setMediaController(mediaController2)
        vdInternet.start()



    }
}