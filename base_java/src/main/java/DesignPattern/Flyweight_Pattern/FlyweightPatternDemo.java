/*
 * FlyweightPatternDemo.java 1.0.0 2017/12/3  11:38 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:38 created by xulihua
 */
package DesignPattern.Flyweight_Pattern;

import DesignPattern.Flyweight_Pattern.impl.Circle;

/**
 * @Description:使用该工厂，通过传递颜色信息来获取实体类的对象。
 * @Author: xulihua
 * @date: 2017/12/3 11:38
 */
public class FlyweightPatternDemo {
    private static final String colors[] =
            { "红色", "绿色", "蓝色", "白色", "黑色" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
