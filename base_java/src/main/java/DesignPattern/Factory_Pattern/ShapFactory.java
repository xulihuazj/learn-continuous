/*
 * ShapFactoryf.java 1.0.0 2017/12/2  15:40 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  15:40 created by xulihua
 */
package DesignPattern.Factory_Pattern;

import DesignPattern.Factory_Pattern.impl.CicleShapeImpl;
import DesignPattern.Factory_Pattern.impl.RectangleShapeImpl;
import DesignPattern.Factory_Pattern.impl.SquareShapeImpl;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 15:40
 */
public class ShapFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new CicleShapeImpl();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RectangleShapeImpl();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new SquareShapeImpl();
        }
        return null;
    }


    /**
     * 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
     * @param clazz
     * @return
     */
    public static Object getClass(Class<?extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
