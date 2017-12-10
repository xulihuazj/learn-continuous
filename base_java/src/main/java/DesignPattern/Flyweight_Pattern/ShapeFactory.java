/*
 * ShapeFactory.java 1.0.0 2017/12/3  11:36 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:36 created by xulihua
 */
package DesignPattern.Flyweight_Pattern;

import DesignPattern.Flyweight_Pattern.impl.Circle;

import java.util.HashMap;

/**
 * @Description:创建一个工厂，生成基于给定信息的实体类的对象。
 * @Author: xulihua
 * @date: 2017/12/3 11:36
 */
public class ShapeFactory {

    //创建本地缓存
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        //通过颜色获取圆环
        Circle circle = (Circle)circleMap.get(color);
        if(circle == null) {
            //为空创建出这种颜色的圆环
            circle = new Circle(color);
            //放入缓存中
            circleMap.put(color, circle);
            System.out.println("创建  " + color + " 的圆环");
        }
        return circle;
    }
}
