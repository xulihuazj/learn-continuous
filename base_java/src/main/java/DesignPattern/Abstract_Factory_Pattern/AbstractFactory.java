/*
 * AbstractFactory.java 1.0.0 2017/12/2  16:55 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  16:55 created by xulihua
 */
package DesignPattern.Abstract_Factory_Pattern;

/**
 * @Description:为 Color 和 Shape 对象创建抽象类来获取工厂。
 * @Author: xulihua
 * @date: 2017/12/2 16:55
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
