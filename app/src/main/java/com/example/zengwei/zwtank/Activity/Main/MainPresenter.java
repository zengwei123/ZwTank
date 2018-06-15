package com.example.zengwei.zwtank.Activity.Main;

import android.support.v4.app.Fragment;

import com.example.zengwei.zwtank.Activity.Role_F.RoleFragment;
import com.example.zengwei.zwtank.Activity.Upgrade_F.UpgradeFragment;
import com.example.zengwei.zwtank.Base.BasePresenter;
import com.example.zengwei.zwtank.Dao.GoldCheckpointDao;
import com.example.zengwei.zwtank.Model.GoldCheckpoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengwei on 2018/6/15.
 */

public class MainPresenter implements BasePresenter{
    private MainView mainView;
    private GoldCheckpoint goldCheckpoint;
    private List<Fragment> list;
    public MainPresenter(MainView mainView){
        this.mainView=mainView;
    }

    @Override
    public void init() {
        getGoldCheckpoint();
        setFragmentList();
    }
    public void getGoldCheckpoint(){
        //查询数据库
        goldCheckpoint= GoldCheckpointDao.SelectGoldCheckpoint();
        mainView.setGold("$ "+goldCheckpoint.getGold());
        mainView.setCheckpoint("下一关\n"+goldCheckpoint.getCheckpoint());
    }
    public void setFragmentList(){
        list=new ArrayList<>();
        list.add(new RoleFragment());
        list.add(new UpgradeFragment());
        mainView.setFragment(list);
    }
}
