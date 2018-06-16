package com.example.wxy.zk2.bean;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by WXY on 2018/6/16.
 */

public interface BaseRequstBody {

    @GET("/product/getCarts")
    Observable<HomeBean> requstAllData();


    @POST("product/updateCarts/")
    @FormUrlEncoded
    Observable<HomeBean> UpDataData(@FieldMap HashMap<String,String> parms);


}
