package com.example.zengwei.zwtank.Dao;

import android.content.ContentValues;

import com.example.zengwei.zwtank.Model.GoldCheckpoint;
import com.example.zengwei.zwtank.Model.TankCar;

import org.litepal.crud.DataSupport;

/**
 * Created by zengwei on 2018/6/15.
 */

public class TankCarDao {
    //查询
    public static TankCar SelectTankCar(int tankId){
        return DataSupport.find(TankCar.class,tankId);
    }
    //修改攻击力
    public static void UpdateTankCar_hit(int tankId){
        ContentValues values = new ContentValues();
       if(SelectTankCar(tankId).getHitLevel()<5){
           if(SelectTankCar(tankId).getHitLevel()==4){
               values.put("hit", SelectTankCar(tankId).getHit()+10);
               values.put("hitLevel", SelectTankCar(tankId).getHitLevel()+1);
           }else{
               values.put("hit", SelectTankCar(tankId).getHit()+3);
               values.put("hitLevel", SelectTankCar(tankId).getHitLevel()+1);
           }
           DataSupport.update(TankCar.class, values, tankId);
       }
    }
    //修改速度
    public static void UpdateTankCar_rate(int tankId){
        ContentValues values = new ContentValues();
        if(SelectTankCar(tankId).getRateLevel()<5){
            if(SelectTankCar(tankId).getRateLevel()==4){
                values.put("rate", SelectTankCar(tankId).getRate()+10);
                values.put("rateLevel", SelectTankCar(tankId).getRateLevel()+1);
            }else{
                values.put("rate", SelectTankCar(tankId).getRate()+4);
                values.put("rateLevel", SelectTankCar(tankId).getRateLevel()+1);
            }
            DataSupport.update(TankCar.class, values, tankId);
        }
    }
    //修改防御力
    public static void UpdateTankCar_recovery(int tankId){
        ContentValues values = new ContentValues();
        if(SelectTankCar(tankId).getRecoveryLevel()<5){
            if(SelectTankCar(tankId).getRecoveryLevel()==4){
                values.put("recovery", SelectTankCar(tankId).getRecovery()+10);
                values.put("recoveryLevel", SelectTankCar(tankId).getRecoveryLevel()+1);
            }else{
                values.put("recovery", SelectTankCar(tankId).getRecovery()+3);
                values.put("recoveryLevel", SelectTankCar(tankId).getRecoveryLevel()+1);
            }
            DataSupport.update(TankCar.class, values, tankId);
        }
    }
}
