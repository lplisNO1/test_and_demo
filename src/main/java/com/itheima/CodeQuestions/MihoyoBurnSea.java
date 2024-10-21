package com.itheima.CodeQuestions;

import java.util.Scanner;

public class MihoyoBurnSea {
    static int n, m;
    static char[][] map;
    static int[][] landId;
    static int[] landSize;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        map = new char[n][m];
        landId = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = in.next().toCharArray();
        }
        
    }
}
