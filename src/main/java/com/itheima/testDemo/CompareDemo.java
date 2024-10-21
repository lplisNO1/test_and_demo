package com.itheima.testDemo;

import com.itheima.controller.Dog;

import java.util.HashSet;

public class CompareDemo {

        public static void main(String[] args){
            HashSet<Dog> temp = new HashSet<>();
            Dog li = new Dog("Li", 1);
            Dog mai = new Dog("Mai", 1);
            temp.add(li);
            System.out.println(temp.contains(mai));
        }

}
