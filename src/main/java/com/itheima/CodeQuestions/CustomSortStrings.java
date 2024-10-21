package com.itheima.CodeQuestions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CustomSortStrings {

    // 根据自定义顺序对字符串数组进行排序
    public static void sortStringsByRank(String[] strings, String rank) {
        // 构建字母排名的映射表
        Map<Character, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < rank.length(); i++) {
            rankMap.put(rank.charAt(i), i);
        }

        // 自定义比较器，根据rankMap进行字符的比较
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int minLength = Math.min(s1.length(), s2.length());

                // 按照字符顺序比较两个字符串
                for (int i = 0; i < minLength; i++) {
                    char c1 = s1.charAt(i);
                    char c2 = s2.charAt(i);

                    // 比较两个字符的rank值
                    if (rankMap.get(c1) != rankMap.get(c2)) {
                        return rankMap.get(c1) - rankMap.get(c2);
                    }
                }

                // 如果前面相同，比较字符串长度
                return s1.length() - s2.length();
            }
        });
    }

    // 测试用例
    public static void main(String[] args) {
        String[] strings = {"aaa", "aac", "aaaa"};
        String rank = "abcdefghijklmnopqrstuvwxyz"; // 自定义字母顺序为逆序

        sortStringsByRank(strings, rank);

        // 输出排序结果
        System.out.println("根据rank排序后的字符串: " + Arrays.toString(strings));
    }
}
