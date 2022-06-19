package com.appdid.bestengineeringcollegesinmumbai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {


    TextView TEXT1;
    CardView KJSO,IITB,VANAND;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        TEXT1 = findViewById(R.id.twnw);
        KJSO = findViewById(R.id.east1);
        IITB = findViewById(R.id.e2);
        VANAND= findViewById(R.id.e3);


        KJSO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main7Activity.this, Main8Activity.class);
                startActivity(intent);

            }
        });

        IITB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main7Activity.this, Main9Activity.class);
                startActivity(intent);


            }
        });
        VANAND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(Main7Activity.this, Main10Activity.class);
               startActivity(intent);


            }
        });


    }
}

