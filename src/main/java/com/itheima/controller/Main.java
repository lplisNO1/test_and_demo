package com.itheima.controller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            int[] nums=new int[3];
            for (int j = 0; j < 3; j++) {
                nums[j]=in.nextInt();
            }
            int k=in.nextInt();
            int vRoom=nums[0]*nums[1]*nums[2];
            if(vRoom<k) {
                System.out.println(0);
                continue;
            }
            //确定桌子
            for (int j = 0; j < Math.cbrt(k); j++) {
                for (int l = 0; l <Math.sqrt(k/j); l++) {
                    if(k/i/l%1==0){

                    }
                }
            }




        }
        System.out.println(Math.cbrt(8));

    }
}
