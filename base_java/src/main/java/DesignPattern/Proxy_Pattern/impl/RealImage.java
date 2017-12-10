/*
 * RealImage.java 1.0.0 2017/12/3  11:57 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:57 created by xulihua
 */
package DesignPattern.Proxy_Pattern.impl;

import DesignPattern.Proxy_Pattern.Image;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 11:57
 */
public class RealImage implements Image {

    //文件名称
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("显示： " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("加载： " + fileName);
    }
}