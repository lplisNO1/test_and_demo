package com.itheima.CodeQuestions;

import java.util.*;
import java.lang.Math;

public class JDConnectCities {

    // 计算两点之间需要的年数
    public static int years(int x1, int y1, int x2, int y2) {
        long d = 1L * (x1 - x2) * (x1 - x2) + 1L * (y1 - y2) * (y1 - y2);
        int sqr = (int) Math.sqrt(d);
        if (1L * sqr * sqr < d) {
            sqr++;
        }
        return (sqr + 1) / 2;
    }

    // 并查集查找根节点
    public static int find(int[] f, int i) {
        if (f[i] == i) {
            return i;
        }
        return f[i] = find(f, f[i]);
    }

    // 合并两个集合
    public static void union(int[] f, int i, int j) {
        int fi = find(f, i);
        int fj = find(f, j);
        if (fi != fj) {
            f[fi] = fj;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 输入城市数量
        int n = sc.nextInt();

        // 存储城市的坐标
        int[][] cities = new int[n][2];
        for (int i = 0; i < n; i++) {
            cities[i][0] = sc.nextInt();
            cities[i][1] = sc.nextInt();
        }

        // 存储所有边（城市对）
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                edges.add(new int[]{i, j});
            }
        }

        // 根据需要的年数排序边
        edges.sort((e1, e2) -> {
            int u1 = e1[0], v1 = e1[1];
            int u2 = e2[0], v2 = e2[1];
            return Integer.compare(
                    years(cities[u1][0], cities[u1][1], cities[v1][0], cities[v1][1]),
                    years(cities[u2][0], cities[u2][1], cities[v2][0], cities[v2][1])
            );
        });

        // 初始化并查集
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = i;
        }

        // 记录组件数量
        int component = n;

        // 遍历所有边
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            // 如果这两个城市不在同一个集合中，则连接它们
            if (find(f, u) != find(f, v)) {
                union(f, u, v);
                component--;
            }

            // 如果所有城市连通，输出结果
            if (component == 1) {
                System.out.println(years(cities[u][0], cities[u][1], cities[v][0], cities[v][1]));
                break;
            }
        }

        sc.close();
    }
}
