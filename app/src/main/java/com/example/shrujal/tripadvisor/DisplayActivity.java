package com.example.shrujal.tripadvisor;

/**
 * Created by Shrujal on 25-10-2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display1);

        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.nameValue);

        name.setText(b.getCharSequence("name"));

    }
}