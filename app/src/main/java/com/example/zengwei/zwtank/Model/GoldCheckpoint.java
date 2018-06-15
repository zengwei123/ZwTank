package com.example.zengwei.zwtank.Model;

import org.litepal.crud.DataSupport;

/**
 * Created by zengwei on 2018/6/15.
 */

public class GoldCheckpoint extends DataSupport {
    private int gold;   //金币数量
    private int checkpoint;   //关卡

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(int checkpoint) {
        this.checkpoint = checkpoint;
    }
}
