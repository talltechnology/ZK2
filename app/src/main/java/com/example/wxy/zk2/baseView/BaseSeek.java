package com.example.wxy.zk2.baseView;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.wxy.zk2.R;

/**
 * Created by WXY on 2018/6/16.
 */

public class BaseSeek extends LinearLayout {

    private View view;
    public ImageView img_up;
    public EditText edit_name;
    public Button btn_seek;

    public BaseSeek(Context context) {
        this(context,null);
    }

    public BaseSeek(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public BaseSeek(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        view = LayoutInflater.from(getContext()).inflate(R.layout.seek_layout, this, true);
        initView();
    }


    /**
     * 初始化控件
     */
    private void initView() {
        img_up=view.findViewById(R.id.img_up);
        edit_name=view.findViewById(R.id.edit_name);
        btn_seek=view.findViewById(R.id.btn_seek);
    }


}
