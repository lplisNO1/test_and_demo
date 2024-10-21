package com.itheima.testDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileDemo {
    public volatile static VolatileDemo uniqueInstance;
    private volatile static int count;

    VolatileDemo(){}

    public static VolatileDemo getUniqueinstance(){
        if(uniqueInstance==null){
            synchronized (VolatileDemo.class){
                if (uniqueInstance == null) {
                    uniqueInstance = new VolatileDemo();
                }

            }
        }
        return uniqueInstance;
    }

    public static void AtomicityTest() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(()-> {
                for (int j = 0; j < 500; j++) {
                    count++;
                }
                System.out.println(Thread.currentThread().getName()+":"+count);
            });
        }
        Thread.sleep(1500);
        System.out.println(count);
        executorService.shutdown();
    }

}
