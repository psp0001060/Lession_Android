package com.example.administrator.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent:意图
                //参数1：代表的环境是什么（要从哪个地方执行的事）
                //参数2：要跳转的目的地（.class）
                Intent it = new Intent(MainActivity.this,SecondActivity.class);
                it.putExtra("msg","这是第一个界面的消息");
                it.putExtra("intArg",23);
                startActivity(it);
//                Toast.makeText(MainActivity.this,"hello world",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
