package com.example.wxy.zk2.baseView;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by WXY on 2018/6/16.
 */

public class BaseViewlist extends ViewGroup{


    public BaseViewlist(Context context) {
        this(context,null);
    }

    public BaseViewlist(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public BaseViewlist(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initData();
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }


    private void initData() {

    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        for (int i = 0; i < getChildCount(); i++) {

        }
    }
}
