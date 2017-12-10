/*
 * IteratorPatternDemo.java 1.0.0 2017/12/3  15:06 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:06 created by xulihua
 */
package DesignPattern.Iterator_Pattern.demo;

import DesignPattern.Iterator_Pattern.Iterator;
import DesignPattern.Iterator_Pattern.impl.NameRepository;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 15:06
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}