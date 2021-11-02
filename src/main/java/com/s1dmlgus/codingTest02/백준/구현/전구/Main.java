package com.s1dmlgus.codingTest02.백준.구현.전구;

import java.util.Arrays;

public class Main {

    /**
     * 전구 갯수 : N
     * 입력되는 명령어 개수 : M
     * <p>
     * 0: 꺼진상태
     * 1: 켜진상태
     */

    public static int[] arr = new int[4001];

    public static void solution(int N, int[][] inst){


        Arrays.fill(arr, 0, N, 0);

        for (int i = 0; i < inst.length; i++) {
            int a = inst[i][0];
            int b = inst[i][1];
            int c = inst[i][2];

            oper(a, b, c);

        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void oper(int a, int b, int c) {
        if (a == 1) {
            arr[b-1] = c;
        } else if (a == 2) {
            for (int j = b-1; j < c; j++) {
                if (arr[j] == 0) arr[j] = 1;
                else arr[j] = 0;

            }
        } else if (a == 3) {
            for (int j = b-1; j < c; j++) {
                arr[j] = 0;
            }
        } else {
            for (int j = b-1; j < c; j++) {
                arr[j] = 1;
            }
        }
    }


    public static void main(String[] args) {

        int N = 8;
        int[][] inst = {{1, 2, 1}, {1, 4, 1}, {2, 2, 4}, {2, 1, 7}, {3, 5, 8}, {4, 4, 6}};
        solution(N, inst);
    }
}
