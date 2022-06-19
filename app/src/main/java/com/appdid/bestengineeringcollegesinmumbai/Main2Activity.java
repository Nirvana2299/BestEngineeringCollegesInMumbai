package com.appdid.bestengineeringcollegesinmumbai;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    TextView TEXT1;
    CardView SPIT, DJ, RGIT, THAKUR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TEXT1 = findViewById(R.id.twnw);
        SPIT = findViewById(R.id.w1);
        DJ = findViewById(R.id.w2);
        RGIT = findViewById(R.id.w3);
        THAKUR = findViewById(R.id.w4);

        SPIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);

            }
        });

        DJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(intent);


            }
        });
        RGIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
                startActivity(intent);


            }
        });

        THAKUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main6Activity.class);
                startActivity(intent);

            }
        });


    }
}

