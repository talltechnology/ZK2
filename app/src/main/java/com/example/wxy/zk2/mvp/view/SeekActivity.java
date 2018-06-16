package com.example.wxy.zk2.mvp.view;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wxy.zk2.R;
import com.example.wxy.zk2.baseView.BaseSeek;
import com.example.wxy.zk2.baseView.BaseViewlist;
import com.example.wxy.zk2.utils.Shred;

import java.util.Iterator;

public class SeekActivity extends AppCompatActivity {

    private BaseSeek baseSeek;
    private Shred shred;
    private BaseViewlist viewlist;
    private ViewGroup.LayoutParams params;

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
        shred = new Shred(this);
        params = viewlist.getLayoutParams();
        //添加
        baseSeek.btn_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            Toast.makeText(SeekActivity.this,)
               shred.setSetArry(baseSeek.edit_name.getText().toString());
               AddData(baseSeek.edit_name.getText().toString());
            }
        });
    }

    /**
     * 初始化控件
     */
    private void initView() {
        baseSeek = findViewById(R.id.base_seek);
        viewlist = findViewById(R.id.baselist);
//         Iterator<String> iterator = shred.getArray().iterator();
//        //添加记录
//        while (iterator.hasNext()){
//             String next = iterator.next();
//             AddData(next);
//        }
    }

    /**
     * 添加
     * @param s
     */
    public void AddData(String s){
        Log.e("=======",""+s);
        TextView tv=new TextView(SeekActivity.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(100, 30);
        params.setMargins(10,10,10,10);
        tv.setLayoutParams(params);
        tv.setText(""+s);
        tv.setBackgroundDrawable(getResources().getDrawable(R.drawable.rount));
        tv.setGravity(Gravity.CENTER);
        ObjectAnimator obj=ObjectAnimator.ofFloat(tv,"translationX",getResources().getDisplayMetrics().widthPixels,0);
        obj.setDuration(3000);
        obj.start();
        viewlist.addView(tv);
    }



}
