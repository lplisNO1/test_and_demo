package com.itheima.controller;

public class Selectsorting {
    public static int[] sort(int[] a) {
        if (a == null || a.length <= 0) {
            return null;
        }
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            boolean flag=false;
            for (int j = i; j < a.length-1; j++) {
                    if(a[min]>a[j+1]) {
                        min = j + 1;
                        flag = true;
                    }
                }
            if (flag){
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
            }
        return a;
    }
}

