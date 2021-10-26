package com.s1dmlgus.codingTest02.백준.정렬.가장큰수;

import java.util.*;

public class Solution {

    public static boolean[] visited = new boolean[1001];
    public static int[] number;

    public static ArrayList<Integer> ar = new ArrayList<>();



    private void dfs(String n) {

        ar.add(Integer.parseInt(String.valueOf(n)));

        for (int i = 0; i < number.length; i++) {
            if (!visited[i]) {

                visited[i] = true;
                dfs(n + String.valueOf(number[i]));
                visited[i] = false;
            }
        }
    }

    public String solution(int[] numbers) {

        number = numbers;
        dfs("0");

        Collections.sort(ar);
        Integer target = ar.get(ar.size() - 1);

        return String.valueOf(target);
    }


    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        Solution solution = new Solution();
        solution.solution(numbers);
    }
}
