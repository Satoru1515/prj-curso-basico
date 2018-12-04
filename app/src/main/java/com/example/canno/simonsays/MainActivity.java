package com.example.canno.simonsays;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
//    MediaPlayer click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn = (Button)findViewById(R.id.btn_start);
      // click = MediaPlayer.create(this, R.raw.clic_1);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent start = new Intent(MainActivity.this,MainActivity1.class);
               startActivity(start);
              // click.start();
           }
       });

    }
}
