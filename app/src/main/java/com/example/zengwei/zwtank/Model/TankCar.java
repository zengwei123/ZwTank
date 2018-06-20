package com.example.zengwei.zwtank.Model;

import org.litepal.crud.DataSupport;

/**
 * Created by zengwei on 2018/6/15.
 */

public class TankCar extends DataSupport {
    private String tankCar;  //车辆编号
    private int hit;     //攻击
    private int hitLevel;
    private int recovery;   //防御
    private int recoveryLevel;
    private int rate;   //速度
    private int rateLevel;

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

    public int getHitLevel() {
        return hitLevel;
    }

    public void setHitLevel(int hitLevel) {
        this.hitLevel = hitLevel;
    }

    public int getRecovery() {
        return recovery;
    }

    public void setRecovery(int recovery) {
        this.recovery = recovery;
    }

    public int getRecoveryLevel() {
        return recoveryLevel;
    }

    public void setRecoveryLevel(int recoveryLevel) {
        this.recoveryLevel = recoveryLevel;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRateLevel() {
        return rateLevel;
    }

    public void setRateLevel(int rateLevel) {
        this.rateLevel = rateLevel;
    }
}
