package com.itheima.controller;

import java.util.Arrays;

public class Quicksorting {
    public static void sort(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int hightemp = high;
        int lowtemp = low + 1;
        int temp;
        if (low < high) {
            int stan = nums[low];
            while (hightemp != lowtemp) {
                if (nums[hightemp] >= stan) {
                    hightemp--;
                } else {
                    temp = nums[hightemp];
                    while (hightemp != lowtemp) {
                        if (nums[lowtemp] < stan) {
                            lowtemp++;
                        } else {
                            nums[hightemp] = nums[lowtemp];
                            nums[lowtemp] = temp;
                            hightemp--;
                            break;
                        }
                    }
                }
            }
            nums[low] = nums[lowtemp];
            nums[lowtemp] = stan;
            sort(nums, low, hightemp - 1);
            sort(nums, lowtemp + 1, high);
        }
    }

    public static void sort(int[] nums, int low, int high) {
        int hightemp = high;
        int lowtemp = low + 1;
        int temp;
        if (low < high) {
            int stan = nums[low];
            while (hightemp != lowtemp) {
                if (nums[hightemp] >= stan) {
                    hightemp--;
                } else {
                    temp = nums[hightemp];
                    while (hightemp != lowtemp) {
                        if (nums[lowtemp] < stan) {
                            lowtemp++;
                        } else {
                            nums[hightemp] = nums[lowtemp];
                            nums[lowtemp] = temp;
                            hightemp--;
                            break;
                        }
                    }
                }
            }
            nums[low] = nums[lowtemp];
            nums[lowtemp] = stan;
            sort(nums, low, hightemp - 1);
            sort(nums, lowtemp + 1, high);
        }
    }
}
