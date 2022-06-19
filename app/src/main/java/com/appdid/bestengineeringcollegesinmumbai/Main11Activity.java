package com.appdid.bestengineeringcollegesinmumbai;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main11Activity extends AppCompatActivity {


    TextView TEXT1;
    CardView VJTI, VIDYA, RIZVI, THA, FRC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        TEXT1 = findViewById(R.id.twnc);
        VJTI = findViewById(R.id.c1);
        VIDYA = findViewById(R.id.c2);
        RIZVI = findViewById(R.id.c3);
        THA = findViewById(R.id.c4);
        FRC = findViewById(R.id.c5);

        VJTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main11Activity.this, Main12Activity.class);
                startActivity(intent);

            }
        });

        VIDYA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main11Activity.this, Main13Activity.class);
                startActivity(intent);


            }
        });
        RIZVI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main11Activity.this, Main14Activity.class);
                startActivity(intent);


            }
        });

        THA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main11Activity.this, Main15Activity.class);
                startActivity(intent);

            }
        });
        FRC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main11Activity.this, Main16Activity.class);
                startActivity(intent);

            }
        });


    }

}



