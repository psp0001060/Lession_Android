package com.example.administrator.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent it = getIntent();

        String msg2 = it.getStringExtra("msg");
        ((TextView)findViewById(R.id.txt1)).setText(msg2);

        Log.d("msg",msg2);
        int intArg = it.getIntExtra("intArg",0);
        Log.d("intArg",String.valueOf(intArg));
    }
}
