package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ArticalTest extends AppCompatActivity {
    RadioButton ra1,ra2,ra3,ra4,ra5,ra6,ra7,ra8,ra9,ra10;
    Button sub;
    int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artical_test);
        ra1=findViewById(R.id.r3);
        ra2=findViewById(R.id.r8);
        ra3=findViewById(R.id.r9);
        ra4=findViewById(R.id.r15);
        ra5=findViewById(R.id.r17);
        ra6=findViewById(R.id.r22);
        ra7=findViewById(R.id.r26);
        ra8=findViewById(R.id.r30);
        ra9=findViewById(R.id.r34);
        ra10=findViewById(R.id.r39);
        sub=findViewById(R.id.sub);

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
