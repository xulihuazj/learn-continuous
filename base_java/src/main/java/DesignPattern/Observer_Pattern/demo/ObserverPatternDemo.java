/*
 * ObserverPatternDem.java 1.0.0 2017/12/3  15:52 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:52 created by xulihua
 */
package DesignPattern.Observer_Pattern.demo;

import DesignPattern.Observer_Pattern.Subject;
import DesignPattern.Observer_Pattern.impl.BinaryObserver;
import DesignPattern.Observer_Pattern.impl.HexaObserver;
import DesignPattern.Observer_Pattern.impl.OctalObserver;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 15:52
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        //将观察者和被观察者 关联上
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("第一次状态改变: 15");
        subject.setState(15);
        System.out.println("第二次状态改变: 10");
        subject.setState(10);
    }
}