package com.example.project;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class ResultDisplay extends AppCompatActivity {
    ImageView img1;
    Button go;
    TextView txt;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_display);
        img1=findViewById(R.id.img1);
        Animation blink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        img1.startAnimation(blink);
        go=findViewById(R.id.go);
        txt=findViewById(R.id.txt1);
        final Intent i=getIntent();
        int total=Integer.parseInt(i.getStringExtra("tot"));
        //startActivity(i);
        if(total>=8)
        {
            txt.setText("Congratulations you got "+total+" must of 10");
            img1.setImageResource(R.drawable.congo2);
        }
        else if(total>5 && total<8)
        {
            txt.setText("You have to improve yourself because you got only "+total+" marks");
            img1.setImageResource(R.drawable.oops);
        }
        if(total>=0 && total<=5)
        {
            txt.setText("You must have to study you got "+total+" marks");
            img1.setImageResource(R.drawable.oops);
        }
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i=new Intent(getApplicationContext(),ListActivity.class);
                startActivity(i); } });     }   }
