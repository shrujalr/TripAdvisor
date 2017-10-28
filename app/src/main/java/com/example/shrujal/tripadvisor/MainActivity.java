package com.example.shrujal.tripadvisor;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity/* implements View.OnClickListener */{
    TextView t;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.text1);
        Typeface mycustomfont=Typeface.createFromAsset(getAssets(),"fonts/alpha_echo.ttf");
        t.setTypeface(mycustomfont);
    }
    public void clickFunction(View v)
    {
        Intent intent = new Intent(this, FirstPage.class);
        startActivity(intent);
    }
  /*  Button btnSubmit;
    EditText etFName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFName = (EditText) findViewById(R.id.editText3);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

        }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("fname", etFName.getText().toString());

        startActivity(intent);
    }*/

}
