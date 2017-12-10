/*
 * Subject.java 1.0.0 2017/12/3  15:47 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:47 created by xulihua
 */
package DesignPattern.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:主体（被观察者）
 * @author: xulihua
 * @date: 2017/12/3 15:47
 */
public class Subject {

    //所有观察者对象集合
    private List<Observer> observers = new ArrayList<>();

    //主体的状态
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    //通知所有观察者 状态已经改变
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
