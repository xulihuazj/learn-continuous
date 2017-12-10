/*
 * Context.java 1.0.0 2017/12/3  16:28 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  16:28 created by xulihua
 */
package DesignPattern.State_Pattern;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 16:28
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}