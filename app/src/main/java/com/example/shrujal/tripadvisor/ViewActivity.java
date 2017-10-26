package com.example.shrujal.tripadvisor;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

public class ViewActivity extends TabActivity {
    TextView tvView;
    private TabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);
      //  tvView = (TextView) findViewById(R.id.tvView);

        //Intent intent = getIntent();

        //String fName = intent.getStringExtra("fname");
        //tvView.setText("Your Destination  is: " + fName );
        mTabHost=getTabHost();
        TabHost.TabSpec spec;
        Intent intent1;
        Intent intent2;
        //Restaurants
        intent1=new Intent(this,Restaurants.class);
        spec=mTabHost.newTabSpec("Places to visit").setIndicator("Places to visit").setContent(intent1);
        mTabHost.addTab(spec);
        //hotels
        intent2=new Intent(this,Hotels.class);
        spec=mTabHost.newTabSpec("Hotels").setIndicator("Hotels").setContent(intent2);
        mTabHost.addTab(spec);



    }
}