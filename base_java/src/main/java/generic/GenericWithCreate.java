/*
 * GenericWithCreate.java 1.0.0 2017/11/30  23:56 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/30  23:56 created by xulihua
 */
package generic;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/30 23:56
 */
public abstract class GenericWithCreate<T> {

    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();

}
