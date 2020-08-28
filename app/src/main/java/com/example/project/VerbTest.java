package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class VerbTest extends AppCompatActivity {
    RadioButton ra1,ra2,ra3,ra4,ra5,ra6,ra7,ra8,ra9,ra10;
    Button sub;
    int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verb_test);
        sub=findViewById(R.id.sub);
        ra1=findViewById(R.id.r2);
        ra2=findViewById(R.id.r5);
        ra3=findViewById(R.id.r10);
        ra4=findViewById(R.id.r13);
        ra5=findViewById(R.id.r17);
        ra6=findViewById(R.id.r24);
        ra7=findViewById(R.id.r27);
        ra8=findViewById(R.id.r31);
        ra9=findViewById(R.id.r35);
        ra10=findViewById(R.id.r37);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ra1.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra2.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra3.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra4.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra5.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra6.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra7.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra8.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra9.isChecked()==true)
                {
                    total=total+1;
                }
                if(ra10.isChecked()==true)
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
