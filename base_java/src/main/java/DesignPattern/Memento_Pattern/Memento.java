/*
 * Memento.java 1.0.0 2017/12/3  15:23 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:23 created by xulihua
 */
package DesignPattern.Memento_Pattern;

/**
 * @Description：备忘录类
 * @author: xulihua
 * @date: 2017/12/3 15:23
 */
public class Memento {

    //类状态
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
