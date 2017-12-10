/*
 * Shape.java 1.0.0 2017/12/2  23:22 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:22 created by xulihua
 */
package DesignPattern.Bridge_Pattern;

/**
 * @Description:使用 DrawAPI 接口创建抽象类 Shape。
 * @Author: xulihua
 * @date: 2017/12/2 23:22
 */
public abstract class Shape {

    // 引入桥接接口
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
