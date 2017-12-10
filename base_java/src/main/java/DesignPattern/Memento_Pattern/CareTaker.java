/*
 * CareTaker.java 1.0.0 2017/12/3  15:24 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:24 created by xulihua
 */
package DesignPattern.Memento_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 备忘录管理类
 * @author: xulihua
 * @date: 2017/12/3 15:24
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}