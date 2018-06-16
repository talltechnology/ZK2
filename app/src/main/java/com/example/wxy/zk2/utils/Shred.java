package com.example.wxy.zk2.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by WXY on 2018/6/16.
 */

public class Shred  {

    private final SharedPreferences sd;
    private Set<String> strings;

    public Shred(Context context){
        sd = context.getSharedPreferences("seek", Context.MODE_PRIVATE);
    }


    public void setSetArry(String arry){
         Set<String> array = getArray();
         array.add(arry);
         sd.edit().putStringSet("seeklist",array);
    }

    public Set<String> getArray(){
        strings = null;
        if (strings ==null) {
            strings = new HashSet<>();
        }
        return sd.getStringSet("seeklist", strings);
    }
}
