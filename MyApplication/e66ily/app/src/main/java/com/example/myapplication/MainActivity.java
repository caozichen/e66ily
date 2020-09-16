package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TextView textResult = (TextView)findViewById(R.id.jieguo);
        final TextView textGuocheng = (TextView)findViewById(R.id.guocheng);

        Button btn1 = (Button)findViewById(R.id.Button1);
        Button btn2 = (Button)findViewById(R.id.Button2);
        Button btn3 = (Button)findViewById(R.id.Button3);
        Button btn4 = (Button)findViewById(R.id.Button4);
        Button btn5 = (Button)findViewById(R.id.Button5);
        Button btn6 = (Button)findViewById(R.id.Button6);
        Button btn7 = (Button)findViewById(R.id.Button7);
        Button btn8 = (Button)findViewById(R.id.Button8);
        Button btn9 = (Button)findViewById(R.id.Button9);
        Button btn0 = (Button)findViewById(R.id.Button0);
        Button dian = (Button)findViewById(R.id.dian);

        Button jia = (Button)findViewById(R.id.jia);
        Button jian = (Button)findViewById(R.id.jian);
        Button cheng = (Button)findViewById(R.id.cheng);
        Button chu = (Button)findViewById(R.id.chu);
        Button dengyu = (Button)findViewById(R.id.dengyu);
        Button zuokuohao = (Button)findViewById(R.id.zuokuohao);
        Button youkuohao = (Button)findViewById(R.id.youkuohao);

        Button AC = (Button)findViewById(R.id.ButtonAC);
        Button C = (Button)findViewById(R.id.ButtonC);

        Button sin = (Button)findViewById(R.id.sin);
        Button cos = (Button)findViewById(R.id.cos);
        Button tan = (Button)findViewById(R.id.tan);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGuocheng.setText(textGuocheng.getText() + "9");
            }
        });
     //   setContentView(R.layout.activity_main);

     //   Button button = findViewById(R.id.bottom);
      //  final TextView textView = findViewById(R.id.textview);

       // button.setOnClickListener(new View.OnClickListener()){

        //}
    }



}