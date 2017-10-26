package com.example.shrujal.tripadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Shrujal on 26-10-2017.
 */

public class Hotels extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("Hotels near You");
        setContentView(textView);
    }
}
