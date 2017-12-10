/*
 * Observer.java 1.0.0 2017/12/3  15:48 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:48 created by xulihua
 */
package DesignPattern.Observer_Pattern;

/**
 * @Description:观察者
 * @author: xulihua
 * @date: 2017/12/3 15:48
 */
public abstract class Observer {

    //观察的对象
    protected Subject subject;

    public abstract void update();
}
