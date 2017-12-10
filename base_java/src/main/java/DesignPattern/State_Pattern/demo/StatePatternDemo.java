/*
 * StatePatternDemo.java 1.0.0 2017/12/3  16:29 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  16:29 created by xulihua
 */
package DesignPattern.State_Pattern.demo;

import DesignPattern.State_Pattern.Context;
import DesignPattern.State_Pattern.State;
import DesignPattern.State_Pattern.impl.StartState;
import DesignPattern.State_Pattern.impl.StopState;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 16:29
 */
public class StatePatternDemo {

    public static void main(String[] args) {

        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        State stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}