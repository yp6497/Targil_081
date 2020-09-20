package com.example.targil_081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

    public class hazaga extends AppCompatActivity implements AdapterView.OnItemClickListener {

        ListView lv;
        TextView wa, whc, m, c;
        String s;
        float a, h;
        int sum = 0, cfola = 1;

        String [] boo = {"h","b","u"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hazaga);

            lv = (ListView) findViewById(R.id.lv);
            wa = findViewById(R.id.wa);
            whc = findViewById(R.id.wh);
            m = findViewById(R.id.m);
            c = findViewById(R.id.c);

            lv.setOnItemClickListener(this);
            lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

            ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item, boo);
            lv.setAdapter(adp);

            start();
        }

        private void start() {
            Intent gi = getIntent();
            s = gi.getStringExtra("s");
            a = gi.getFloatExtra("a", -1);
            h = gi.getFloatExtra("h", -1);


            //if (s == "h") {
                //for(int i=0;,i<=20;i++){

                }
                //}else if(s=="a") {
                //  sum++;

                //}
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    m.setText("position:" + position);
                }

        public void finis(View view) {
            finish();
        }
    }








