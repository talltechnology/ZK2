package com.example.wxy.zk2.mvp.moder;

import com.example.wxy.zk2.bean.HomeBean;

/**
 * Created by WXY on 2018/6/16.
 */

public interface MCallBack {
    void faliure(String tag);
    void Succeed(HomeBean homeBean);
}
