/*
 * BlankCircle.java 1.0.0 2017/12/2  23:29 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:29 created by xulihua
 */
package DesignPattern.Bridge_Pattern.impl;

import DesignPattern.Bridge_Pattern.DrawAPI;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 23:29
 */
public class BlankCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("新增加实现");
    }
}
