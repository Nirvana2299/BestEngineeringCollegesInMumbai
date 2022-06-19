package com.appdid.bestengineeringcollegesinmumbai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.View;

public class Main32Activity extends AppCompatActivity {

    CardView IITB,VJTI,VIVEK,SARDAR,KJS,DJS,VIDYA,THA,RJIT,THAKUR,RIZVI,SABOO,BHARTI,ACP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);

        IITB=findViewById(R.id.tc1);
        VJTI=findViewById(R.id.tc2);
        VIVEK=findViewById(R.id.tc3);
        SARDAR=findViewById(R.id.tc4);
        KJS=findViewById(R.id.tc5);
        DJS=findViewById(R.id.tc6);
        VIDYA=findViewById(R.id.tc7);
        THA=findViewById(R.id.tc8);
        RJIT=findViewById(R.id.tc9);
        THAKUR=findViewById(R.id.tc10);
        RIZVI=findViewById(R.id.tc11);
        SABOO=findViewById(R.id.tc12);
        BHARTI=findViewById(R.id.tc13);
        ACP=findViewById(R.id.tc14);

        IITB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main9Activity.class);
                startActivity(intent);
            }
        });
        VJTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main12Activity.class);
                startActivity(intent);
            }
        });
        VIVEK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main10Activity.class);
                startActivity(intent);
            }
        });
        SARDAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
        KJS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main8Activity.class);
                startActivity(intent);
            }
        });
        DJS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
        VIDYA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main13Activity.class);
                startActivity(intent);
            }
        });
        THA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main15Activity.class);
                startActivity(intent);
            }
        });
        RJIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main5Activity.class);
                startActivity(intent);
            }
        });
        THAKUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
        RIZVI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main14Activity.class);
                startActivity(intent);
            }
        });
        SABOO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main18Activity.class);
                startActivity(intent);
            }
        });
        BHARTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main30Activity.class);
                startActivity(intent);
            }
        });
        ACP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main32Activity.this,Main31Activity.class);
                startActivity(intent);
            }
        });

    }
}
