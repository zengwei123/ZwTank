package com.example.zengwei.zwtank.Model;

import org.litepal.crud.DataSupport;

/**
 * Created by zengwei on 2018/6/15.
 */

public class TankCar extends DataSupport {
    private String tankCar;  //车辆编号
    private int hit;     //攻击
    private int recovery;   //防御
    private int rate;   //速度

    public String getTankCar() {
        return tankCar;
    }

    public void setTankCar(String tankCar) {
        this.tankCar = tankCar;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getRecovery() {
        return recovery;
    }

    public void setRecovery(int recovery) {
        this.recovery = recovery;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
