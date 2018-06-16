package com.example.wxy.zk2.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.wxy.zk2.R;
import com.example.wxy.zk2.bean.HomeBean;
import com.example.wxy.zk2.common.Constants;
import com.example.wxy.zk2.mvp.moder.HomeSeekM;
import com.example.wxy.zk2.mvp.presenter.HomeP;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements VCallBack{

    private HomeP homeP;
    public HashMap<String,String> parms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    /**
     * 初始化对象
     */
    private void initData() {
        parms=new HashMap<>();
        //初始化
        homeP = new HomeP();
        // TODO: 2018/6/16  建立连接开始绑定
        homeP.Attach(new HomeSeekM(),this);

        homeP.requst(parms);

    }

    /**
     * 初始化控件
     */
    private void initView() {

    }

    /**
     * 失败回调
     * @param tag
     */
    @Override
    public void faliure(String tag) {

    }

    /**
     *成功回调
     * @param homeBean
     */
    @Override
    public void Succeed(HomeBean homeBean) {
        Toast.makeText(this,homeBean.getCode(),Toast.LENGTH_LONG).show();
    }

    /**
     * 断开连接，避免引用链，造成的OOM
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(homeP!=null){
            homeP.Dettach();
        }
    }
}
