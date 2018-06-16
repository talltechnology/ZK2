package com.example.wxy.zk2.mvp.view;

import com.example.wxy.zk2.bean.HomeBean;

/**
 * Created by WXY on 2018/6/16.
 */

public interface VCallBack {
    void faliure(String tag);
    void Succeed(HomeBean homeBean);
}
