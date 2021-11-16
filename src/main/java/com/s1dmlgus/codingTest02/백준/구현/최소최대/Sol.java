package com.s1dmlgus.codingTest02.백준.구현.최소최대;

import java.util.Arrays;
import java.util.OptionalInt;

public class Sol {

    public static void solution(int N, int[] ar) {

        int max = ar[0];
        int min = ar[0];

        for (int i : ar) {
            if(max < i)
                max = i;
            if (min > i)
                min = i;
        }
    }

    public static void main(String[] args) {

        int N = 5;
        int[] ar = {20, 10, 35, 30, 7};
        solution(N, ar);
    }
}
