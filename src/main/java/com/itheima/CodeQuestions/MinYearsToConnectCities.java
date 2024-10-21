package com.itheima.CodeQuestions;

import java.util.*;

public class MinYearsToConnectCities {

    // 定义一个边类，包含两个城市和它们之间的距离
    static class Edge implements Comparable<Edge> {
        int city1, city2;
        double distance;

        public Edge(int city1, int city2, double distance) {
            this.city1 = city1;
            this.city2 = city2;
            this.distance = distance;
        }

        // 按照距离从小到大排序
        @Override
        public int compareTo(Edge other) {
            return Double.compare(this.distance, other.distance);
        }
    }

    // Kruskal算法所需的并查集
    static class UnionFind {
        private int[] parent;
        private int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }

        // 查找根节点
        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        // 合并两个集合
        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) {
                return false;
            }

            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }

            return true;
        }
    }

    // 计算最少需要多少年才能使所有城市连通
    public static double minYearsToConnectCities(int[][] cities) {
        int n = cities.length;
        List<Edge> edges = new ArrayList<>();

        // 计算所有城市之间的距离并生成边
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = Math.sqrt(Math.pow(cities[i][0] - cities[j][0], 2) + Math.pow(cities[i][1] - cities[j][1], 2));
                edges.add(new Edge(i, j, distance));
            }
        }

        // 按照距离从小到大排序边
        Collections.sort(edges);

        // Kruskal算法构建最小生成树
        UnionFind uf = new UnionFind(n);
        double minYears = 0;
        int edgesUsed = 0;

        for (Edge edge : edges) {
            if (uf.union(edge.city1, edge.city2)) {
                minYears = Math.max(minYears, edge.distance); // 记录最后一条边的长度
                edgesUsed++;
                if (edgesUsed == n - 1) {
                    break; // 当我们使用了 n-1 条边时，最小生成树已经构建完成
                }
            }
        }

        return minYears;
    }

    // 测试
    public static void main(String[] args) {
        // 输入城市坐标
        int[][] cities = {
                {0, 0},
                {0, 5},
                {6, 0}
        };

        System.out.println("最少需要多少年才能连通所有城市: " + minYearsToConnectCities(cities));
    }
}

