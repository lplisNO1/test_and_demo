package com.itheima.controller;

import java.util.Arrays;
import java.util.LinkedList;

public class Insertsorting {
    public static int[]  sort(int[] nums){
        LinkedList<Integer> result = new LinkedList<>();
        result.add(nums[0]);
        for (int i = 1; i < nums.length ; i++) {
            int index=result.size();
            for (int j = result.size()-1; j>=0 && nums[i]<result.get(j); j--) {
//                boolean flag=false;
//                    if(nums[i]<result.get(j)){
//                        index=j;
//                    }
//                    else flag=true;
//                    if (flag){
//                        break;
//                    } 简化了代码
                index=j;
            }
            result.add(index,nums[i]);
        }
        for (int i = 0; i < result.size(); i++) {
            nums[i]= result.get(i);
        }
        return nums;
    }
}
