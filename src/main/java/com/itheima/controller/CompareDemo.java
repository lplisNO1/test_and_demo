package com.itheima.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CompareDemo {
    public static void main(String[] args) {
        Integer[] nums = {2,4,3,5,6,8,7};

        Arrays.sort(nums, new Comparator<Integer>() {
            public int compare(Integer nums1,Integer nums2) {
                if(nums1+nums2==6)
                    return 0;
                return nums2-nums1;
            }
        });
        System.out.println(Arrays.toString(nums));
    }
}
