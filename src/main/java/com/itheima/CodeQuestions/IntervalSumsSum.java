package com.itheima.CodeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class IntervalSumsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }

        Arrays.sort(nums);

        int[] numsMid=new int[n];
        int left;
        int right;
        left=n/2-1;
        right=n/2;
        int i=0;
        while(right<n){
            numsMid[right]=nums[i++];
            right++;
            if(left>=0) {
                numsMid[left] = nums[i++];
                left--;
            }
        }
        int sum=0;
        for (int j = 0; j < n; j++) {
            sum+=numsMid[j]*(j+1)*(n-j);
        }
        System.out.println(sum);

    }
}
