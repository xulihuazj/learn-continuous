/*
 * BinaryObserver.java 1.0.0 2017/12/3  15:49 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:49 created by xulihua
 */
package DesignPattern.Observer_Pattern.impl;

import DesignPattern.Observer_Pattern.Observer;
import DesignPattern.Observer_Pattern.Subject;

/**
 * @Description:观察者实现类
 * @author: xulihua
 * @date: 2017/12/3 15:49
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "二进制 String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
