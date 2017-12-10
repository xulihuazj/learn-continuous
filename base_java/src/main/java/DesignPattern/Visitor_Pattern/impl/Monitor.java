/*
 * Monitor.java 1.0.0 2017/12/3  17:54 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:54 created by xulihua
 */
package DesignPattern.Visitor_Pattern.impl;

import DesignPattern.Visitor_Pattern.ComputerPart;
import DesignPattern.Visitor_Pattern.ComputerPartVisitor;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:54
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}