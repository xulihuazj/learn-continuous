/*
 * Broker.java 1.0.0 2017/12/3  14:21 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  14:21 created by xulihua
 */
package DesignPattern.Command_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:创建命令调用类。
 * @Author: xulihua
 * @date: 2017/12/3 14:21
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    //创建订单
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
