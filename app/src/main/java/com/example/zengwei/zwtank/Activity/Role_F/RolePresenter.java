package com.example.zengwei.zwtank.Activity.Role_F;

import android.util.Log;
import android.widget.Toast;

import com.example.zengwei.zwtank.Base.BasePresenter;
import com.example.zengwei.zwtank.Dao.GoldCheckpointDao;
import com.example.zengwei.zwtank.Dao.TankCarDao;
import com.example.zengwei.zwtank.Model.GoldCheckpoint;
import com.example.zengwei.zwtank.Model.TankCar;
import com.example.zengwei.zwtank.R;

/**
 * Created by zengwei on 2018/6/19.
 */

public class RolePresenter implements BasePresenter{
    private RoleView roleView;
    private TankCar tankCar;
    public RolePresenter(RoleView roleView){
        this.roleView=roleView;
    }

    @Override
    public void init() {
        setTankCar();
    }

    /**
     * 设置方法
     */
    public void setTankCar(){
        if(roleView.getTankId()==0){
            roleView.setTankId(1);
        }
        tankCar= TankCarDao.SelectTankCar(roleView.getTankId());
        //攻击
        roleView.setHit(tankCar.getHit());
        roleView.setHitLevel(tankCar.getHitLevel());
        roleView.setHitGolds(setTankCarGold(tankCar.getHitLevel()));
        //防御
        roleView.setRate(tankCar.getRate());
        roleView.setRateLevel(tankCar.getRateLevel());
        roleView.setRateGolds(setTankCarGold(tankCar.getRateLevel()));
        //速度
        roleView.setRecovery(tankCar.getRecovery());
        roleView.setRecoveryLevel(tankCar.getRecoveryLevel());
        roleView.setRecoveryGolds(setTankCarGold(tankCar.getRecoveryLevel()));

        roleView.setRoleTitle(tankCar.getTankCar());
    }
    private int setTankCarGold(int lv){
        int isgold=0;
        switch (lv){
            case 1:
                isgold=100;
                break;
            case 2:
                isgold=200;
                break;
            case 3:
                isgold=400;
                break;
            case 4:
                isgold=800;
                break;
            case 5:
                isgold=1600;
                break;
        }
        return isgold;
    }

    /**
     * 1为攻击
     * 2为防御
     * 3为速度
     * @param i
     */
    public boolean upgrade(int i){
        int gold=GoldCheckpointDao.SelectGoldCheckpoint().getGold();
        tankCar= TankCarDao.SelectTankCar(roleView.getTankId());
        switch (i){
            case 1:
                if(gold>=setTankCarGold(tankCar.getHitLevel())){
                    if(tankCar.getHitLevel()<5){
                        Log.d("zsss","1");
                        GoldCheckpointDao.UpdateGoldCheckpoint(gold-setTankCarGold(tankCar.getHitLevel()),0);
                        TankCarDao.UpdateTankCar_hit(roleView.getTankId());
                        setTankCar();
                    }
                    return true;
                }else {
                    return false;
                }
            case 2:
                if(gold>=setTankCarGold(tankCar.getRecoveryLevel())){
                    if(tankCar.getRecoveryLevel()<5){
                        GoldCheckpointDao.UpdateGoldCheckpoint(gold-setTankCarGold(tankCar.getRecoveryLevel()),0);
                        TankCarDao.UpdateTankCar_recovery(roleView.getTankId());
                        setTankCar();
                    }
                    return true;
                }else {
                    return false;
                }
            case 3:
                if(gold>=setTankCarGold(tankCar.getRateLevel())){
                    if(tankCar.getRateLevel()<5){
                        GoldCheckpointDao.UpdateGoldCheckpoint(gold-setTankCarGold(tankCar.getRateLevel()),0);
                        TankCarDao.UpdateTankCar_rate(roleView.getTankId());
                        setTankCar();
                    }
                        return true;
                }else {
                        return false;
                }
        }
        return false;
    }

    /**
     * 左右切换车辆
     */
    public boolean cutLR(boolean b){
        int id=roleView.getTankId();
        if(b){  //左
            if(roleView.getTankId()!=5){
                id++;
            }else{
                id=1;
            }
            if(TankCarDao.SelectTankCar(id)!=null){
                roleView.setTankId(id);
                setTankCar();
                imagecut(id);
                return true;
            }else{
                return false;
            }
        }else{ //右
            if(roleView.getTankId()!=1){
                id--;
            }else{
                id=5;
            }
            if(TankCarDao.SelectTankCar(id)!=null){
                roleView.setTankId(id);
                setTankCar();
                imagecut(id);
                return true;
            }else{
                return false;
            }
        }
    }
    private void imagecut(int id){
        switch (id){
            case 1:
                roleView.setRoleImage(R.drawable.tank_1);
                break;
            case 2:
                roleView.setRoleImage(R.drawable.tank_2);
                break;
            case 3:
                roleView.setRoleImage(R.drawable.tank_3);
                break;
            case 4:
                roleView.setRoleImage(R.drawable.tank_4);
                break;
            case 5:
                roleView.setRoleImage(R.drawable.tank_5);
                break;
        }
    }
}
