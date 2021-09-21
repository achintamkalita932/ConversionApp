package com.example.android.conversionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert_binary(View view) {
        EditText text_obj = (EditText) findViewById(R.id.editText);
        String value = text_obj.getText().toString();

        if (!value.isEmpty()) {
            int n = Integer.parseInt(value);

            String ans;
            ans = Integer.toBinaryString(n);

            Intent new_intent = new Intent(this, ConversionActivity.class);
            new_intent.putExtra("Value1", ans);
            startActivity(new_intent);
        } else {
            Toast.makeText(this, "No Value is Passed", Toast.LENGTH_LONG).show();
        }
    }

    public void convert_decimal(View view) {
        EditText text_obj = (EditText) findViewById(R.id.editText);
        String value = text_obj.getText().toString();

        EditText base_obj = (EditText) findViewById(R.id.base);
        String valueBase = base_obj.getText().toString();

        if (!value.isEmpty() && !valueBase.isEmpty()) {
            int base_value = Integer.parseInt(valueBase);
            int decimal = Integer.parseInt(value, base_value);
            Intent new_intent = new Intent(this, ConversionActivity.class);
            new_intent.putExtra("Value1", String.valueOf(decimal));
            startActivity(new_intent);
        } else {
            Toast.makeText(this, "No Value is Passed", Toast.LENGTH_LONG).show();
        }
    }

    public void convert_hex(View view) {
        EditText text_obj = (EditText) findViewById(R.id.editText);
        String value = text_obj.getText().toString();

        if (!value.isEmpty()) {
            int n = Integer.parseInt(value);

            String ans;
            ans = Integer.toHexString(n);

            Intent new_intent = new Intent(this, ConversionActivity.class);
            new_intent.putExtra("Value1", ans);
            startActivity(new_intent);
        } else {
            Toast.makeText(this, "No Value is Passed", Toast.LENGTH_LONG).show();
        }
    }

    public void convert_octal(View view) {
        EditText text_obj = (EditText) findViewById(R.id.editText);
        String value = text_obj.getText().toString();

        if (!value.isEmpty()) {
            int n = Integer.parseInt(value);

            String ans;
            ans = Integer.toOctalString(n);

            Intent new_intent = new Intent(this, ConversionActivity.class);
            new_intent.putExtra("Value1", ans);
            startActivity(new_intent);
        } else {
            Toast.makeText(this, "No Value is Passed", Toast.LENGTH_LONG).show();
        }
    }
}