package com.geespace.module_common;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maozonghong
 * on 2021/2/4
 */
public class AbsApplication extends Application {

    private List<Class<? extends IComponentApplication>> classInitList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        appInit();
        initCreate();
    }


    protected void appInit(){

    }

    protected void registerApplicationInit(Class<? extends IComponentApplication> classInit) {
        classInitList.add(classInit);
    }


    private void initCreate() {

        for (Class<? extends IComponentApplication> classInit : classInitList) {
            try {
                IComponentApplication appInit = classInit.newInstance();
                appInit.onCreate(this);
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
