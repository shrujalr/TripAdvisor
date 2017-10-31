package com.example.shrujal.tripadvisor;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstPage extends AppCompatActivity implements View.OnClickListener{

        TextView t;
    TextView t1;
    Button btnSubmit;
    EditText etFName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        etFName = (EditText) findViewById(R.id.editText3);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
        t=(TextView)findViewById(R.id.textView);
        Typeface mycustomfont=Typeface.createFromAsset(getAssets(),"fonts/CroissantOne-Regular.ttf");
        t.setTypeface(mycustomfont);

        t1=(TextView)findViewById(R.id.editText3);
         mycustomfont=Typeface.createFromAsset(getAssets(),"fonts/CroissantOne-Regular.ttf");
        t1.setTypeface(mycustomfont);

        AutoCompleteTextView autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.editText3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Place);
        autoCompleteTextView.setAdapter(adapter);

    }
    private static String[] Place=new String[]{"Nagpur","USA","Mumbai","London","UK","Austrailia","India","Afghanistan","Argentina","Hawai","Albania","Algeria","Bangladesh","Pakistan","China","Japan","singapore","Thailand","New York","Russia","Monaco","Vietnam","North Korea","South Korea","Sri Lanka"};
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ViewClass.class);
        intent.putExtra("fname", etFName.getText().toString());

        startActivity(intent);
    }

}
