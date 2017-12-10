/*
 * SingleObject.java 1.0.0 2017/12/2  20:21 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  20:21 created by xulihua
 */
package DesignPattern.Singleton_Pattern;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 20:21
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
