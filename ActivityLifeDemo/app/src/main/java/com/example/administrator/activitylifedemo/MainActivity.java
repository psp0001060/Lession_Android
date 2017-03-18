package com.example.administrator.activitylifedemo;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","=======onDestroy===========");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "=======onPause===========");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "=======onResume===========");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "=======onStart===========");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "=======onStop===========");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag", "=======onCreate===========");
    }

    public  void myclick(View v){
        switch (v.getId()){
            case R.id.btn1:
                Intent it = new Intent(this,SecondActivity.class);
                startActivity(it);
                break;
            case R.id.btn2:
                startActivity(new Intent(this,DialogActivity.class));
                break;
            default:
                new AlertDialog.Builder(this).setTitle("对话框")
                        .setMessage("你好")
                        .setPositiveButton("确定",null).show();
                break;
        }
    }
}
