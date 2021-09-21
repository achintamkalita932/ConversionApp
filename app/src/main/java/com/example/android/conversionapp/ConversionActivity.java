package com.example.android.conversionapp;

import static com.example.android.conversionapp.R.layout.activity_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ConversionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_conversion);

        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");

        EditText new_text2 = (EditText) findViewById(R.id.editText2);
        new_text2.setText(value1);
    }
}