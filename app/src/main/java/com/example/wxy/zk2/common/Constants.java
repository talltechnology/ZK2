package com.example.wxy.zk2.common;

/**
 * Created by WXY on 2018/6/16.
 */

public class Constants {

    public static final String Url="http://120.27.23.105/";
    /**
     * 查询购物车
     接口地址：http://120.27.23.105/product/getCarts
     返回格式：json
     请求方式：get/post
     接口备注：查询购物车
     */
    public static final String query_Api="/product/getCarts";
    /**
     * 名称	类型	必填	说明
     uid	string	是	用户id
     更新购物车
     接口地址：http://120.27.23.105/product/updateCarts?uid=71&sellerid=1&pid=1&selected=0&num=10
     返回格式：json
     请求方式：get/post
     接口备注：更新购物车
     请求参数说明：
     名称	类型	必填	说明
     uid	string	是	用户id
     sellerid	string	是	商户id
     pid	string	是	商品id
     num	string	是	商品数量
     selected	string	是	是否选中
     */
    public static final String Updata_Api="product/updateCarts/";
    /**
     * 删除购物车
     接口地址：http://120.27.23.105/product/deleteCart?uid=72&pid=1
     返回格式：json
     请求方式：get/post
     接口备注：删除购物车
     请求参数说明：
     名称	类型	必填	说明
     uid	string	是	用户id
     pid	string	是	商品id
     */
    public static final String Delete_Api="/product/deleteCart/";
}
