/*
 * Mp4Player.java 1.0.0 2017/12/2  22:39 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  22:39 created by xulihua
 */
package DesignPattern.Adapter_Pattern.impl;

import DesignPattern.Adapter_Pattern.AdvancedMediaPlayer;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 22:39
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}