/*
 * Football.java 1.0.0 2017/12/3  17:33 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:33 created by xulihua
 */
package DesignPattern.Template_Pattern.impl;

import DesignPattern.Template_Pattern.Game;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:33
 */
public class Football extends Game {

    @Override
    protected void endPlay() {
        System.out.println("足球比赛结束！");
    }

    @Override
    protected void initialize() {
        System.out.println("足球比赛初始化。。。");
    }

    @Override
    protected  void startPlay() {
        System.out.println("板球比赛进行中。");
    }
}