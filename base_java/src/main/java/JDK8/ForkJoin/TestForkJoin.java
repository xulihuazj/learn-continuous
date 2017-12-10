/*
 * TestForkJoin.java 1.0.0 2017/12/9  17:13 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  17:13 created by xulihua
 */
package JDK8.ForkJoin;

import org.junit.Test;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 17:13
 */
public class TestForkJoin {

    @Test
    public void test1() {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTest1 task = new ForkJoinTest1(0, 1000000000L);
        Long sum = pool.invoke(task);
        System.out.println(sum);
    }

    //并行流
    @Test
    public void test2(){
        LongStream.rangeClosed(0,1000000L)
            .parallel()
                .reduce(0,Long::sum);
    }
}
