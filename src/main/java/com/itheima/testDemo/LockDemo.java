package com.itheima.testDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockDemo {
    private static int count;

    public static void incSynchronized(){
        synchronized (LockDemo.class){
        count++;}
    }

    public static void inc(){
            count++;
    }
    public static void test1() throws InterruptedException {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            for (int i = 0; i < 5; i++) {
                executorService.execute(()-> {
                    for (int j = 0; j < 500; j++) {
                        inc();
                        //incLock();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+count);
                });
            }
            Thread.sleep(1500);
            System.out.println(count);
            executorService.shutdown();

    }


    

}
