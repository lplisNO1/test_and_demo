package com.itheima.CodeQuestions;

import java.util.Scanner;

public class MihoyoWangshiletu {

    static int[] chosen;
    static int[][] rewards;
    static int[][] source;
    static int[] extraValue;
    static int n,m;
    static int maxValue;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        chosen=new int[m];
        rewards=new int[n][3];
        source=new int[n][3];
        extraValue=new int[m];
        for (int i = 0; i < m; i++) {
            extraValue[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <3; j++) {
                rewards[i][j]=in.nextInt();
            }
            for (int j = 0; j <3; j++) {
                source[i][j]=in.nextInt();
            }
        }
        dfs(0,0);
        System.out.println(maxValue);

    }

    public static void dfs(int level, int sumed){
        if(level==n){
            for (int i = 0; i < m; i++) {
                sumed+=(chosen[i]/3)*extraValue[i];
            }
            if(sumed>maxValue){
                maxValue=sumed;
            }
            return;
        }
        for (int i = 0; i < 3; i++) {
            chosen[source[level][i]-1]++;
            dfs(level+1,sumed+rewards[level][i]);
            chosen[source[level][i]-1]--;

        }
    }
}
