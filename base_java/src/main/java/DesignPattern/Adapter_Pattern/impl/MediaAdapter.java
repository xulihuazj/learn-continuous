/*
 * MediaAdapter.java 1.0.0 2017/12/2  22:39 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  22:39 created by xulihua
 */
package DesignPattern.Adapter_Pattern.impl;

import DesignPattern.Adapter_Pattern.AdvancedMediaPlayer;
import DesignPattern.Adapter_Pattern.MediaPlayer;

/**
 * @Description:创建实现了 MediaPlayer 接口的适配器类。
 * @Author: xulihua
 * @date: 2017/12/2 22:39
 */
public class MediaAdapter implements MediaPlayer {

    //在适配器类中引入 新的需要适配的接口
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
