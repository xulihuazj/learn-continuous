/*
 * ArrayMaker.java 1.0.0 2017/11/28  23:30 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/28  23:30 created by xulihua
 */
package generic;

import java.lang.reflect.Array;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/28 23:30
 */
public class ArrayMaker<T> {

    private Class<T> kind;

    public ArrayMaker(Class<T> kind){
        this.kind = kind;
    }
    T[] create(int size){
        return (T[])Array.newInstance(kind,size);
    }

}
