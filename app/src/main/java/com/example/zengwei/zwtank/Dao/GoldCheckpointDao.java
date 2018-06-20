package com.example.zengwei.zwtank.Dao;

import android.content.ContentValues;

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
    //修改金币
    public static void UpdateGoldCheckpoint(int gold,int checkpoint){
        ContentValues values = new ContentValues();
        if(gold!=0){
            values.put("gold", gold);
        }
        if(checkpoint!=0){
            values.put("checkpoint", checkpoint);
        }
        DataSupport.update(GoldCheckpoint.class, values, 1);
    }
}
