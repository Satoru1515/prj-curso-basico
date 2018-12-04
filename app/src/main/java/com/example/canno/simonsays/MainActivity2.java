package com.example.canno.simonsays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button bt_Restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_floot);

        bt_Restart = (Button)findViewById(R.id.btn_re);

        bt_Restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restart = new  Intent(MainActivity2.this, MainActivity1.class);
            }
        });



    }
}
