package com.edwin.fragmentdynamicdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mTabWeixin;
    private LinearLayout mTabFrd;
    private LinearLayout mTabAdress;
    private LinearLayout mTabSetting;

    private ImageButton mWeixinImg;
    private ImageButton mFrdImg;
    private ImageButton mAddressImg;
    private ImageButton mSettingnImg;

    private HashMap<Integer, WeixinFragment> fragments = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        initFragments();

        initView();
        initEvent();
        setSelect(0);
    }

    private void initFragments() {
        fragments.put(R.layout.tab01, new WeixinFragment(R.layout.tab01, this));
        fragments.put(R.layout.tab02, new WeixinFragment(R.layout.tab02, this));
        fragments.put(R.layout.tab03, new WeixinFragment(R.layout.tab03, this));
        fragments.put(R.layout.tab04, new WeixinFragment(R.layout.tab04, this));
    }

    private void initEvent() {
        mTabWeixin.setOnClickListener(this);
        mTabFrd.setOnClickListener(this);
        mTabAdress.setOnClickListener(this);
        mTabSetting.setOnClickListener(this);

    }

    private void initView() {

        mTabWeixin = (LinearLayout) findViewById(R.id.id_tab_weixin);
        mTabFrd = (LinearLayout) findViewById(R.id.id_tab_frd);
        mTabAdress = (LinearLayout) findViewById(R.id.id_tab_address);
        mTabSetting = (LinearLayout) findViewById(R.id.id_tab_setting);

        mWeixinImg = (ImageButton) findViewById(R.id.id_tab_weixin_img);
        mFrdImg = (ImageButton) findViewById(R.id.id_tab_frd_img);
        mAddressImg = (ImageButton) findViewById(R.id.id_tab_address_img);
        mSettingnImg = (ImageButton) findViewById(R.id.id_tab_setting_img);

    }


    private void setSelect(int i) {
        //将所选图片变为亮色
        //切换对应的内容区域

        //首先拿到Fragment的内容管理器
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (i) {
            case 0:

                transaction.replace(R.id.id_container,fragments.get(R.layout.tab01));
                mWeixinImg.setImageResource(R.drawable.tab_weixin_pressed);
                break;
            case 1:
                transaction.replace(R.id.id_container,fragments.get(R.layout.tab02));
                mFrdImg.setImageResource(R.drawable.tab_find_frd_pressed);
                break;

            case 2:

                //如果mTab01没有初始化，则进行初始化
                transaction.replace(R.id.id_container,fragments.get(R.layout.tab03));
                mAddressImg.setImageResource(R.drawable.tab_address_pressed);
                break;

            case 3:

                transaction.replace(R.id.id_container,fragments.get(R.layout.tab04));
                mSettingnImg.setImageResource(R.drawable.tab_settings_pressed);
                break;

            default:
                break;
        }
        transaction.commit();


    }

    @Override
    public void onClick(View view) {

        resetImg();

        switch (view.getId()) {
            case R.id.id_tab_weixin:
                //如果点击的是微信图标，就跳转到第一个tab
                setSelect(0);
                break;

            case R.id.id_tab_frd:
                setSelect(1);
                break;

            case R.id.id_tab_address:
                setSelect(2);
                break;

            case R.id.id_tab_setting:
                setSelect(3);
                break;
            default:
                break;
        }
    }

    /**
     * 将所有的图片切换为暗色
     */
    private void resetImg() {

        mWeixinImg.setImageResource(R.drawable.tab_weixin_normal);
        mFrdImg.setImageResource(R.drawable.tab_find_frd_normal);
        mAddressImg.setImageResource(R.drawable.tab_address_normal);
        mSettingnImg.setImageResource(R.drawable.tab_settings_normal);

    }
}
