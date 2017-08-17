package com.example.mauro.playmusicservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.a_main_btn_start)
    Button button_start;
    @BindView(R.id.a_main_btn_stop)
    Button button_stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    public void startMusic(View view) {
        Intent intent = new Intent(this, MusicService.class);
        startService(intent);
    }


    public void stopMusic(View view) {
        Intent intent = new Intent(this, MusicService.class);
        stopService(intent);
    }
}
