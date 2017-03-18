package com.example.administrator.assetsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *  assets目录：资产目录
 *  与res目录区别：
 *  1.assets目录下的资源不会被R.java文件索引为id
 *  2.正因为没有id，所以assets所有的操作都要通过io流来进行，因此存放的结构和资源比较自由
 *  3.res目录中的文件都会被编译为二进制，而assets文件内容保持原样
 *  4.res目录下的命名都是有规范的，但assets目录命名随意
 */
public class MainActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);
        tv1 = (TextView) findViewById(R.id.tv1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    InputStream in = getAssets().open("store.txt");
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    byte[] buffer = new byte[100];
                    int len = 0;
                    while ((len=in.read(buffer))>0){
                        baos.write(buffer,0,len);
                    }
                    String msg = new String(baos.toByteArray());
//                    Log.d("msg",msg); //4*1024
//                    Log.d("abc","abc");
                    tv1.setText(msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
