package com.geespace.module_common;

import android.app.Application;

/**
 * Created by maozonghong
 * on 2021/2/4
 */
public interface IComponentApplication {

     void onCreate(Application application);

     Application getApplication();

}
