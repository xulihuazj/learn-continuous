/*
 * CommandPatternDemo.java 1.0.0 2017/12/3  14:18 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  14:18 created by xulihua
 */
package DesignPattern.Command_Pattern.demo;

import DesignPattern.Command_Pattern.Broker;
import DesignPattern.Command_Pattern.Stock;
import DesignPattern.Command_Pattern.impl.BuyStock;
import DesignPattern.Command_Pattern.impl.SellStock;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 14:18
 */
public class CommandPatternDemo {

    public static void main(String args[]){
        //构造请求：将一个请求封装成一个对象
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

    }
}
