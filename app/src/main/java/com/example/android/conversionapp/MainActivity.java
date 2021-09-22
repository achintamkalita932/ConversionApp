package com.example.android.conversionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String value;
    String valueBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initialise() {
        EditText text_obj = (EditText) findViewById(R.id.editText);
        value = text_obj.getText().toString();

        EditText base_obj = (EditText) findViewById(R.id.base);
        valueBase = base_obj.getText().toString();
    }

    public void intent(String ans) {
        Intent new_intent = new Intent(this, ConversionActivity.class);
        new_intent.putExtra("Value1", ans);
        startActivity(new_intent);
    }

    public void convert_binary(View view) {

        initialise();

        if (!value.isEmpty() && !valueBase.isEmpty()) {
            int base = Integer.parseInt(valueBase);
            String ans;
            if (base == 10) {
                ans = Integer.toBinaryString(Integer.parseInt(value));
                intent(ans);
            }
            if (base == 8) {
                int decimal = Integer.parseInt(value, base);
                ans = Integer.toBinaryString(decimal);
                intent(ans);
            }
            if (base == 16) {
                int decimal = Integer.parseInt(value, base);
                ans = Integer.toBinaryString(decimal);
                intent(ans);
            }
        } else {
            Toast.makeText(this, "Please check whether you put the values", Toast.LENGTH_LONG).show();
        }
    }

    public void convert_decimal(View view) {

        initialise();

        if (!value.isEmpty() && !valueBase.isEmpty()) {
            int decimal = Integer.parseInt(value, Integer.parseInt(valueBase));
            String ans = String.valueOf(decimal);
            intent(ans);
        } else {
            Toast.makeText(this, "Please check whether you put the values", Toast.LENGTH_LONG).show();
        }
    }

    public void convert_hex(View view) {

        initialise();

        if (!value.isEmpty() && !valueBase.isEmpty()) {
            int base = Integer.parseInt(valueBase);
            String ans;
            if (base == 10) {
                ans = Integer.toHexString(Integer.parseInt(value));
                intent(ans);
            }
            if (base == 8) {
                int decimal = Integer.parseInt(value, base);
                ans = Integer.toHexString(decimal);
                intent(ans);
            }
            if (base == 2) {
                int decimal = Integer.parseInt(value, base);
                ans = Integer.toHexString(decimal);
                intent(ans);
            }
        } else {
            Toast.makeText(this, "Please check whether you put the values", Toast.LENGTH_LONG).show();
        }
    }

    public void convert_octal(View view) {

        initialise();

        if (!value.isEmpty() && !valueBase.isEmpty()) {
            int base = Integer.parseInt(valueBase);
            String ans;
            if (base == 10) {
                ans = Integer.toOctalString(Integer.parseInt(value));
                intent(ans);
            }
            if (base == 16) {
                int decimal = Integer.parseInt(value, base);
                ans = Integer.toOctalString(decimal);
                intent(ans);
            }
            if (base == 2) {
                int decimal = Integer.parseInt(value, base);
                ans = Integer.toOctalString(decimal);
                intent(ans);
            }
        } else {
            Toast.makeText(this, "Please check whether you put the values", Toast.LENGTH_LONG).show();
        }
    }
}