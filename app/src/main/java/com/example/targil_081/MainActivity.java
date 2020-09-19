package com.example.targil_081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edS,edA,edH;
    String sS,sA,sH;
    float a,h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            edS=findViewById(R.id.edS);
            edA=findViewById(R.id.edA);
            edH=findViewById(R.id.edH);
        }

        public void start(View view) {
            sS=edS.getText().toString();
            sA=edA.getText().toString();
            sH=edH.getText().toString();
            if(sS.isEmpty()||sA.isEmpty()||sH.isEmpty()) {
               Toast.makeText(this,"please fill all thr feilds", Toast.LENGTH_SHORT).show();
            }
            else {
                a=Float.parseFloat(sA);
                h=Float.parseFloat(sH);
                Intent si = new Intent(this,hazaga.class);
                si.putExtra("s",sS);
                si.putExtra("a",a);
                si.putExtra("h",h);
                startActivity(si);
            }
        }
    }

