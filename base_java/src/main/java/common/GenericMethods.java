/*
 * GenericMethods.java 1.0.0 2017/11/26  22:20 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/26  22:20 created by xulihua
 */
package common;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/26 22:20
 */
public class GenericMethods {

    public <T> void test1(T x) {
        /*Class<?> aClass = x.getClass();
        Method[] methods = aClass.getMethods();
        if(methods[0].equals("aaaa")){
            methods[0].invoke();
        }*/
        System.out.println(x.getClass().getName());
    }

}
