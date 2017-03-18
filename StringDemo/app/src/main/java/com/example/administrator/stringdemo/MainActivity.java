package com.example.administrator.stringdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.txt1);
//        System.out.println(tv1.getText());
//        tv1.setText("今晚吃点啥");
//        tv1.setText(getResources().getString(R.string.long_txt));
        tv1.setText(R.string.long_txt);
        System.out.println(tv1.getText());
    }
}
