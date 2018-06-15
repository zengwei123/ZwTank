package com.example.zengwei.zwtank.Activity.Main;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zengwei.zwtank.Base.BaseActivity;
import com.example.zengwei.zwtank.CustomView.RippleLayout;
import com.example.zengwei.zwtank.Model.GoldCheckpoint;
import com.example.zengwei.zwtank.R;
import com.example.zengwei.zwtank.Util.MainAdatper;

import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener,MainView{
    private TextView Nextlevel,Upgrade,Role,Shopping,gold,Effort,Piece,Annals;
    private MainPresenter mainPresenter;
    private ViewPager thisViewPage;
    private MainAdatper mainAdatper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.perform();
        mainPresenter.init();
    }
    @Override
    public void getCcontrol() {
        Nextlevel=findViewById(R.id.Nextlevel);
        Upgrade=findViewById(R.id.Upgrade);
        Role=findViewById(R.id.Role);
        Shopping=findViewById(R.id.Shopping);
        gold=findViewById(R.id.gold);
        Effort=findViewById(R.id.Effort);
        Piece=findViewById(R.id.Piece);
        Annals=findViewById(R.id.Annals);
        thisViewPage=findViewById(R.id.thisViewPage);
    }

    @Override
    public void setCcontrol() {
        Nextlevel.setOnClickListener(this);
        Upgrade.setOnClickListener(this);
        Role.setOnClickListener(this);
        Shopping.setOnClickListener(this);
        Effort.setOnClickListener(this);
        Piece.setOnClickListener(this);
        Annals.setOnClickListener(this);
    }

    @Override
    public void init() {
        mainPresenter=new MainPresenter(this);
        mainAdatper=new MainAdatper(getSupportFragmentManager());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Nextlevel:
                break;
            case R.id.Upgrade:
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Role:
                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Shopping:
                Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Effort:
                Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Piece:
                Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Annals:
                Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    @Override
    public void setGold(String goldstr) {
        gold.setText(goldstr);
    }

    @Override
    public void setCheckpoint(String checkpoint) {
        Nextlevel.setText(checkpoint);
    }

    @Override
    public void setFragment(List<Fragment> list) {
        mainAdatper.setList(list);
        thisViewPage.setAdapter(mainAdatper);
    }
}
