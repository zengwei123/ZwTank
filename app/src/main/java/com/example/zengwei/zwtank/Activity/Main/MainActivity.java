package com.example.zengwei.zwtank.Activity.Main;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.zengwei.zwtank.Base.BaseActivity;
import com.example.zengwei.zwtank.R;
import com.example.zengwei.zwtank.Util.Adatper.MainAdatper;
import com.example.zengwei.zwtank.Util.MainViewPage;
import com.example.zengwei.zwtank.Util.util;

import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener,MainView{
    private TextView Nextlevel,Upgrade,Role,Shopping,gold,Effort,Piece,Annals,dialogClose,dialogTitle;
    private MainPresenter mainPresenter;
    private MainViewPage thisViewPage;
    private MainAdatper mainAdatper;

    private RelativeLayout backColor;
    private LinearLayout Page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.perform();
        mainPresenter.init();
    }
    @Override
    public void getCcontrol() {
        Nextlevel=findViewById(R.id.Nextlevel);
        Upgrade=findViewById(R.id.Upgrade);
        Role=findViewById(R.id.Role);
        Shopping=findViewById(R.id.Shopping);

        gold=findViewById(R.id.gold);  //金钱

        Effort=findViewById(R.id.Effort);
        Piece=findViewById(R.id.Piece);
        Annals=findViewById(R.id.Annals);

        thisViewPage=findViewById(R.id.thisViewPage);

        dialogClose=findViewById(R.id.dialogClose);
        dialogTitle=findViewById(R.id.dialogTitle);

        backColor=findViewById(R.id.backColor);
        Page=findViewById(R.id.Page);
    }

    @Override
    public void setCcontrol() {
        Nextlevel.setOnClickListener(this);
        Upgrade.setOnClickListener(this);
        Role.setOnClickListener(this);
        Shopping.setOnClickListener(this);

        Effort.setOnClickListener(this);
        Piece.setOnClickListener(this);
        Annals.setOnClickListener(this);
        dialogClose.setOnClickListener(this);
        dialogClose.setTypeface(util.getTypeFace(getApplicationContext()));
    }

    @Override
    public void init() {
        mainPresenter=new MainPresenter(this);
        mainAdatper=new MainAdatper(getSupportFragmentManager());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Nextlevel:
                break;
            case R.id.Upgrade:
                setDialogTitle("战车升级",0);
                break;
            case R.id.Role:
                setDialogTitle("任务",1);
                break;
            case R.id.Shopping:
                setDialogTitle("商城",2);
                break;
            case R.id.Effort:
               // setDialogTitle("光荣成就",0);
                break;
            case R.id.Piece:
               // setDialogTitle("战车碎片",1);
                break;
            case R.id.Annals:
               // setDialogTitle("历史关卡",1);
                break;
            case R.id.dialogClose:
                backColor.setVisibility(View.GONE);
                Page.setVisibility(View.GONE);
                mainPresenter.getGoldCheckpoint();
                break;
        }
    }
    public void setDialogTitle(String str,int i){
        backColor.setVisibility(View.VISIBLE);
        Page.setVisibility(View.VISIBLE);
        dialogTitle.setText(str);
        thisViewPage.setCurrentItem(i,false);
    }

    @Override
    public void setGold(String goldstr) {
        gold.setText(goldstr);
    }

    @Override
    public void setCheckpoint(String checkpoint) {
        Nextlevel.setText(checkpoint);
    }

    @Override
    public void setFragment(List<Fragment> list) {
        mainAdatper.setList(list);
        thisViewPage.setAdapter(mainAdatper);
        thisViewPage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }
}
