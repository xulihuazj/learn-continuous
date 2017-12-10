/*
 * OctalObserver.java 1.0.0 2017/12/3  15:50 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:50 created by xulihua
 */
package DesignPattern.Observer_Pattern.impl;

import DesignPattern.Observer_Pattern.Observer;
import DesignPattern.Observer_Pattern.Subject;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 15:50
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "八进制 String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}