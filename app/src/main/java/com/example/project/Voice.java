package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Voice extends AppCompatActivity {
    Button tut,test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice);
        Intent intent=getIntent();
        tut=findViewById(R.id.tut);
        test=findViewById(R.id.test);
        tut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.youtube.com/watch?v=VLh4tGWt_bA"));
                startActivity(i);
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i=new Intent(getApplicationContext(),VoiceTest.class);
                startActivity(i);
            }
        });
    }
}
