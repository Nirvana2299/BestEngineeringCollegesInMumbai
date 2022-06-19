package com.appdid.bestengineeringcollegesinmumbai;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Main8Activity extends AppCompatActivity {

    long contact=2266449191L;

    CardView GMAP,WEBSITE,CALL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        GMAP=findViewById(R.id.cw1);
        WEBSITE=findViewById(R.id.cw2);
        CALL=findViewById(R.id.cw3);

        GMAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url ="https://www.google.com/maps/place/K.+J.+Somaiya+College+of+Engineering/@19.0730847,72.8976334,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7c627a20bcaa9:0xb2fd3bcfeac0052a!8m2!3d19.0730847!4d72.8998221";
                Intent gmapintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(gmapintent);

            }
        });
        WEBSITE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Web ="https://kjsce.somaiya.edu/kjsce?/kjsce";
                Intent webintent =new Intent(Intent.ACTION_VIEW, Uri.parse(Web));
                startActivity(webintent);

            }
        });
        CALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+"0"+contact));
                startActivity(intent);

            }
        });


    }
}
