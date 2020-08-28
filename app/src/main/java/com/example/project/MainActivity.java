package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button start_learn;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.logo);
        start_learn=findViewById(R.id.btn_start);
        Animation clock= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        img.startAnimation(clock);
        Animation zoom= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        start_learn.startAnimation(zoom);
        start_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_list=new Intent(getApplicationContext(),InformationPage.class);
                startActivity(intent_list);
            }
        });
    }
}
