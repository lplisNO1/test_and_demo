package com.itheima.testDemo;

import com.itheima.controller.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz=null;
        clazz=Class.forName("com.itheima.controller.Dog");

        Dog dog=(Dog) clazz.newInstance();
        System.out.println(dog);

        Constructor cs1=clazz.getConstructor(String.class,int.class);
        Dog dog2=(Dog) cs1.newInstance("li",1);
        System.out.println(dog2.getId());

        Field fi1=clazz.getField("id");
        System.out.println(fi1.get(dog2));
        System.out.println(dog2.getId());
    }
}
