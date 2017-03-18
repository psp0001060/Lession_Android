package com.example.administrator.xmldemo;

import android.content.res.XmlResourceParser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取xml文档
                XmlResourceParser parser = getResources().getXml(R.xml.persons);

                try {
                    while (parser.getEventType() != XmlResourceParser.END_DOCUMENT) {
                        //解析
                        //如果遇到开始标签
                        if (parser.getEventType() == XmlResourceParser.START_TAG){
                            //获取标签名称
                            String tagName = parser.getName();
                            if ("person".equals(tagName)){
                                //获取属性值
                                //1.获取年龄属性值
                                String age = parser.getAttributeValue(null,"age");
                                //2.获取性别属性值
                                String gender = parser.getAttributeValue(null,"gender");
                                //3.获取姓名
                                String name = parser.nextText();
//                        System.out.println(name+"同学今年"+age+"岁，是"+gender+"同学");
                                Log.d("myxml",name+"同学今年"+age+"岁，是"+gender+"同学");
                            }
                        }

                        //获取解析器的下一个节点
                        parser.next();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
