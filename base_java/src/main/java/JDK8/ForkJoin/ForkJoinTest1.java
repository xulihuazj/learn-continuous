/*
 * ForkJoinTest1.java 1.0.0 2017/12/9  17:05 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  17:05 created by xulihua
 */
package JDK8.ForkJoin;

import java.util.concurrent.RecursiveTask;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 17:05
 */
public class ForkJoinTest1 extends RecursiveTask<Long> {

    private long start;

    private long end;

    //拆分　临界值
    private static final long THRESHOLD = 10000;

    public ForkJoinTest1(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;
        if (length <= THRESHOLD) {
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            long middle = (start + end) / 2;
            ForkJoinTest1 left = new ForkJoinTest1(start, middle);
            left.fork();
            ForkJoinTest1 right = new ForkJoinTest1(middle + 1, end);
            right.fork();
            return left.join() + right.join();
        }
    }
}
