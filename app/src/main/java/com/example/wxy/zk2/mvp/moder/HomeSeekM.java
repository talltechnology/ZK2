package com.example.wxy.zk2.mvp.moder;

import com.example.wxy.zk2.bean.HomeBean;
import com.example.wxy.zk2.utils.NetWorkRequst;

import java.util.HashMap;

/**
 * Created by WXY on 2018/6/16.
 */

public class HomeSeekM {
    /**
     * DoGet
     * @param mCallBack
     */
    public void requstDoGet(final MCallBack mCallBack) {
             NetWorkRequst.getInstance().DoGet(new NetWorkRequst.ICallBack() {
                 @Override
                 public void faliure(String tag) {

                 }

                 @Override
                 public void Succeed(HomeBean homeBean) {
                      mCallBack.Succeed(homeBean);
                 }
             });
    }

    /**
     * DoPost
     * @param parms
     * @param mCallBack
     */
    public void requstDoPost(HashMap<String, String> parms, MCallBack mCallBack) {

    }
}
