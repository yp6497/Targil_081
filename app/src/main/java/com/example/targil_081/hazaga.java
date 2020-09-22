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
    float a,hc,aa,num,y;
    int x; //do we need it(1)? because maybe when there is 0 amd 1 its need to be 0 and not something else


    String [] boo = new String [20];
    //String [] boo = {"h","b","u"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazaga);

        lv = findViewById(R.id.lv);
        wa = findViewById(R.id.wa);
        whc = findViewById(R.id.wh);
        m = findViewById(R.id.m);
        c = findViewById(R.id.c);
        //String hs="h";
        //String xS="x";

        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        start();

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, boo);
        lv.setAdapter(adp);


        //if(x==2)
          //  y=num*hc;
          //if(x==1)
           // y=num+hc;

            for (int i = 0; i <= 19; i++) {
                if(x==2) {
                    if (i == 0) {
                        aa = num;
                    } else {
                        aa = num*hc; //aa=num+hc
                        aas = Float.toString(aa);
                        boo[i] = aas;
                        num = Float.parseFloat(boo[i]);
                    }
                }
                else{
                    y++;
                }

            }

        /*
            if (s == "x") {
                for (int i = 0; i <= 19; i++) {
                    if (i == 0) {
                        aa = num;
                    } else {
                        aa = num + hc;
                    }
                    aas = Float.toString(aa);
                    boo[i] = aas;
                    num = Float.parseFloat(boo[i]);
                }
            }else if(s=="h"){

         */

        }

           // }
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





            //for(int i=1;i<=7;i++){
              //  boo[i] = String.valueOf(num + h);
                //num =boo[i];
          //}
          /*
            if(x==1) {
                for (int s = 0; s <= 7; s++) {
                    boo[s] = Integer.parseInt(String.valueOf(num + h));
                    num = (int) Float.parseFloat(String.valueOf(boo[s]));
                }
            }

            if (s == "h") {
                for (int i = 0; i <= 20; i++) {
                    boo[i] = String.valueOf(num + h);
                    num = Float.parseFloat(boo[i]);
                }
            } else if (s == "a") {
                sum++;
            }
             */
            }

        @Override
        public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
            m.setText("מיקום האיבר הנבחר:"+position);
        }

        public void finis (View view){
            finish();
        }
}