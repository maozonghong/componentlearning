package com.geespace.componentlearning;

import com.alibaba.android.arouter.BuildConfig;
import com.alibaba.android.arouter.launcher.ARouter;
import com.geespace.module_cart.CartApplication;
import com.geespace.module_common.AbsApplication;

/**
 * Created by maozonghong
 * on 2021/2/5
 */
public class MyApplication extends AbsApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        if (BuildConfig.DEBUG) {
            // 打印日志
            ARouter.openLog();
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug();
        }
        // 尽可能早，推荐在Application中初始化
        ARouter.init(this);

    }

    @Override
    protected void appInit() {
        super.appInit();
        registerApplicationInit(CartApplication.class);

    }
}
