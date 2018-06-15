package com.example.zengwei.zwtank.Util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by zengwei on 2018/6/15.
 * 判断用户是否第一次进入
 */

public class ThisSharedPreferences {
    private static SharedPreferences read;
    private static SharedPreferences.Editor editor ;
    public static boolean isJoin(Context context){
        read=context.getSharedPreferences("Join",context.MODE_PRIVATE);
        if(read.getString("isJoin","false").equals("true")){
            return true;
        }else{
            editor= context.getSharedPreferences("Join", context.MODE_PRIVATE).edit();
            editor.putString("isJoin", "true");
            //步骤3：提交
            editor.commit();
            return false;
        }
    }
}
