/*
 * ListMaker.java 1.0.0 2017/11/28  23:34 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/28  23:34 created by xulihua
 */
package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/28 23:34
 */
public class ListMaker<T> {

    List<T> create(){
        return new ArrayList<>();
    }

    @Test
    public void test1(){
        ListMaker<String> stringListMaker = new ListMaker<>();
        List<String> strings = stringListMaker.create();
    }
}
