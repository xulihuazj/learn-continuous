/*
 * Circle.java 1.0.0 2017/12/2  23:25 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:25 created by xulihua
 */
package DesignPattern.Bridge_Pattern;

/**
 * @Description:创建实现了 Shape 接口的实体类。
 * @Author: xulihua
 * @date: 2017/12/2 23:25
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
