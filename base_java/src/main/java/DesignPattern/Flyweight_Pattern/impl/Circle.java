/*
 * Circle.java 1.0.0 2017/12/3  11:36 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:36 created by xulihua
 */
package DesignPattern.Flyweight_Pattern.impl;

import DesignPattern.Flyweight_Pattern.Shape;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 11:36
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
