package com.example.wxy.zk2.baseView;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by WXY on 2018/6/16.
 */

public class BaseViewlist extends ViewGroup{

    private int widthPixels;

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

        int laft=0;
        int top=0;
        for (int i = 0; i < getChildCount(); i++) {

             View at = getChildAt(i);
             int width = at.getMeasuredWidth();
             int height=at.getMeasuredHeight();
             //定位
             at.layout(laft,top,laft+width,top+height);
             laft+=width;
             if(laft>=widthPixels-width){
                laft=0;
                top+=height;
             }

        }
    }


    private void initData() {
        widthPixels = getResources().getDisplayMetrics().widthPixels;
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width=0;
        int height=0;
        for (int i = 0; i < getChildCount(); i++) {
             View at = getChildAt(i);
             height+=at.getMeasuredHeight();
             measureChild(at, widthMeasureSpec, heightMeasureSpec);
        }
        width=widthPixels;
       setMeasuredDimension(width,height);

    }

}
