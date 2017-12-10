/*
 * ProxyImage.java 1.0.0 2017/12/3  11:58 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:58 created by xulihua
 */
package DesignPattern.Proxy_Pattern.impl;

import DesignPattern.Proxy_Pattern.Image;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 11:58
 */
public class ProxyImage implements Image {

    //真实的引用
    private RealImage realImage;

    //文件名
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
