package com.example.custom_view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * 爱生活，爱代码
 * 创建于：2018/11/6 14:12
 * 作 者：T
 * 微信：704003376
 */
public class MyView extends View {

    //在代码里面new  MyView 的时候调用
    public MyView(Context context) {
        super(context);
    }

    //在布局里面声明的时候调用
    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    //在布局里面声明该控件并使用style属性的时候调用
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }






    //  绘制并显示出来
    @Override
    protected void onDraw(Canvas canvas) {
        Log.e("qwe", "onDraw。。。。。。");
        super.onDraw(canvas);
    }


    //测量(测量(设置，指定)自身控件的宽高或者子控件的宽高)
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.e("qwe", "onMeasure。。。。。。");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }



    //控件的尺寸大小发生变化了
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        Log.e("qwe", "onSizeChanged。。。。。。");
        super.onSizeChanged(w, h, oldw, oldh);
    }


     //完成了填充(加载完了这个MyView控件)
    @Override
    protected void onFinishInflate() {
        Log.e("qwe", "onFinishInflate。。。。。。");
        super.onFinishInflate();
    }


}
