package com.example.zengwei.zwtank.Activity.Main;

import android.support.v4.app.Fragment;

import com.example.zengwei.zwtank.Model.GoldCheckpoint;

import java.util.List;

/**
 * Created by zengwei on 2018/6/15.
 */

public interface MainView {
    void setGold(String gold);
    void setCheckpoint(String checkpoint);
    void setFragment(List<Fragment> list);
}
