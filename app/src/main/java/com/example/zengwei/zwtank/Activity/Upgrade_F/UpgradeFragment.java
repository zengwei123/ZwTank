package com.example.zengwei.zwtank.Activity.Upgrade_F;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zengwei.zwtank.Base.BaseFragment;
import com.example.zengwei.zwtank.R;

/**
 * Created by zengwei on 2018/6/15.
 */

public class UpgradeFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.upgrade_fragment,null);
        super.perform(view);
        return view;
    }

    @Override
    public void getCcontrol(View view) {

    }

    @Override
    public void setCcontrol(View view) {

    }

    @Override
    public void init(View view) {

    }
}
