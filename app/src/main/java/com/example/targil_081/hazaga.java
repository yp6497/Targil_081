package com.example.targil_081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class hazaga extends AppCompatActivity {

    //ListView lv;
    TextView wa,whc,m,c;
    String s;
    float a,h;
    //int sum=0,cfola=1;

    String [] eivar= new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazaga);

        //lv=(ListView) findViewById(R.id.lv);
        wa=findViewById(R.id.wa);
        whc=findViewById(R.id.wh);
        m=findViewById(R.id.m);
        c=findViewById(R.id.c);

        //ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
          //     R.layout.support_simple_spinner_dropdown_item, eivar);
        //lv.setAdapter(adp);

        start();
    }

    private void start() {
        Intent gi = getIntent();
        s=gi.getStringExtra("s");
        a=gi.getFloatExtra("a",1);
        h=gi.getFloatExtra("h",1);
        wa.setText("the first: "+a);
        whc.setText("the hfresh: "+h);
        /*
        float sum= h;
        if(s=="h") {
            for(int i=0;i<=20;i++) {
                //eivar[i]= String.valueOf(sum+a);
                sum++;
            }

        }
        else if(s=="הנדסית") {
            sum++;
    */

        }

    }
