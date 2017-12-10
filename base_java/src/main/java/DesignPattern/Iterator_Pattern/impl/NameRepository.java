/*
 * NameRepository.java 1.0.0 2017/12/3  15:05 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:05 created by xulihua
 */
package DesignPattern.Iterator_Pattern.impl;

import DesignPattern.Iterator_Pattern.Container;
import DesignPattern.Iterator_Pattern.Iterator;

/**
 * @Description:创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 NameIterator。
 * @author: xulihua
 * @date: 2017/12/3 15:05
 */
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}