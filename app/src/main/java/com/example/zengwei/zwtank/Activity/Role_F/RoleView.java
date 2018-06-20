package com.example.zengwei.zwtank.Activity.Role_F;

/**
 * Created by zengwei on 2018/6/19.
 */

public interface RoleView {
    void setHit(int i);//设置攻击
    void setHitLevel(int i);  //攻击等级
    void setHitGolds(int i);  //金钱

    void setRecovery(int i); //防御
    void setRecoveryLevel(int i);  //攻击等级
    void setRecoveryGolds(int i);  //金钱

    void setRate(int i);//移动
    void setRateLevel(int i);  //攻击等级
    void setRateGolds(int i);  //金钱

    void setRoleTitle(String title);
    void setRoleImage(int id);

    void setTankId(int str);
    int getTankId();

}
