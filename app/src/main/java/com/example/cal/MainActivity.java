package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.Btn1);
        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==findViewById(R.id.Btn1)){
            Intent inte=new Intent();
            inte.setClass(this,Calulator.class);
            startActivity(inte);
        }
    }
}