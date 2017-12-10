/*
 * VisitorPatternDemo.java 1.0.0 2017/12/3  18:00 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  18:00 created by xulihua
 */
package DesignPattern.Visitor_Pattern.demo;

import DesignPattern.Visitor_Pattern.Computer;
import DesignPattern.Visitor_Pattern.ComputerPart;
import DesignPattern.Visitor_Pattern.ComputerPartDisplayVisitor;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 18:00
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
