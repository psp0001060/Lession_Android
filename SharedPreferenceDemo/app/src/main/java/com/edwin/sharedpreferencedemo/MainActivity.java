package com.edwin.sharedpreferencedemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edt;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);

        SharedPreferences sp = getSharedPreferences("info", Context.MODE_PRIVATE);
        //读取
        String new_msg = sp.getString("msg", "");
        edt.setText(new_msg);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String msg = edt.getText().toString();
                //获取SharedPreferences对象
                //参数1：根据name来获取对象的SharedPreferences对象，如果存在，就获取，如果不存在，就创建
                //参数2：指定打开模式
                SharedPreferences sp = getSharedPreferences("info", Context.MODE_PRIVATE);

                //获取编辑器
                SharedPreferences.Editor edit = sp.edit();

                //存值
                edit.putString("msg", msg);

                //提交，如果没有此操作，那么以上所有内容都没意义
                edit.apply();
            }
        });

    }
}
