package com.geespace.export_cart

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * Created by maozonghong
 * on 2021/2/6
 */
interface ICartService : IProvider {

    /**
     * 获取购物车中商品数量
     * @return
     */
    fun getProductCountInCart(): CartInfo
}