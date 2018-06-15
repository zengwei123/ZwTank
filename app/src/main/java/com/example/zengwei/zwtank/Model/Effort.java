package com.example.zengwei.zwtank.Model;

import org.litepal.crud.DataSupport;

/**
 * Created by zengwei on 2018/6/15.
 */

public class Effort extends DataSupport {
    private int killSum;  //杀人数量
    private int goldSum;   //金币总数
    private int checkpointSum;   //通过总数
    private int endSum;  //死亡次数

    public int getKillSum() {
        return killSum;
    }

    public void setKillSum(int killSum) {
        this.killSum = killSum;
    }

    public int getGoldSum() {
        return goldSum;
    }

    public void setGoldSum(int goldSum) {
        this.goldSum = goldSum;
    }

    public int getCheckpointSum() {
        return checkpointSum;
    }

    public void setCheckpointSum(int checkpointSum) {
        this.checkpointSum = checkpointSum;
    }

    public int getEndSum() {
        return endSum;
    }

    public void setEndSum(int endSum) {
        this.endSum = endSum;
    }
}
