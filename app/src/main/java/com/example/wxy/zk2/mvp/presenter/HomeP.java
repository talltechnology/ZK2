package com.example.wxy.zk2.mvp.presenter;

import com.example.wxy.zk2.bean.HomeBean;
import com.example.wxy.zk2.mvp.moder.HomeSeekM;
import com.example.wxy.zk2.mvp.moder.MCallBack;
import com.example.wxy.zk2.mvp.view.VCallBack;

import java.util.HashMap;

/**
 * Created by WXY on 2018/6/16.
 */

public class HomeP {

    private HomeSeekM m;
    private VCallBack v;

    /**
     * 绑定
     * @param m
     * @param V
     */
    public void Attach(HomeSeekM m,VCallBack V){
        this.m=m;
        this.v=v;
    }

    /**
     * 解绑
     */
    public void Dettach(){
        this.v=null;
        this.m=null;
    }

    /**
     * 请求
     * @param parms
     */
    public void requst(HashMap<String, String> parms) {
        if(parms==null){
           m.requstDoGet(new MCallBack() {
               @Override
               public void faliure(String tag) {

               }

               @Override
               public void Succeed(HomeBean homeBean) {
                    v.Succeed(homeBean);
               }
           });
        }else {
            m.requstDoPost(parms,new MCallBack() {
                @Override
                public void faliure(String tag) {

                }

                @Override
                public void Succeed(HomeBean homeBean) {

                }
            });
        }
    }
}
