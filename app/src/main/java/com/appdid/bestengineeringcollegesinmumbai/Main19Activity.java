
package com.appdid.bestengineeringcollegesinmumbai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Main19Activity extends AppCompatActivity {

    TextView Text1;
    CardView KC,SHIVAJI,ARMIET,UNIVERSAL,BHARAT,LOKMANIYA,PILLAI,INDIRA,KALSEKAR,DATTA,BHARTI,ACPATIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        Text1=findViewById(R.id.twtnm);
        KC=findViewById(R.id.tnm1);
        SHIVAJI=findViewById(R.id.tnm2);
        ARMIET=findViewById(R.id.tnm3);
        UNIVERSAL=findViewById(R.id.tnm4);
        BHARAT=findViewById(R.id.tnm5);
        LOKMANIYA=findViewById(R.id.tnm6);
        PILLAI=findViewById(R.id.tnm7);
        INDIRA=findViewById(R.id.tnm8);
        KALSEKAR=findViewById(R.id.tnm9);
        DATTA=findViewById(R.id.tnm10);
        BHARTI=findViewById(R.id.tnm11);
        ACPATIL=findViewById(R.id.tnm12);

        KC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main20Activity.class);
                startActivity(intent);
            }
        });
        SHIVAJI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main21Activity.class);
                startActivity(intent);
            }
        });
        ARMIET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main22Activity.class);
                startActivity(intent);
            }
        });
        UNIVERSAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main23Activity.class);
                startActivity(intent);
            }
        });
        BHARAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main24Activity.class);
                startActivity(intent);
            }
        });
        LOKMANIYA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main25Activity.class);
                startActivity(intent);
            }
        });
        PILLAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main26Activity.class);
                startActivity(intent);
            }
        });
        INDIRA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main27Activity.class);
                startActivity(intent);
            }
        });
        KALSEKAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main28Activity.class);
                startActivity(intent);
            }
        });
        DATTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main29Activity.class);
                startActivity(intent);
            }
        });
        BHARTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main30Activity.class);
                startActivity(intent);
            }
        });
        ACPATIL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main19Activity.this,Main31Activity.class);
                startActivity(intent);
            }
        });

    }
}
