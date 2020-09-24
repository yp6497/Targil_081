package com.example.targil_081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class hazaga extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lv;
    TextView wa, whc, m, c;
    String xisovS;
    float a,hc,xisov,num,sum=0;
    int x,y;

    String [] eivar = new String [20];
    Float [] sumA = new Float [20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazaga);

        lv = findViewById(R.id.lv);
        wa = findViewById(R.id.wa);
        whc = findViewById(R.id.wh);
        m = findViewById(R.id.m);
        c = findViewById(R.id.c);

        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        start();

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, eivar);
        lv.setAdapter(adp);

        for (int i = 0; i <20; i++) {
            if (x == 1) {
                if (i == 0) {
                    xisov = num;
                    sum=num;
                } else {
                    xisov = num + hc;
                    sum=sum+xisov;
                }

            } else if (x == 2) {
                if (i == 0) {
                    xisov = num;
                    sum=num;
                } else {
                    xisov = num * hc;
                    sum=sum+xisov;
                }
            }
            sumA[i]=sum;
            xisovS = Float.toString(xisov);
            eivar[i] = xisovS;
            num = Float.parseFloat(eivar[i]);
        }
    }

           private void start () {

            Intent gi = getIntent();
            x= gi.getIntExtra("x",1);
            a = gi.getFloatExtra("a", 1);
            hc = gi.getFloatExtra("h", 1);
            num = a;
            wa.setText("האיבר הראשון: "+a);
            whc.setText("ההפרש או הכפולה: "+hc);
    }

        @Override
        public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
            y=position+1;
            m.setText("מיקום האיבר הנבחר:"+y);
            c.setText("סכום הסדרה: "+sumA[position]);
            }

        public void finis (View view){
            finish();
    }
}