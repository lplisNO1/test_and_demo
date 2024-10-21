package com.itheima.controller;

public class Generic<T>{

    private T key;

    public Generic() {
    }
    public Generic(T key) {
        this.key = key;
    }

    public T getKey(){
        return key;
    }
    public < Animal > void printArray( Animal[] inputArray )
    {
        for ( Animal element : inputArray ){
            System.out.println(element);
        }
        System.out.println();
    }
}
