/*
 * ShapeFactory.java 1.0.0 2017/12/2  16:55 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  16:55 created by xulihua
 */
package DesignPattern.Abstract_Factory_Pattern;

import DesignPattern.Abstract_Factory_Pattern.impl.Circle;
import DesignPattern.Abstract_Factory_Pattern.impl.Rectangle;
import DesignPattern.Abstract_Factory_Pattern.impl.Square;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 16:55
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}