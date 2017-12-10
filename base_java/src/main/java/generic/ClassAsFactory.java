/*
 * ClassAsFactory.java 1.0.0 2017/11/29  0:04 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/29  0:04 created by xulihua
 */
package generic;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/29 0:04
 */
public class ClassAsFactory<T> {

    T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            this.x = kind.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

