package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    String str[]={"Noun","Pronoun","Adjective","Verb","Adverb","Preposition","Conjuction","Interjection","Tense","Voice","Articals","Punctuations","Gender","Numbers","Direct/Indirect Speech","Not only...but also"};
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        l=findViewById(R.id.lst_concept);

        Intent intent=getIntent();

        ArrayAdapter<String> adpt=new ArrayAdapter<String>(getApplicationContext(),R.layout.listcustom,str);
        l.setAdapter(adpt);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getApplicationContext(), str[position], Toast.LENGTH_LONG).show();
                if (str[position].equals("Noun")) {
                    //Toast.makeText(getApplicationContext(),"Noun",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Nint=new Intent(getApplicationContext(),Noun.class);
                    startActivity(Nint);
                }
                if(str[position].equals("Pronoun"))
                {
                    //Toast.makeText(getApplicationContext(),"ProNoun",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Pnint=new Intent(getApplicationContext(),Pronoun.class);
                    startActivity(Pnint);
                }
                if(str[position].equals("Adjective"))
                {
                    //Toast.makeText(getApplicationContext(),"Adjective",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Adint=new Intent(getApplicationContext(),Adjective.class);
                    startActivity(Adint);
                }
                if(str[position].equals("Verb"))
                {
                   // Toast.makeText(getApplicationContext(),"Verb",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Vint=new Intent(getApplicationContext(),Verb.class);
                    startActivity(Vint);
                }
                if(str[position].equals("Adverb"))
                {
                    //Toast.makeText(getApplicationContext(),"Adverb",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Advint=new Intent(getApplicationContext(),Adverb.class);
                    startActivity(Advint);
                }
                if(str[position].equals("Preposition"))
                {
                    //Toast.makeText(getApplicationContext(),"Preposition",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Prepint=new Intent(getApplicationContext(),Preposition.class);
                    startActivity(Prepint);
                }
                if(str[position].equals("Conjuction"))
                {
                    //Toast.makeText(getApplicationContext(),"Conjuction",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Conint=new Intent(getApplicationContext(),Conjunction.class);
                    startActivity(Conint);
                }
                if(str[position].equals("Interjection"))
                {
                    //Toast.makeText(getApplicationContext(),"Interjection",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Interint=new Intent(getApplicationContext(),Interjection.class);
                    startActivity(Interint);
                }
                if(str[position].equals("Tense"))
                {
                    //Toast.makeText(getApplicationContext(),"Tense",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Tenint=new Intent(getApplicationContext(),Tense.class);
                    startActivity(Tenint);
                }
                if(str[position].equals("Voice"))
                {
                    //Toast.makeText(getApplicationContext(),"Voice",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Voint=new Intent(getApplicationContext(),Voice.class);
                    startActivity(Voint);
                }
                if(str[position].equals("Articals"))
                {
                    //Toast.makeText(getApplicationContext(),"Articals",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Artint=new Intent(getApplicationContext(),Articals.class);
                    startActivity(Artint);
                }
                if(str[position].equals("Punctuations"))
                {
                    //Toast.makeText(getApplicationContext(),"Punctuations",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Punint=new Intent(getApplicationContext(),Punctuations.class);
                    startActivity(Punint);
                }
                if(str[position].equals("Gender"))
                {
                    //Toast.makeText(getApplicationContext(),"Gender",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Genint=new Intent(getApplicationContext(),Gender.class);
                    startActivity(Genint);
                }
                if(str[position].equals("Numbers"))
                {
                    //Toast.makeText(getApplicationContext(),"Numbers",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Numint=new Intent(getApplicationContext(),Numbers.class);
                    startActivity(Numint);
                }
                if(str[position].equals("Direct/Indirect Speech"))
                {
                    //Toast.makeText(getApplicationContext(),"Types Of Sentence",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Tosint=new Intent(getApplicationContext(),Sentence.class);
                    startActivity(Tosint);
                }
                if(str[position].equals("Not only...but also"))
                {
                    //Toast.makeText(getApplicationContext(),"Not only...but also",Toast.LENGTH_SHORT).show();
                    finish();
                    Intent Nobaint=new Intent(getApplicationContext(),Notalso.class);
                    startActivity(Nobaint);
                }
            }
        });
    }
}
