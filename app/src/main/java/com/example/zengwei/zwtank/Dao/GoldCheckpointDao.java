package com.example.zengwei.zwtank.Dao;

import com.example.zengwei.zwtank.Model.GoldCheckpoint;

import org.litepal.crud.DataSupport;

/**
 * Created by zengwei on 2018/6/15.
 */

public class GoldCheckpointDao {
    //查询
    public static GoldCheckpoint SelectGoldCheckpoint(){
        return DataSupport.find(GoldCheckpoint.class,1);
    }
}
