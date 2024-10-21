package com.itheima.controller;

import com.itheima.Service.Animal;

class Bird extends Animal implements Flyable {


    public Bird birdChild;
    public Bird(String name) {
        super(name);
    }

    public void create(Bird bird1){
        birdChild=bird1;
    }

    public void makeSound() {
        System.out.println("Chirp!");
    }

    public void takeOff() {
        System.out.println("Bird takes off!");
    }

    public int getNum(){
        return 1;
    }
}
