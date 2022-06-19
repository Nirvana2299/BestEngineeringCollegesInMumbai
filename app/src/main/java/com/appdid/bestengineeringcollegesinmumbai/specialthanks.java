package com.appdid.bestengineeringcollegesinmumbai;

import android.content.Intent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class specialthanks extends AppCompatActivity {

    long contact=9967856357L;

    CardView GMAP,WEBSITE,CALL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialthanks);
        GMAP=findViewById(R.id.cw1);
        WEBSITE=findViewById(R.id.cw2);
        CALL=findViewById(R.id.cw3);

        GMAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String url ="https://www.google.com/maps?q=appdid+infotech+thane&rlz=1C1CHBF_enIN850IN850&um=1&ie=UTF-8&sa=X&ved=0ahUKEwjZrd2OsuviAhXbbSsKHe36C2UQ_AUIECgB";
                Intent gmapintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(gmapintent);
            }
        });

        WEBSITE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Web ="https://appdid.com/";
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

