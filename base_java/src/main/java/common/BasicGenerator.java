/*
 * BasicGenerator.java 1.0.0 2017/11/26  22:59 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/26  22:59 created by xulihua
 */
package common;

import org.junit.Test;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/26 22:59
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }

    @Test
    public void test(){

    }
}
