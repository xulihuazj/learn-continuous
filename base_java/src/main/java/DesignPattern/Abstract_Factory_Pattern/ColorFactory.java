/*
 * ColorFactory.java 1.0.0 2017/12/2  16:56 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  16:56 created by xulihua
 */
package DesignPattern.Abstract_Factory_Pattern;

import DesignPattern.Abstract_Factory_Pattern.impl.Blue;
import DesignPattern.Abstract_Factory_Pattern.impl.Green;
import DesignPattern.Abstract_Factory_Pattern.impl.Red;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 16:56
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
