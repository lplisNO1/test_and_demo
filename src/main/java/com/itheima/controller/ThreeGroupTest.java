package com.itheima.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThreeGroupTest {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            int[] nums = new int[n];
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int count=0;
            for (int i = 0; i < n; i++) {
                nums[i]=in.nextInt();
            }

            Set<Integer> set=new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(nums[i]);
            }
            for (int i = 0; i < n; i++) {
                if(set.contains(nums[i])){
                    hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
                }
            }
            int sum=1;
            for(int i:set){
                if(hashMap.get(i)>1){
                    count+= hashMap.get(i);}
            }

            int n2= set.size();
            for (int i = n2; i >n2-3 ; i--) {
                sum=sum*i;
            }
            sum=sum/6;
            if(count>1) sum=sum*(count);
            System.out.println(sum);
        }

}
