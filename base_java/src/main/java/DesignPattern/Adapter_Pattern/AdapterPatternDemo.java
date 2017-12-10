/*
 * AdapterPatternDemo.java 1.0.0 2017/12/2  22:58 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  22:58 created by xulihua
 */
package DesignPattern.Adapter_Pattern;

import DesignPattern.Adapter_Pattern.impl.AudioPlayer;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 22:58
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
