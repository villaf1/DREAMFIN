package com.example.memo.educa;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;


public class Vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_vid);
        //obtenemos el control VideoView
        VideoView videoView1 = (VideoView)findViewById(R.id.videoView1);
        //Establecemos la Uri del Video
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+ R.raw.DREAMFININTRO.mp4);
        //Asignamos la Uri al COntrol VideoView
        videoView1.setVideoURI(uri);
        //Iniciamos Video
        videoView1.start();

    }
}
