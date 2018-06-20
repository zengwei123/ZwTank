package com.example.zengwei.zwtank.Activity.Shopping_F;

import com.example.zengwei.zwtank.Base.BasePresenter;
import com.example.zengwei.zwtank.Model.Item.ShoppingItem;
import com.example.zengwei.zwtank.Util.ShoppingClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengwei on 2018/6/20.
 */

public class ShoppingPresenter implements BasePresenter {
    private ShoppingView shoppingView;
    public ShoppingPresenter(ShoppingView shoppingView){
        this.shoppingView=shoppingView;
    }

    @Override
    public void init() {
        setShoppingRecycler();
    }
    public void setShoppingRecycler(){
        List<ShoppingItem> shoppingItems=new ArrayList<>();
        for(int i=0;i< ShoppingClass.piece.length;i++){
            shoppingItems.add(new ShoppingItem((String) ShoppingClass.piece[i][0],(int)ShoppingClass.piece[i][1],(int)ShoppingClass.piece[i][2]));
        }
        shoppingView.setShoppingRecycler(shoppingItems);
    }
}
