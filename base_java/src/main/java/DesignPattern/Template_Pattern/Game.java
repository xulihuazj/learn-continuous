/*
 * Game.java 1.0.0 2017/12/3  17:31 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:31 created by xulihua
 */
package DesignPattern.Template_Pattern;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:31
 */
public abstract class Game {

    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
