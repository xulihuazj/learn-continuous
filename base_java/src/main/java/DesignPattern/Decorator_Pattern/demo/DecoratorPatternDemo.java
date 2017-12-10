/*
 * DecoratorPatternDemo.java 1.0.0 2017/12/3  0:09 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  0:09 created by xulihua
 */
package DesignPattern.Decorator_Pattern.demo;

import DesignPattern.Decorator_Pattern.RedShapeDecorator;
import DesignPattern.Decorator_Pattern.Shape;
import DesignPattern.Decorator_Pattern.impl.Circle;
import DesignPattern.Decorator_Pattern.impl.Rectangle;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 0:09
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
