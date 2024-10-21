package com.itheima.controller;

import com.itheima.Service.Animal;

public class Dog extends Animal {
    private int id;
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Dog temp=(Dog)obj;
        return temp.id == this.id;
    }


    public Dog(String name,int id) {
        super(name);
        this.id=id;
    }

    public int getId() {
        return id;
    }

    protected void makeSound() {
        System.out.println("Wang!");
    }
}
