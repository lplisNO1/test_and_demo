package com.itheima.controller;

public class Heapsorting {
    public static void heaplify(int[] nums,int i,int n){
        int left=2*i+1;
        int right=2*i+2;
        int largest=i;
        int heaplen=n-1;

        if(left<= heaplen && nums[left]>nums[largest])
            largest=left;
        if (right<=heaplen && nums[right]>nums[largest])
            largest=right;
        if(largest!=i){
            int temp=nums[i];
            nums[i]=nums[largest];
            nums[largest]=temp;
            heaplify(nums,largest,n);
        }
    }

    public static void bulidMaxHeap(int [] nums,int n){
        for (int i = n/2-1 ; i>=0 ; i--) {
            heaplify(nums,i,n);
        }
    }

    public static int[] sort(int[] nums){
        int heaplen= nums.length;
        int temp;
        int[] result=new int[heaplen];
        for (int i = 0; i <heaplen; i++) {
            bulidMaxHeap(nums,heaplen-i);
            temp=nums[heaplen-i-1];
            nums[heaplen-i-1]=nums[0];
            nums[0]=temp;
            result[heaplen-i-1]=nums[heaplen-i-1];
        }
        return result;
    }


}

