package com.example.zengwei.zwtank.Activity.Role_F;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zengwei.zwtank.Base.BaseFragment;
import com.example.zengwei.zwtank.R;
import com.example.zengwei.zwtank.Util.util;

/**
 * Created by zengwei on 2018/6/15.
 */

public class RoleFragment extends BaseFragment implements RoleView,View.OnClickListener{
    private TextView skill1,skill2,skill3;
    private TextView level1,level2,level3;
    private TextView golds1,golds2,golds3;
    private TextView upgrade1,upgrade2,upgrade3;
    private LinearLayout include1,include2,include3;
    private TextView role_right,role_left,role_title;
    private ImageView role_image;
    private RolePresenter rolePresenter;

    private int tankId=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.role_fragment,null);
        super.perform(view);
        rolePresenter.init();
        return view;
    }

    @Override
    public void getCcontrol(View view) {
        include1=view.findViewById(R.id.include1);
        include2=view.findViewById(R.id.include2);
        include3=view.findViewById(R.id.include3);

        skill1=include1.findViewById(R.id.skill);
        skill2=include2.findViewById(R.id.skill);
        skill3=include3.findViewById(R.id.skill);

        level1=include1.findViewById(R.id.level);
        level2=include2.findViewById(R.id.level);
        level3=include3.findViewById(R.id.level);

        golds1=include1.findViewById(R.id.golds);
        golds2=include2.findViewById(R.id.golds);
        golds3=include3.findViewById(R.id.golds);

        upgrade1=include1.findViewById(R.id.upgrade);
        upgrade2=include2.findViewById(R.id.upgrade);
        upgrade3=include3.findViewById(R.id.upgrade);

        role_left=view.findViewById(R.id.role_left);
        role_right=view.findViewById(R.id.role_right);
        role_title=view.findViewById(R.id.role_title);
        role_image=view.findViewById(R.id.role_image);
    }

    @Override
    public void setCcontrol(View view) {
        upgrade1.setOnClickListener(this);
        upgrade2.setOnClickListener(this);
        upgrade3.setOnClickListener(this);
        role_left.setOnClickListener(this);
        role_right.setOnClickListener(this);
        upgrade1.setTypeface(util.getTypeFace(getContext()));
        upgrade2.setTypeface(util.getTypeFace(getContext()));
        upgrade3.setTypeface(util.getTypeFace(getContext()));
        role_left.setTypeface(util.getTypeFace(getContext()));
        role_right.setTypeface(util.getTypeFace(getContext()));

    }

    @Override
    public void init(View view) {
        rolePresenter=new RolePresenter(this);
    }

    @Override
    public void setHit(int i) {
        skill1.setText("攻击："+i);

    }

    @Override
    public void setHitLevel(int i) {
        if(i==5){
            level1.setText("Lv：Max");
        }else{
            level1.setText("Lv："+i);
        }
    }

    @Override
    public void setHitGolds(int i) {
        golds1.setText("$ "+i);
    }

    @Override
    public void setRecovery(int i) {
        skill2.setText("防御："+i);

    }

    @Override
    public void setRecoveryLevel(int i) {
        if(i==5){
            level2.setText("Lv：Max");
        }else{
            level2.setText("Lv："+i);
        }
    }

    @Override
    public void setRecoveryGolds(int i) {
        golds2.setText("$ "+i);
    }

    @Override
    public void setRate(int i) {
        skill3.setText("速度："+i);
    }

    @Override
    public void setRateLevel(int i) {
        if(i==5){
            level3.setText("Lv：Max");
        }else{
            level3.setText("Lv："+i);
        }
    }

    @Override
    public void setRateGolds(int i) {
        golds3.setText("$ "+i);
    }

    @Override
    public void setRoleTitle(String title) {
        role_title.setText(title);
    }

    @Override
    public void setRoleImage(int id) {
        role_image.setImageResource(id);
    }

    @Override
    public void setTankId(int str) {
        tankId=str;
    }

    @Override
    public int getTankId() {
        return tankId;
    }

    @Override
    public void onClick(View view) {
       if(view==upgrade1){
           if(!rolePresenter.upgrade(1)){
               Toast.makeText(getContext(), "金币不足！", Toast.LENGTH_SHORT).show();
           }
       }else if(view==upgrade2){
           if(!rolePresenter.upgrade(2)){
               Toast.makeText(getContext(), "金币不足！", Toast.LENGTH_SHORT).show();
           }
       }else  if(view==upgrade3){
           if(!rolePresenter.upgrade(3)){
               Toast.makeText(getContext(), "金币不足！", Toast.LENGTH_SHORT).show();
           }
       }else if(view==role_left){
           if(!rolePresenter.cutLR(false)){
               Toast.makeText(getContext(), "无其他车辆!", Toast.LENGTH_SHORT).show();
           }
       }else if(view==role_right){
           if(!rolePresenter.cutLR(true)){
               Toast.makeText(getContext(), "无其他车辆!", Toast.LENGTH_SHORT).show();
           }
       }
    }


}
