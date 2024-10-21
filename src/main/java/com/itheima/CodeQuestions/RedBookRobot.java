package com.itheima.CodeQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class RedBookRobot {
    static int n;
    static int m;
    static int[][] extraMap;
    static char[][] map;

    static ArrayList<Integer> tempX;
    static ArrayList<Integer> tempY;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        m=in.nextInt();
        extraMap=new int[n][m];
        map=new char[n][m];
        for (int i = 0; i < n; i++) {
            String temp=in.next();
            for (int j = 0; j < m; j++) {
                map[i][j]=temp.charAt(j);
                extraMap[i][j]=-2;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempX=new ArrayList<>();
                tempY=new ArrayList<>();
                dfs(i,j);
            }
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(extraMap[i][j]==1) count++;
            }

        }
        System.out.println(count);
        for (int i = 0; i <n; i++) {
            System.out.println(' ');
            for (int j = 0; j < m; j++) {
                System.out.print(extraMap[i][j]);
            }
        }

    }

    public static void dfs(int x,int y){

        if(x<0||y<0||x>=n||y>=m) {
            for (int i = 0; i < tempX.size(); i++) {
                extraMap[tempX.get(i)][tempY.get(i)]=0;
            }
            return;
        }
        tempX.add(x);
        tempY.add(y);
        if(extraMap[x][y]==1 ) {
            for (int i = 0; i < tempX.size(); i++) {
                extraMap[tempX.get(i)][tempY.get(i)]=1;
            }
            return;
        }
        if(extraMap[x][y]==0 ) {
            for (int i = 0; i < tempX.size(); i++) {
                extraMap[tempX.get(i)][tempY.get(i)]=0;
            }
            return;
        }
        if(extraMap[x][y]==-1){
            for (int i = 0; i < tempX.size(); i++) {
                extraMap[tempX.get(i)][tempY.get(i)]=1;
            }
            return;
        }
        extraMap[x][y]=-1;
        if(map[x][y]=='L') dfs(x,y-1);
        if(map[x][y]=='R') dfs(x,y+1) ;
        if(map[x][y]=='U') dfs(x-1,y);
        if(map[x][y]=='D') dfs(x,y-1);
    }
}
