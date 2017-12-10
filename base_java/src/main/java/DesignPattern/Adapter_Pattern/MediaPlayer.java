/*
 * MediaPlayer.java 1.0.0 2017/12/2  22:37 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  22:37 created by xulihua
 */
package DesignPattern.Adapter_Pattern;

/**
 * @Description:为媒体播放器创建接口。
 * @Author: xulihua
 * @date: 2017/12/2 22:37
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
