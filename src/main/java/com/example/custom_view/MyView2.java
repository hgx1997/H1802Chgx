package com.example.custom_view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/**
 * 爱生活，爱代码
 * 创建于：2018/11/6 14:59
 * 作 者：T
 * 微信：704003376
 */
public class MyView2 extends ViewGroup {

    public MyView2(Context context) {
        super(context);
    }

    public MyView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //必须重写onLayout用来摆放子控件
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        Log.e("wwww", "onLayout。。。。。。");
    }

    //测量自身的大小或者子控件的大小
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.e("wwww", "onMeasure。。。。。。");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


    //绘制显示出来
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e("wwww", "onDraw。。。。。。");
    }
}
