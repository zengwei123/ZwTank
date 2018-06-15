package com.example.zengwei.zwtank.Base;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zengwei on 2018/6/15.
 */

public abstract class BaseActivity extends AppCompatActivity {
    private static Intent intent;

    public void perform(){
        init();
        getCcontrol();
        setCcontrol();
    }
    //获取控件
    public abstract void getCcontrol();
    //设置控件
    public abstract void setCcontrol();
    //初始化
    public abstract void init();

    public void JumpActivity(Context context, Class iclass){
        intent=new Intent(context,iclass);
        startActivity(intent);
    }
}
