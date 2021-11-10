package com.example.accout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private EditText t1;
    private EditText t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        t1=(EditText) findViewById(R.id.editTextNumber);
        t2=(EditText) findViewById(R.id.editTextNumber2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            double t11 = Double.parseDouble(t1.getText().toString());
            double t12=t11*t11;
            double t13=Double.parseDouble(t2.getText().toString())/t12;
            double fresult=t13*10000;
                TextView dia=(TextView) findViewById(R.id.textView5);
                TextView ty=(TextView)findViewById(R.id.textView7) ;
                String t14 = String.valueOf(fresult);
                ty.setText("BMI值："+t14);
                if(fresult<18.5)                                  //判斷BMI的數值
                    dia.setText("體重過輕");
                else if(fresult>=18.5&&fresult<24)
                    dia.setText("正常範圍");
                else if(fresult>=24&&fresult<27)
                    dia.setText("過重");
                else if(fresult>=27&&fresult<30)
                    dia.setText("輕度肥胖");
                else if(fresult>=30&&fresult<35)
                    dia.setText("中度肥胖");
                else if(fresult>=35)
                    dia.setText("重度肥胖");}
        });

    }
}