package com.example.shrujal.tripadvisor;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends Activity {
    TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);
        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
       tvView.setText("Your Destination  is: " + fName );
    }
}
