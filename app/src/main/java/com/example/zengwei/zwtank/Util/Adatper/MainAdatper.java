package com.example.zengwei.zwtank.Util.Adatper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by zengwei on 2018/6/15.
 */

public class MainAdatper extends FragmentPagerAdapter {
    private List<Fragment> list;
    public MainAdatper(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    public void setList(List<Fragment> list) {
        this.list = list;
    }
}
