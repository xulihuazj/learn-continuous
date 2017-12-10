/*
 * BridgePatternDemo.java 1.0.0 2017/12/2  23:26 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:26 created by xulihua
 */
package DesignPattern.Bridge_Pattern.demo;

import DesignPattern.Bridge_Pattern.Circle;
import DesignPattern.Bridge_Pattern.Shape;
import DesignPattern.Bridge_Pattern.impl.BlankCircle;
import DesignPattern.Bridge_Pattern.impl.GreenCircle;
import DesignPattern.Bridge_Pattern.impl.RedCircle;

/**
 * @Description:使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 * @Author: xulihua
 * @date: 2017/12/2 23:26
 */
public class BridgePatternDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        Shape brankCircle = new Circle(100,100,10,new BlankCircle());
        redCircle.draw();
        greenCircle.draw();
        brankCircle.draw();
    }
}