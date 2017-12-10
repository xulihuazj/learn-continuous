/*
 * StopState.java 1.0.0 2017/12/3  16:27 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  16:27 created by xulihua
 */
package DesignPattern.State_Pattern.impl;

import DesignPattern.State_Pattern.Context;
import DesignPattern.State_Pattern.State;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 16:27
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
