package com.example.wxy.zk2.utils;

import com.example.wxy.zk2.bean.BaseRequstBody;
import com.example.wxy.zk2.bean.HomeBean;
import com.example.wxy.zk2.common.Constants;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by WXY on 2018/6/16.
 */

public class NetWorkRequst {

    private static NetWorkRequst netWorkRequst;

    private NetWorkRequst(){}

    /**
     * 单例
     * @return
     */
    public static NetWorkRequst getInstance(){
        if(netWorkRequst ==null){
            synchronized (NetWorkRequst.class) {
                if(netWorkRequst==null){
                    netWorkRequst = new NetWorkRequst();
                }
            }
        }
        return netWorkRequst;
    }


    public void DoGet(final ICallBack iCallBack){
        if(iCallBack==null){
            return;
        }
        // TODO: 2018/6/16 初始化 Retrofit
         Retrofit retrofit = new Retrofit.Builder()
                .client(new OkHttpClient.Builder()
                        .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))//日志打印
                        .build())
                .addConverterFactory(GsonConverterFactory.create())//gson转换
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//支持Retrofit
                 .baseUrl(Constants.query_Api)
                .build();

         BaseRequstBody baseRequstBody = retrofit.create(BaseRequstBody.class);//动态代理
        //被观察者
         Observable<HomeBean> homeBeanObservable = baseRequstBody.requstAllData();
        //请求
         homeBeanObservable
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(new Consumer<HomeBean>() {
             @Override
             public void accept(HomeBean homeBean) throws Exception {
               iCallBack.Succeed(homeBean);//接口回调
             }
         });


    }

   public static interface ICallBack{
       void faliure(String tag);
       void Succeed(HomeBean homeBean);
   }


}
