/*
 * FacadePatternDemo.java 1.0.0 2017/12/3  11:21 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:21 created by xulihua
 */
package DesignPattern.Facade_Pattern;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 11:21
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
