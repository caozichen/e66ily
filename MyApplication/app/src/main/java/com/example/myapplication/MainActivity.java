package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.icu.text.SymbolTable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    TextView input;
    Boolean dian = false;
    Boolean haveDian  = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final TextView textResult = (TextView)findViewById(R.id.jieguo);
//        final TextView textGuocheng = (TextView)findViewById(R.id.guocheng);

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
        Button tran = (Button) findViewById(R.id.tran);


        //hengpingde

        Button sin = (Button)findViewById(R.id.sin);
        Button cos = (Button)findViewById(R.id.cos);
        Button tan = (Button)findViewById(R.id.tan);
        Button pingfang = (Button)findViewById(R.id.pingfang);
        Button lifang = (Button)findViewById(R.id.lifang);
        Button genhao = (Button)findViewById(R.id.genhao);
        Button PI = (Button)findViewById(R.id.PI);
        Button e = (Button)findViewById(R.id.e);
        Button jiecheng = (Button)findViewById(R.id.jiecheng);
        Button log10 = (Button)findViewById(R.id.log10);
        Button rand = (Button)findViewById(R.id.rand);

//        TextView jieguo = (TextView) findViewById(R.id.jieguo);









//          btn0.setOnClickListener(this);
//        btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "0");
//            }
//        });
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "1");
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "2");
//            }
//        });
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "3");
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "4");
//            }
//        });
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "5");
//            }
//        });
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "6");
//            }
//        });
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "7");
//            }
//        });
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "8");
//            }
//        });
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textGuocheng.setText(textGuocheng.getText() + "9");
//            }
//        });

     //   Button button = findViewById(R.id.bottom);
      //  final TextView textView = findViewById(R.id.textview);

       // button.setOnClickListener(new View.OnClickListener()){

        //}
    }


    protected void onRestar(){
        super.onRestart();
    }

    protected void onStart(){
        super.onStart();
    }

    protected void onResume(){
        super.onResume();
    }

    protected void onPause(){
        super.onPause();
    }

    protected void onStop(){
        super.onStop();
    }

    protected void onDestroy(){
        super.onDestroy();
    }
    public void onClick(View view){

       switch (view.getId()){
//           Configuration mConfiguration = this.getResources().getConfiguration(); //获取设置的配置信息
//           int ori = mConfiguration.orientation; //获取屏幕方向
           case R.id.Button0:
           case R.id.Button1:
           case R.id.Button2:
           case R.id.Button3:
           case R.id.Button4:
           case R.id.Button5:
           case R.id.Button6:
           case R.id.Button7:
           case R.id.Button8:
           case R.id.Button9:
           case R.id.jia:
           case R.id.jian:
           case R.id.cheng:
           case R.id.chu:
           case R.id.zuokuohao:
           case R.id.youkuohao:


               Button btn = (Button)view;
               String addContent = btn.getText().toString();
               if(addContent.equals("+")||addContent.equals("-")||addContent.equals("*")||addContent.equals("/")){
                   dian = false;
               }
               input = (TextView)findViewById(R.id.jieguo);
               String now = input.getText().toString();
               String newContent;
               if(now.equals("0")){
                   newContent = addContent;
               }
               else{
                   newContent = now + addContent;
               }
               input.setText(newContent);
               break;

           case R.id.ButtonAC:{
               String kong = "0";
               input = (TextView)findViewById(R.id.jieguo); //???
               input.setText(kong);
               dian = false;
               break;
           }

           case R.id.ButtonC:{
               input = (TextView)findViewById(R.id.jieguo);
               String nowC = input.getText().toString();
               String newContentC;

               if(nowC.length()==1){
                   newContentC = "0";
               }
               else{
                   newContentC = nowC.substring(0,nowC.length()-1);
               }


               for(int i = 0; i<newContentC.length();i++){
                   String str1 = newContentC.substring(i,i+1);
                   if(str1.equals(".")){
                       haveDian = true;
                   }
               }

               if(haveDian == true){
                   dian = true;
                   haveDian = false;
               }
               else if(haveDian == false){
                   dian = false;
               }
               input.setText(newContentC);
               break;
           }

           case R.id.dian:{
               input = (TextView)findViewById(R.id.jieguo);
               String nowD = input.getText().toString();
               String newContentD;

               if(nowD.equals("0") && dian == false){
                   newContentD = nowD + ".";
                   dian = true;
               }
               else if(!nowD.equals("0") && dian == false){
                   newContentD = nowD + ".";
                   dian = true;
               }
               else{
                   newContentD = nowD;
                   dian = true;
               }
               input.setText(newContentD);
               break;
           }


            case R.id.sin:{
                    input = (TextView)findViewById(R.id.jieguo);
                    String nowSin = input.getText().toString();
                    String newContentSin;

                    if(isInteger(nowSin)){
                        newContentSin = Math.sin((Double.parseDouble(nowSin)/180*Math.PI)) + "";
                    }
                    else{
                        newContentSin = "Error!";
                    }

                    input.setText(newContentSin);
                    break;

                }

           case R.id.cos:{
               input = (TextView)findViewById(R.id.jieguo);
               String nowCos = input.getText().toString();
               String newContentCos;

               if(isInteger(nowCos)){
                   newContentCos = Math.cos((Double.parseDouble(nowCos)/180*Math.PI)) + "";
               }
               else{
                   newContentCos = "Error!";
               }

               input.setText(newContentCos);
               break;

           }
           case R.id.tan:{
               input = (TextView)findViewById(R.id.jieguo);
               String nowTan = input.getText().toString();
               String newContentTan;

               if(isInteger(nowTan)){
                   newContentTan = Math.tan((Double.parseDouble(nowTan)/180*Math.PI)) + "";
               }
               else{
                   newContentTan = "Error!";
               }

               input.setText(newContentTan);
               break;

           }

           case R.id.PI:{
               input = (TextView)findViewById(R.id.jieguo);
               input.setText(Math.PI + "");
               break;
           }

           case R.id.e:{
               input = (TextView)findViewById(R.id.jieguo);
               input.setText(Math.E + "");
               break;
           }

           case R.id.pingfang:{
               input = (TextView)findViewById(R.id.jieguo);
               try {
                   input.setText(Math.pow(Double.parseDouble(input.getText().toString()),2) + "");
               }catch (NumberFormatException e){
                   throw new NumberFormatException("For input string: " + input.getText().toString());
               }
//               finally {
//                   input.setText("Error!");
//               }
               break;
           }

           case R.id.lifang:{
               input = (TextView)findViewById(R.id.jieguo);
               try {
                   input.setText(Math.pow(Double.parseDouble(input.getText().toString()),3) + "");
               }catch (NumberFormatException e){
                   throw new NumberFormatException("For input string: " + input.getText().toString());
               }
//               finally {
//                   input.setText("Error!");
//               }
               break;
           }

           case R.id.genhao:{
               input = (TextView)findViewById(R.id.jieguo);
               try {
                   input.setText(Math.pow(Double.parseDouble(input.getText().toString()),0.5) + "");
               }catch (NumberFormatException e){
                   throw new NumberFormatException("For input string: " + input.getText().toString());
               }
//               finally {
//                   input.setText("Error!");
//               }
               break;
           }

           case R.id.rand:{
               input = (TextView)findViewById(R.id.jieguo);
               input.setText(Math.random() + "");
               break;
           }

           case R.id.jiecheng:{
               input = (TextView)findViewById(R.id.jieguo);
               String nowJie = input.getText().toString();
               String newContentJie;
               int ans = 1;

               if(isInteger(nowJie)&&Integer.parseInt(nowJie)>0){
                   for(int i = 0;i<Integer.parseInt(nowJie);i++){
                       ans = ans*(Integer.parseInt(nowJie)-i);
                   }

                   newContentJie = ans + "";
               }
               else{
                   newContentJie = "Error!";
               }

               input.setText(newContentJie);
               break;
           }

           case R.id.log10:{
               input = (TextView)findViewById(R.id.jieguo);
               String nowLog = input.getText().toString();
               String newContentLog;

               if(Double.parseDouble(nowLog)>0){
                   newContentLog = Math.log10(Double.parseDouble(nowLog)) + "";
               }
               else{
                   newContentLog = "Error!";
               }

               input.setText(newContentLog);
               break;
           }


//           case R.id.dengyu:
//           {
//               input = (TextView)findViewById(R.id.jieguo);
//               String strContent = input.getText().toString();
//
//               try {
//
//               }
//           }
           default:
               throw new IllegalStateException("Unexpected value: " + view.getId());
       }
//        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
//            switch (view.getId()){
//                case R.id.sin:{
//                    input = (TextView)findViewById(R.id.jieguo);
//                    String nowSin = input.getText().toString();
//                    String newContentSin;
//
//                    if(isInteger(nowSin)){
//                        newContentSin = Math.sin(Double.parseDouble(nowSin)) + "";
//                    }
//                    else{
//                        newContentSin = "Error!";
//                    }
//
//                    input.setText(newContentSin);
//                    break;
//
//                }
//
//            }
//        }

    }


    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
}