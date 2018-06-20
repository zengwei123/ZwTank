package com.example.zengwei.zwtank.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zengwei on 2018/6/14.
 */

public class RippleLayout extends LinearLayout {
    private TextView downview=null;
    private int x=0,y=0,r=0,cirvleR=0;
    int left,top,right,bottom;
    private Paint linePaint;
    private thisRun run;
    public RippleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        linePaint=new Paint();
        linePaint.setStyle(Paint.Style.FILL );
        linePaint.setColor(Color.parseColor("#AA666666"));
        run=new thisRun();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if(downview!=null){
            canvas.clipRect(left, top, right, bottom);
            canvas.drawCircle(x,y,cirvleR,linePaint);  //扩散圆弧
        }
    }
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            while(true){
                cirvleR+=10;
                postInvalidate();
                if(cirvleR>r){
                    cirvleR=0;
                    r=0;
                    postInvalidate();
                    break;
                }
                try {
                    Thread.sleep(8);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction()==MotionEvent.ACTION_DOWN){
            x=(int)ev.getX();
            y=(int)ev.getY();
            downview=(TextView) getDownView(x,y);
        }else if(ev.getAction()==MotionEvent.ACTION_UP){
            if(x==(int)ev.getX()&&y==(int)ev.getY()){
                int[] sb={Math.abs(left-x),Math.abs(top-y),(right-x),(bottom-y)};
                for(int z=0;z<sb.length;z++){
                    if(sb[z]>r){
                        r=sb[z];
                    }
                }
                new Thread(runnable).start();
            }else{
                downview=null;
            }
            run.event = ev;
            postDelayed(run, 500);
            return true;
        }
        return  super.dispatchTouchEvent(ev);
    }

    /**
     * 获取点击的控件
     * @param x
     * @param y
     * @return
     */
    public View getDownView(int x,int y){
        List<View> views=getTouchables();
        for(View view:views){
            if(isViewWithin(view,x,y)){
                return view;
            }
        }
        return null;
    }

    /**
     * 判断点击是否哎控件内
     * @param view
     * @param x
     * @param y
     * @return
     */
    public boolean isViewWithin(View view,int x,int y){
        left=view.getLeft();                //触发点击事件的 子view的位置坐标
        top=view.getTop();
        right=view.getRight();
        bottom=view.getBottom();
        if(x>left&&x<right&&y>top&&y<bottom){
            return true;
        }else{
            return false;
        }
    }

    private class thisRun implements Runnable {
        MotionEvent event;
        @Override
        public void run() {
            if(downview!=null){
                downview.dispatchTouchEvent(event);
            }
            Log.d("zengs","2");
        }
    }
}
