/*
 * RedCircle.java 1.0.0 2017/12/2  23:19 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:19 created by xulihua
 */
package DesignPattern.Bridge_Pattern.impl;

import DesignPattern.Bridge_Pattern.DrawAPI;

/**
 * @Description:创建实现了 DrawAPI 接口的实体桥接实现类。
 * @Author: xulihua
 * @date: 2017/12/2 23:19
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
