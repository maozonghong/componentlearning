package com.geespace.module_cart;

import android.app.Application;
import android.util.Log;

import com.geespace.module_common.AbsApplication;
import com.geespace.module_common.IComponentApplication;

/**
 * Created by maozonghong
 * on 2021/2/4
 */
public class CartApplication implements IComponentApplication {

    private AbsApplication absApplication;

    private static String TAG="CartApplication";
    @Override
    public void onCreate(Application application) {
        Log.e(TAG,"onCreate");
        this.absApplication= (AbsApplication) application;
    }

    @Override
    public Application getApplication() {
        return absApplication;
    }
}
