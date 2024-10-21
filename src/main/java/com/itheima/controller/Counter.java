package com.itheima.controller;

public class Counter {
    private String name;
    public int num=0;
    Counter(String name){
        name=this.name;
        increment();
    }
    public void increment(){
        num++;
    }

    public String toString(){
        return Integer.toString(num);
    }
}
