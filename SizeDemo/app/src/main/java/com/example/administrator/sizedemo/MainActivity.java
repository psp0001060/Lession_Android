package com.example.administrator.sizedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn2 = (Button) findViewById(R.id.btn2);

        //方法一
/*        float width = getResources().getDimension(R.dimen.btn_width);
        float height = getResources().getDimension(R.dimen.btn_height);
        //设置宽度，单位是像素
        btn2.setWidth((int)width);
        btn2.setHeight((int)height);*/

        //方法二
        //在320*480分辨率设备中，像素密度是160,1dp=1px
        //在480*800分辨率设备中,像素密度是240,1dp=1.5px
        //像素=（独立像素*像素密度+0.5）

        float scale = getResources().getDisplayMetrics().density;
        double width_px = 200*scale+0.5;
        double height_px = 80*scale+0.5;
        btn2.setWidth((int)width_px);
        btn2.setHeight((int)height_px);
    }
}
