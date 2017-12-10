/*
 * Creator.java 1.0.0 2017/11/30  23:59 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/30  23:59 created by xulihua
 */
package generic;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/30 23:59
 */
public class Creator extends GenericWithCreate{

    @Override
    X create() {
        return new X();
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
