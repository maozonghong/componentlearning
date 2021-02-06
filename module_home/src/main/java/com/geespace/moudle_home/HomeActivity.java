package com.geespace.moudle_home;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.geespace.export_cart.CartRouterTable;
import com.geespace.export_cart.CartServiceUtil;

/**
 * Created by maozonghong
 * on 2021/2/4
 */
@Route(path = "/homepage/homeActivity")
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        findViewById(R.id.btn_go_cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(CartRouterTable.PATH_PAGE_CART).
                        withString("key1","value1").withString("key2","value2").
                        navigation();
            }
        });

        TextView tvCartProductCount= findViewById(R.id.tv_cart_product_count);

        tvCartProductCount.setText("购物车商品数量:"+CartServiceUtil.getCartProductCount().getProductCount());

    }
}
