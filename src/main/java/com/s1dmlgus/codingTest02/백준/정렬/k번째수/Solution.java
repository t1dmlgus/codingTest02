package com.s1dmlgus.codingTest02.백준.정렬.k번째수;

import java.util.Arrays;

public class Solution {

    public static int[] solution(int[] arr, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int st = commands[i][0];
            int fi = commands[i][1];
            int target = commands[i][2];

            int[] integers = Arrays.copyOfRange(arr, st - 1, fi);
            Arrays.sort(integers);

            answer[i] = integers[target-1];
        }

        return answer;
    }


    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, commands)));


    }
}
