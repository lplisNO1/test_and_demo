package com.itheima.CodeQuestions;

import java.util.Arrays;

public class JDSumofCuts {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int n= nums.length;
        int sum=0;
        int result=Integer.MAX_VALUE;
        for (int i = 0; i <n; i++) {
            sum+=nums[i];
        }
        Arrays.sort(nums);

        result=nums[0]*(sum-nums[0]);
        System.out.println(result);
    }
}
