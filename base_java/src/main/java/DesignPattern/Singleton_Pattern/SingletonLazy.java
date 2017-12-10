/*
 * SingletonLAZY.java 1.0.0 2017/12/2  20:22 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  20:22 created by xulihua
 */
package DesignPattern.Singleton_Pattern;

/**
 * @Description:懒汉式，线程安全
 * @Author: xulihua
 * @date: 2017/12/2 20:22
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    /**
     * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
     * 优点：第一次调用才初始化，避免内存浪费。
     *
     * @return
     */
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
