/*
 * ComputerPartDisplayVisitor.java 1.0.0 2017/12/3  17:57 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:57 created by xulihua
 */
package DesignPattern.Visitor_Pattern;

import DesignPattern.Visitor_Pattern.impl.Keyboard;
import DesignPattern.Visitor_Pattern.impl.Monitor;
import DesignPattern.Visitor_Pattern.impl.Mouse;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:57
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
