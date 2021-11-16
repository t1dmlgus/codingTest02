package com.s1dmlgus.codingTest02.백준단계별풀어보기.일차원배열.슛자의개수;

import java.util.Arrays;

public class Sol {

    public static int[] visited = new int[10];


    public static void solution(int[] ar) {

        int cnt = ar[0];
        for (int i = 1; i < ar.length; i++) {
            cnt *= ar[i];
        }
        char[] items = String.valueOf(cnt).toCharArray();
        for (int i = 0; i < items.length; i++) {

            int i1 = items[i] - '0';
            visited[i1]++;
        }
        System.out.println("visited = " + Arrays.toString(visited));
    }

    public static void main(String[] args) {

        int[] ar = {150, 266, 427};
        solution(ar);
    }
}
