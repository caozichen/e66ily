package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class zhuanshi extends AppCompatActivity {
    TextView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tran);
    }

    public void shiliui(View view) {
        v1 = (TextView) findViewById(R.id.tsix);
        String res = v1.getText().toString();
        long num = Long.parseLong(res, 16);
        String s = Long.toString(num);
        v1.setText(s + "(10)");
    }


    public void ba(View view) {
        v1 = (TextView) findViewById(R.id.eig);
        String res = v1.getText().toString();
        int num = Integer.parseInt(res, 8);
        String s = String.valueOf(num);
        v1.setText(s + "(10)");
    }

    public void er(View view) {
        v1 = (TextView) findViewById(R.id.two);
        String res = v1.getText().toString();
        int num = Integer.parseInt(res, 2);
        String s = String.valueOf(num);
        v1.setText(s + "(10)");
    }

    public void kg(View view){
        v1 = (TextView)findViewById(R.id.kg);
        String res = v1.getText().toString();
        int num = Integer.parseInt(res) * 1000;
        String s = String.valueOf(num);
        v1.setText(s + "g");
    }

    public void ms(View view){
        v1 = (TextView)findViewById(R.id.ms);
        String res = v1.getText().toString();
        double num = Double.parseDouble(res) * (3.6);
        String s = String.valueOf(num);
        v1.setText(s + "km/h");
    }

    public void lifang(View view){
        v1 = (TextView)findViewById(R.id.lifang);
        String res = v1.getText().toString();
        double num = Double.parseDouble(res) * (1000000);
        String s = String.valueOf(num);
        v1.setText(s + "cm³");
    }
}