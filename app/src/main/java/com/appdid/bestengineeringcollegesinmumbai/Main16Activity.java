package com.appdid.bestengineeringcollegesinmumbai;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class Main16Activity extends AppCompatActivity {

    long contact=2267114000L;

    CardView GMAP,WEBSITE,CALL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);


        GMAP=findViewById(R.id.cw1);
        WEBSITE=findViewById(R.id.cw2);
        CALL=findViewById(R.id.cw3);

        GMAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String url ="https://www.google.co.in/maps/place/Fr.+Conceicao+Rodrigues+College+of+Engineering/@19.044497,72.8182648,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7c9410830616d:0x111b63353dbbce01!8m2!3d19.044497!4d72.8204535";
                Intent gmapintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(gmapintent);
            }
        });

        WEBSITE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Web ="https://www.frcrce.ac.in/";
                Intent webintent =new Intent(Intent.ACTION_VIEW,Uri.parse(Web));
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
