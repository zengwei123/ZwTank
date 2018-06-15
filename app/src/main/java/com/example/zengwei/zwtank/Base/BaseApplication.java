package com.example.zengwei.zwtank.Base;

import com.example.zengwei.zwtank.Model.Effort;
import com.example.zengwei.zwtank.Model.GoldCheckpoint;
import com.example.zengwei.zwtank.Model.Piece;
import com.example.zengwei.zwtank.Model.TankCar;
import com.example.zengwei.zwtank.Util.ThisSharedPreferences;

import org.litepal.LitePalApplication;

/**
 * Created by zengwei on 2018/6/15.
 */

public class BaseApplication extends LitePalApplication{
    @Override
    public void onCreate() {
        super.onCreate();
        if(ThisSharedPreferences.isJoin(getApplicationContext())){

        }else{
            //初始化金币
            GoldCheckpoint goldCheckpoint=new GoldCheckpoint();
            goldCheckpoint.setGold(1000);
            goldCheckpoint.setCheckpoint(1);
            goldCheckpoint.save();
            //初始坦克
            TankCar tankCar=new TankCar();
            tankCar.setTankCar("T0001");
            tankCar.setHit(5);
            tankCar.setRecovery(1);
            tankCar.setRate(3);
            tankCar.save();
            //初始碎片
            Piece piece=new Piece();
            piece.setPieceid("T0002");
            piece.setPiecesum(0);
            piece.save();

            Piece piece1=new Piece();
            piece.setPieceid("T0003");
            piece.setPiecesum(0);
            piece1.save();

            Piece piece2=new Piece();
            piece.setPieceid("T0004");
            piece.setPiecesum(0);
            piece2.save();

            Piece piece3=new Piece();
            piece.setPieceid("T0005");
            piece.setPiecesum(0);
            piece3.save();
            //成就
            Effort effort=new Effort();
            effort.setCheckpointSum(0);
            effort.setEndSum(0);
            effort.setGoldSum(0);
            effort.setCheckpointSum(0);
            effort.setEndSum(0);
            effort.save();
        }
    }
}
