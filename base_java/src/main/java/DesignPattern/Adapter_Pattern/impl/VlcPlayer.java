/*
 * VlcPlayer.java 1.0.0 2017/12/2  22:38 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  22:38 created by xulihua
 */
package DesignPattern.Adapter_Pattern.impl;

import DesignPattern.Adapter_Pattern.AdvancedMediaPlayer;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 22:38
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
