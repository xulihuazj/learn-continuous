/*
 * BuyStock.java 1.0.0 2017/12/3  13:57 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  13:57 created by xulihua
 */
package DesignPattern.Command_Pattern.impl;

import DesignPattern.Command_Pattern.Order;
import DesignPattern.Command_Pattern.Stock;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 13:57
 */
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
