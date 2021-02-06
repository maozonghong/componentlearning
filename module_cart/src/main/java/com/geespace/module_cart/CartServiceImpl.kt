package com.geespace.module_cart

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.geespace.export_cart.CartInfo
import com.geespace.export_cart.CartRouterTable
import com.geespace.export_cart.ICartService

/**
 * Created by maozonghong
 * on 2021/2/6
 */
@Route(path = CartRouterTable.PATH_SERVICE_CART)
class CartServiceImpl :ICartService {

    var TAG="CartServiceImpl"

    override fun getProductCountInCart(): CartInfo {
        var cartInfo=CartInfo()
        cartInfo.productCount=666
        return cartInfo
    }

    override fun init(context: Context?) {

        Log.e(TAG,"init cotext")
    }
}