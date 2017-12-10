/*
 * Computer.java 1.0.0 2017/12/3  17:55 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:55 created by xulihua
 */
package DesignPattern.Visitor_Pattern;

import DesignPattern.Visitor_Pattern.impl.Keyboard;
import DesignPattern.Visitor_Pattern.impl.Mouse;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:55
 */
public class Computer implements ComputerPart {

    //电脑组件集合
    List<ComputerPart> computerPartList = new ArrayList<>();

    public Computer() {
        computerPartList.add(new Mouse());
        computerPartList.add(new Keyboard());
        computerPartList.add(new Mouse());
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerPartList) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}