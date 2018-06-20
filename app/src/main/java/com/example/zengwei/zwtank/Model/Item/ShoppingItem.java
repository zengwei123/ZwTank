package com.example.zengwei.zwtank.Model.Item;

/**
 * Created by zengwei on 2018/6/20.
 */

public class ShoppingItem {
    private String ShoppingName;
    private int ShoppingImage;
    private int ShoppingGold;

    public ShoppingItem(String shoppingName, int shoppingImage, int shoppingGold) {
        ShoppingName = shoppingName;
        ShoppingImage = shoppingImage;
        ShoppingGold = shoppingGold;
    }

    public String getShoppingName() {
        return ShoppingName;
    }

    public void setShoppingName(String shoppingName) {
        ShoppingName = shoppingName;
    }

    public int getShoppingImage() {
        return ShoppingImage;
    }

    public void setShoppingImage(int shoppingImage) {
        ShoppingImage = shoppingImage;
    }

    public int getShoppingGold() {
        return ShoppingGold;
    }

    public void setShoppingGold(int shoppingGold) {
        ShoppingGold = shoppingGold;
    }
}
