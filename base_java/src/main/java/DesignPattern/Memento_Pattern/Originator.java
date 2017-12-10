/*
 * Originator.java 1.0.0 2017/12/3  15:24 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:24 created by xulihua
 */
package DesignPattern.Memento_Pattern;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 15:24
 */
public class Originator {

    //当前 类状态
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}