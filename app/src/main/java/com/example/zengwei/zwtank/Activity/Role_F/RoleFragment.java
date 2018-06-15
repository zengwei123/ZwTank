package com.example.zengwei.zwtank.Activity.Role_F;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zengwei.zwtank.Base.BaseFragment;
import com.example.zengwei.zwtank.R;

/**
 * Created by zengwei on 2018/6/15.
 */

public class RoleFragment extends BaseFragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.role_fragment,null);
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
