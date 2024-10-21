package com.itheima.controller;

public class Bubble {
    public static int[] sort(int[] nums){
        int temp;
        boolean flag;
        while(true){
            flag=false;
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i]>nums[i+1]){
                    temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                    flag=true;
                }

            }
            if (!flag){
                break;
            }
        }
        return nums;
    }
}
