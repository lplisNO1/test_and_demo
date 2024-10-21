package com.itheima.Service;

public abstract class Animal {
    private final String name;
    public Animal(String name) {
        this.name = name;
    }

    protected abstract void makeSound();

    public void getName() {
        System.out.println(name);
    }


}
