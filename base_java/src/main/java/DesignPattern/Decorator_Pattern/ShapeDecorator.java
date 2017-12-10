/*
 * ShapeDecorator.java 1.0.0 2017/12/3  0:04 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  0:04 created by xulihua
 */
package DesignPattern.Decorator_Pattern;

/**
 * 装饰类
 * @Description:创建实现了 Shape 接口的  抽象装饰类
 * @Author: xulihua
 * @date: 2017/12/3 0:04
 */
public abstract class ShapeDecorator implements Shape {

    //获取接口被装饰类的 引用
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
