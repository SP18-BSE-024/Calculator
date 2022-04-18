package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calulator extends AppCompatActivity implements View.OnClickListener{
    private Button ad,sub,div,mul;
    private EditText num1,num2,ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calulator);
        ad=findViewById(R.id.add);
        sub=findViewById(R.id.subtract);
        div=findViewById(R.id.divide);
        mul=findViewById(R.id.multiply);
        num1=findViewById(R.id.ED1);
        num2=findViewById(R.id.ED2);
        ans=findViewById(R.id.Answer);
        ad.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        ans.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        float first,second,result;
        if(ad==v.findViewById(R.id.add)){

            first=Float.parseFloat(num1.getText().toString());
            second=Float.parseFloat(num2.getText().toString());
            result=first+second;
            ans.setText(""+result);

        }else if(sub==v.findViewById(R.id.subtract)){
            first=Float.parseFloat(num1.getText().toString());
            second=Float.parseFloat(num2.getText().toString());
            result=first-second;
            ans.setText(""+result);
        }else if(div==v.findViewById(R.id.divide)){
            first=Float.parseFloat(num1.getText().toString());
            second=Float.parseFloat(num2.getText().toString());
            result=first/second;
            ans.setText(""+result);
        }else if(mul==v.findViewById(R.id.multiply)){
            first=Float.parseFloat(num1.getText().toString());
            second=Float.parseFloat(num2.getText().toString());
            result=first*second;
            ans.setText(""+result);
        }

    }
}