package com.appdid.bestengineeringcollegesinmumbai;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main17Activity extends AppCompatActivity {


    TextView TEXT1;
    CardView SABOO,SNDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        TEXT1 = findViewById(R.id.tws);
        SABOO = findViewById(R.id.s1);


        SABOO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main17Activity.this, Main18Activity.class);
                startActivity(intent);

            }
        });




    }
}