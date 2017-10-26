package com.example.shrujal.tripadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Shrujal on 26-10-2017.
 */

public class Restaurants extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("Restaurants Near You ");
        setContentView(textView);
    }
}
