package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class GenderTest extends AppCompatActivity {
    Button sub;
    RadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_test);
        sub=findViewById(R.id.sub);
        r1=findViewById(R.id.r4);
        r2=findViewById(R.id.r8);
        r3=findViewById(R.id.r12);
        r4=findViewById(R.id.r16);
        r5=findViewById(R.id.r20);
        r6=findViewById(R.id.r24);
        r7=findViewById(R.id.r28);
        r8=findViewById(R.id.r32);
        r9=findViewById(R.id.r36);
        r10=findViewById(R.id.r40);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked()==true)
                {
                    total=total+1;
                }
                if(r2.isChecked()==true)
                {
                    total=total+1;
                }
                if(r3.isChecked()==true)
                {
                    total=total+1;
                }
                if(r4.isChecked()==true)
                {
                    total=total+1;
                }
                if(r5.isChecked()==true)
                {
                    total=total+1;
                }
                if(r6.isChecked()==true)
                {
                    total=total+1;
                }
                if(r7.isChecked()==true)
                {
                    total=total+1;
                }
                if(r8.isChecked()==true)
                {
                    total=total+1;
                }
                if(r9.isChecked()==true)
                {
                    total=total+1;
                }
                if(r10.isChecked()==true)
                {
                    total=total+1;
                }
                String t=""+total;
                finish();
                Intent i=new Intent(getApplicationContext(),ResultDisplay.class);
                i.putExtra("tot",t);
                startActivity(i);
            }
        });
    }
}
