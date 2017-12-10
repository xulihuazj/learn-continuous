/*
 * SingletonLocking.java 1.0.0 2017/12/2  20:25 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  20:25 created by xulihua
 */
package DesignPattern.Singleton_Pattern;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 20:25
 */
public class SingletonLocking {

    private volatile static SingletonLocking singleton;

    private SingletonLocking() {
    }

    public static SingletonLocking getSingleton() {
        if (singleton == null) {
            synchronized (SingletonLocking.class) {
                if (singleton == null) {
                    singleton = new SingletonLocking();
                }
            }
        }
        return singleton;
    }

}
