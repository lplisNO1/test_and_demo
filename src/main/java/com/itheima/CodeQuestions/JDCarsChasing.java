package com.itheima.CodeQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JDCarsChasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] cars=new int[n][2];

        for (int i = 0; i <n ; i++) {
            cars[i][0]=in.nextInt();
            cars[i][1]=in.nextInt();
        }

        Arrays.sort(cars, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int[] dp=new int[n];
        int result=0;
        Arrays.fill(dp,1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(cars[i][1]>=cars[j][1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            result= Math.max(result,dp[i]);
        }
        System.out.println(n-result);
    }
}
