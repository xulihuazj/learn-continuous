/*
 * Stock.java 1.0.0 2017/12/3  13:55 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  13:55 created by xulihua
 */
package DesignPattern.Command_Pattern;

/**
 * @Description:创建一个请求类。
 * @Author: xulihua
 * @date: 2017/12/3 13:55
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ 名称: " + name + ",数量: " + quantity + " ] 购买");
    }

    public void sell() {
        System.out.println("Stock [ 名称: " + name + ",数量: " + quantity + " ] 销售");
    }
}