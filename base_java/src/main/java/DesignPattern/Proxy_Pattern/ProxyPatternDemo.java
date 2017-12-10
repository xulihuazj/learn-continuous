/*
 * ProxyPatternDemo.java 1.0.0 2017/12/3  12:00 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  12:00 created by xulihua
 */
package DesignPattern.Proxy_Pattern;

import DesignPattern.Proxy_Pattern.impl.ProxyImage;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 12:00
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        //获取代理对象
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
