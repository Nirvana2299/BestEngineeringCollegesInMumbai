package com.appdid.bestengineeringcollegesinmumbai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView TEXT;
    CardView NWM, NEM, NCM, SM, TNM, TC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TEXT = findViewById(R.id.tw);
        NWM = findViewById(R.id.b1);
        NEM = findViewById(R.id.b2);
        NCM = findViewById(R.id.b3);
        SM = findViewById(R.id.b4);
        TNM = findViewById(R.id.b5);
        TC = findViewById(R.id.b6);

        NWM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        NEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main7Activity.class);
                startActivity(intent);
            }
        });

        NCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main11Activity.class);
                startActivity(intent);
            }
        });

        SM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main17Activity.class);
                startActivity(intent);
            }
        });
        TNM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main19Activity.class);
                startActivity(intent);
            }
        });
        TC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main32Activity.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.id1:
                Intent myintent = new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plain");
                String shareBody = "Your Body Here";
                String shareSub = "Your Subject Here";
                myintent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                myintent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myintent, "Share Using"));

                break;
            case R.id.id2:

                Intent intent=new Intent(MainActivity.this,feedback.class);
                startActivity(intent);

                break;
            case R.id.id3:

                Intent intent1 =new Intent(MainActivity.this,aboutus.class);
                startActivity(intent1);

                break;
            case R.id.id4:

                Intent intent2 =new Intent(MainActivity.this,specialthanks.class);
                startActivity(intent2);
        }

return super.onOptionsItemSelected(item);
    }
}

