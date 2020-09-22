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
    String s,aas,sS,aS,hS;
    float a,hc,aa,num,sum=0;
    int x;

    String [] boo = new String [20];
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
                R.layout.support_simple_spinner_dropdown_item, boo);
        lv.setAdapter(adp);

        for (int i = 0; i <= 19; i++) {
            if (x == 1) {
                if (i == 0) {
                    aa = num;
                } else {
                    aa = num + hc;
                }
                sum=sum+aa;
            } else if (x == 2) {
                if (i == 0) {
                    aa = num;
                } else {
                    aa = num * hc;
                }
                sum=sum+aa;
            }
            aas = Float.toString(aa);
            boo[i] = aas;
            num = Float.parseFloat(boo[i]);
        }
        c.setText("סכום הסדרה: "+sum);
    }

           private void start () {
            Intent gi = getIntent();
            //s = gi.getStringExtra("s");
            x= gi.getIntExtra("x",1);
            a = gi.getFloatExtra("a", 1);
            hc = gi.getFloatExtra("h", 1);
            //sS = Float.toString(s);
            //aS = Integer.toString(a);
            //hS = Integer.toString(h);
            num = a;
            wa.setText("האיבר הראשון: "+a);
            whc.setText("ההפרש או הכפולה: "+hc);

            }

        @Override
        public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
            m.setText("מיקום האיבר הנבחר:"+position);
        }

        public void finis (View view){
            finish();
        }
}