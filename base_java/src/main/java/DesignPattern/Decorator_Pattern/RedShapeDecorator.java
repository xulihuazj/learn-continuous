/*
 * RedShapeDecorator.java 1.0.0 2017/12/3  0:05 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  0:05 created by xulihua
 */
package DesignPattern.Decorator_Pattern;

/**
 * @Description:创建扩展了 ShapeDecorator 类的实体装饰类。
 * @Author: xulihua
 * @date: 2017/12/3 0:05
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        /**
         * TODO 添加装饰类，在此需要增强的代码
         */
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
