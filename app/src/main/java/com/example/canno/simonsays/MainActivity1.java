package com.example.canno.simonsays;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity1 extends AppCompatActivity {

    private TextView tx;
    private Button bt1, bt2, bt3, bt4;
    private MediaPlayer clic1, clic2, clic3, clic4;
    private long milliseconds = 3000;
    private  int[] myList = new int[3];
    private int select;
    Random random = new Random();
    int seconds = 0;
    private int score = 0;
    public int num;
    private int conteo =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        bt1 = (Button) findViewById(R.id.btn_verde);
        clic1 = MediaPlayer.create(this, R.raw.tone_green);
        bt2 = (Button) findViewById(R.id.btn_rojo);
        clic2 = MediaPlayer.create(this, R.raw.tone_red);
        bt3 = (Button) findViewById(R.id.btn_azul);
        clic3 = MediaPlayer.create(this, R.raw.tone_blue);
        bt4 = (Button) findViewById(R.id.btn_amarillo);
        clic4 = MediaPlayer.create(this, R.raw.tone_yellow);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clic1.start();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clic2.start();

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clic3.start();

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clic4.start();

            }
        });


        iniciar();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=0;
                Verificar();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=1;
                Verificar();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=2;
                Verificar();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 3;
                Verificar();
            }
        });

    }

    public void iniciar(){
        milliseconds = 3000;
        select = random.nextInt(4);
        myList[conteo] = select;
        conteo++;
        for(int i = 0; i<myList.length ; i++){
            play(myList[i]);
        }

    }



    public void Verificar(){
        if(select == num){
            Toast.makeText(MainActivity1.this, "Buena" + num, Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(MainActivity1.this, "Palomo", Toast.LENGTH_SHORT).show();
        }
    }

    public void play(int n){
        start(randomButton(n));

    }
    public void start(Button btn) {
        final Button btnSelected = btn;
        CountDownTimer count = new CountDownTimer(milliseconds, 1000) {
            @Override
            public void onTick(long millisUntilFin1ished) {
                milliseconds = millisUntilFin1ished;
                updateTimer(btnSelected);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    public void updateTimer(Button btn){
         seconds = (int)  milliseconds/1000;
        if(seconds == 2 ){
            btn.setBackground(getResources().getDrawable(R.drawable.fotoamarillo));
            clic4.start();
        }
        else{
            btn.setBackground(getResources().getDrawable(R.drawable.btnform));
        }


    }
    public Button randomButton(int selection){
        switch (selection){
            case 0:
                return this.bt1;
            case 1:
                return this.bt2;
            case 2:
                return this.bt3;
            case 3:
                return this.bt4;

        }
        return null;
    }
}


