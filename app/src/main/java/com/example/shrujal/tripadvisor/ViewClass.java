package com.example.shrujal.tripadvisor;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Shrujal on 29-10-2017.
 */

public class ViewClass extends AppCompatActivity {

    TextView t;
    TextView tvView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);
          tvView = (TextView) findViewById(R.id.Places);
        t=(TextView)findViewById(R.id.Places);
        Typeface mycustomfont=Typeface.createFromAsset(getAssets(),"fonts/travelingthrough-maisfontes.otf");
        t.setTypeface(mycustomfont);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        tvView.setText( "PLACES TO VISIT NEAR \n"+fName);

    }

}
