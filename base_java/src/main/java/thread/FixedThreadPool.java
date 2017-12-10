/*
 * FixedThreadPool.java 1.0.0 2017/11/19  16:43 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/19  16:43 created by xulihua
 */
package thread;

import java.util.concurrent.*;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/19 16:43
 */
public class FixedThreadPool {

    public static void main(String[] args){
       // ExecutorService executorService = Executors.newFixedThreadPool(5);
        //构造一个核心线程数为5,
        ExecutorService executorService =new ThreadPoolExecutor(5,Integer.MAX_VALUE,
                6L, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        for(int i = 0; i<5 ;i++){
            executorService.execute(
                    new Runnable() {
                        int count = 1;

                        @Override
                        public void run() {
                            count++;
                            System.out.println("executor...." + ":" + count);
                        }
                    }
            );
        }
        executorService.shutdown();
    }
}


