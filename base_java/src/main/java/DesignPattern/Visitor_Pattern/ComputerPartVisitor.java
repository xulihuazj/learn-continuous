/*
 * ComputerPartVisitor.java 1.0.0 2017/12/3  17:57 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:57 created by xulihua
 */
package DesignPattern.Visitor_Pattern;

import DesignPattern.Visitor_Pattern.impl.Keyboard;
import DesignPattern.Visitor_Pattern.impl.Monitor;
import DesignPattern.Visitor_Pattern.impl.Mouse;

/**
 * @Description:定义一个表示访问者的接口。
 * @author: xulihua
 * @date: 2017/12/3 17:57
 */
public interface ComputerPartVisitor {

     void visit(Computer computer);

     void visit(Mouse mouse);

     void visit(Keyboard keyboard);

     void visit(Monitor monitor);
}
