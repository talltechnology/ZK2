package com.example.wxy.zk2.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.wxy.zk2.R;
import com.example.wxy.zk2.baseView.BaseSeek;

public class SeekActivity extends AppCompatActivity {

    private BaseSeek baseSeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek);
        initView();
        initData();
    }

    /**
     * 初始化对象
     */
    private void initData() {
        baseSeek.btn_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    /**
     * 初始化控件
     */
    private void initView() {
        baseSeek = findViewById(R.id.base_seek);
    }



}
