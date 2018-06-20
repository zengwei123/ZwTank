package com.example.zengwei.zwtank.Activity.Shopping_F;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zengwei.zwtank.Base.BaseFragment;
import com.example.zengwei.zwtank.Model.Item.ShoppingItem;
import com.example.zengwei.zwtank.R;
import com.example.zengwei.zwtank.Util.Adatper.ShoppingRecyclerAdatper;

import java.util.List;

/**
 * Created by zengwei on 2018/6/15.
 */

public class ShoppingFragment extends BaseFragment implements ShoppingView{
    private RecyclerView ShoppingRecycler;
    private ShoppingRecyclerAdatper shoppingRecyclerAdatper;
    private ShoppingPresenter shoppingPresenter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.shoppint_fragment,null);
        super.perform(view);
        shoppingPresenter.init();
        return view;
    }

    @Override
    public void getCcontrol(View view) {
        ShoppingRecycler=view.findViewById(R.id.ShoppingRecycler);
    }

    @Override
    public void setCcontrol(View view) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        ShoppingRecycler.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void init(View view) {
        shoppingPresenter=new ShoppingPresenter(this);
    }

    @Override
    public void setShoppingRecycler(List<ShoppingItem> shoppingItems) {
        shoppingRecyclerAdatper=new ShoppingRecyclerAdatper(getContext(),shoppingItems);
        ShoppingRecycler.setAdapter(shoppingRecyclerAdatper);
    }
}
