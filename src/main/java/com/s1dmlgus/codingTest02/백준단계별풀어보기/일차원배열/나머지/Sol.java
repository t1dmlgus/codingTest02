package com.s1dmlgus.codingTest02.백준단계별풀어보기.일차원배열.나머지;

import java.util.Arrays;

public class Sol {

    public static void solution(int N, int[] ar) {

        int max = ar[0];

        float cnt = 0;

        for (int i : ar) {
            if (max < i) {
                max = i;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            double v = ar[i] / (double) max * 100;
            cnt += v;
        }
        cnt /= N;

        System.out.println("cnt = " + cnt);

    }

    public static void main(String[] args) {

        int N = 5;
        int[] ar = {1, 2, 4, 8, 16};
        solution(N, ar);
    }
}
