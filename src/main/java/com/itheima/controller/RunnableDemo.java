package com.itheima.controller;

public class RunnableDemo implements Runnable{
    public String name;

    RunnableDemo(String name){
        this.name=name;
    }
    @Override
    public void run() {
        int i=0;
        while(i<3){
            System.out.println("运行线程："+name+" 次数： "+i);
            i++;
        }
    }

    public void start(){
        System.out.println("线程启动："+name);
        Thread thread = new Thread(this, name);
        thread.start();
        System.out.println(thread.getName());
    }
}
