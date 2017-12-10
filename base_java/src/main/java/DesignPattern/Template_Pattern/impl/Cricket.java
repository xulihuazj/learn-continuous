/*
 * Cricket.java 1.0.0 2017/12/3  17:32 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:32 created by xulihua
 */
package DesignPattern.Template_Pattern.impl;

import DesignPattern.Template_Pattern.Game;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:32
 */
public class Cricket extends Game {

    @Override
    protected void endPlay() {
        System.out.println("板球比赛结束！ ");
    }

    @Override
    protected void initialize() {
        System.out.println("板球比赛初始化！开始玩。");
    }

    @Override
    protected void startPlay() {
        System.out.println("板球比赛进行中。享受游戏！");
    }
}