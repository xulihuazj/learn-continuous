/*
 * ShapeMaker.java 1.0.0 2017/12/3  11:20 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:20 created by xulihua
 */
package DesignPattern.Facade_Pattern;

import DesignPattern.Facade_Pattern.impl.Circle;
import DesignPattern.Facade_Pattern.impl.Rectangle;
import DesignPattern.Facade_Pattern.impl.Square;

/**
 * @Description:创建一个外观类。
 * @Author: xulihua
 * @date: 2017/12/3 11:20
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
