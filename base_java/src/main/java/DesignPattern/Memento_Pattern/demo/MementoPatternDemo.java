/*
 * MementoPatternDemo.java 1.0.0 2017/12/3  15:25 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:25 created by xulihua
 */
package DesignPattern.Memento_Pattern.demo;

import DesignPattern.Memento_Pattern.CareTaker;
import DesignPattern.Memento_Pattern.Originator;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 15:25
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        //主类
        Originator originator = new Originator();
        //备忘录管理类
        CareTaker careTaker = new CareTaker();

        originator.setState("状态 #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态 #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态 #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态 #4");

        System.out.println("当前 状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("第一次被保存的状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("第二次被保存的状态: " + originator.getState());
    }
}