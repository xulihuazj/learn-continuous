/*
 * TestAnnotation.java 1.0.0 2017/12/9  20:12 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  20:12 created by xulihua
 */
package JDK8.Annotation;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 20:12
 */
public class TestAnnotation {

    @Test
    public void test1(){
       Class<TestAnnotation> clazz =  TestAnnotation.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method:declaredMethods){
            if(method.getName().equals("show")){
                //AnnotatedType annotatedReturnType = method.getAnnotatedReturnType(MyAnnotation.class);

            }
        }
    }
}
