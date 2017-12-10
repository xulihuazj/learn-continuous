/*
 * FactoryPatternDemo.java 1.0.0 2017/12/2  15:50 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  15:50 created by xulihua
 */
package DesignPattern.Factory_Pattern;

import DesignPattern.Factory_Pattern.impl.CicleShapeImpl;
import DesignPattern.Factory_Pattern.impl.RectangleShapeImpl;
import DesignPattern.Factory_Pattern.impl.SquareShapeImpl;
import org.junit.Test;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 15:50
 */
public class FactoryPatternDemo {

    public static void main(String[] args){
        ShapFactory shapFactory = new ShapFactory();
        Shape shape = shapFactory.getShape("CIRCLE");
        shape.drow();
        System.out.println();
    }

    /**
     * 使用的使用采用强制转换,这样就只需要一个对象实现工厂
     */
    @Test
    public void test2() {
        RectangleShapeImpl rect = (RectangleShapeImpl) ShapFactory.getClass(RectangleShapeImpl.class);
        rect.drow();
        SquareShapeImpl square = (SquareShapeImpl) ShapFactory.getClass(SquareShapeImpl.class);
        square.drow();
        CicleShapeImpl cicle = (CicleShapeImpl) ShapFactory.getClass(CicleShapeImpl.class);
        cicle.drow();
    }

}
