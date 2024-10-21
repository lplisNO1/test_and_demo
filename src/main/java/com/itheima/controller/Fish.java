package com.itheima.controller;

import com.itheima.Service.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fish extends Animal {
    public Fish(String name){
        super(name);
    }
    public void count(Integer... args){
        List<Integer > nums=Arrays.asList(args);
        nums.size();
        System.out.println(nums);
    }

    @Override
    protected void makeSound() {
        System.out.println("GUlu Gulu");
    }
}
