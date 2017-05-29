package com.edwin.fragmentdynamicdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fxr on 16-9-23.
 */

public class WeixinFragment extends Fragment {

    private int layoutID;
    SparseArray<View> views;
    View rootView;

    public WeixinFragment(){}

    /**
     * 构造带参构造函数
     * @param layoutID  布局的ID
     * @param context   传入上下文
     */
    @SuppressLint("ValidFragment")
    public WeixinFragment(int layoutID, Context context) {
        this.layoutID = layoutID;
        views = new SparseArray<>();
        rootView = LayoutInflater.from(context).inflate(layoutID,null);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return rootView;

    }
}
