/*
 * FactoryProducer.java 1.0.0 2017/12/2  16:56 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  16:56 created by xulihua
 */
package DesignPattern.Abstract_Factory_Pattern;

/**
 * @Description:创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @Author: xulihua
 * @date: 2017/12/2 16:56
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
