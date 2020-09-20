package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.SymbolTable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

//        TextView jieguo = (TextView) findViewById(R.id.jieguo);





//        Button sin = (Button)findViewById(R.id.sin);
//        Button cos = (Button)findViewById(R.id.cos);
//        Button tan = (Button)findViewById(R.id.tan);



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

    public void onClick(View view){

       switch (view.getId()){
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


//           case R.id.dengyu:
//           {
//               input = (TextView)findViewById(R.id.jieguo);
//               String strContent = input.getText().toString();
//
//               try {
//
//               }
//           }
       }
    }



}