package com.example.zengwei.zwtank.Base;


import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by zengwei on 2018/6/15.
 */

public abstract class BaseFragment extends Fragment {
    public void perform(View view){
        init(view);
        getCcontrol(view);
        setCcontrol(view);
    }
    //获取控件
    public abstract void getCcontrol(View view);
    //设置控件
    public abstract void setCcontrol(View view);
    //初始化
    public abstract void init(View view);
}
