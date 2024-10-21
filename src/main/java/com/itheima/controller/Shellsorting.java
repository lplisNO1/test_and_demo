package com.itheima.controller;

import java.util.ArrayList;

public class Shellsorting {
    public static int[] sort(int[] nums){
        int n= nums.length;

        for (int d = n/2; d >0; d=d/2) {
            for (int i = 0; i < d; i++) {
                for (int j = i+d; j <n ; j+=d) {
                    if(nums[j]<nums[j-d]){
                        int temp=nums[j];
                        int k;
                        for (k = j-d; k >=0 && nums[k]>temp ; k-=d) {
                            nums[k+d]=nums[k];

                        }
                        nums[k+d]=temp;
                    }

                }
            }
        }
        return nums;
    }
}
