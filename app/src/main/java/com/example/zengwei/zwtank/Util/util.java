package com.example.zengwei.zwtank.Util;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by zengwei on 2018/6/19.
 */

public class util {
    public static Typeface getTypeFace(Context context){
        Typeface typeface=Typeface.createFromAsset(context.getAssets(),"font/icomoon.ttf");
        return typeface;
    }
}
