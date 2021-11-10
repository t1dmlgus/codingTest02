package com.s1dmlgus.codingTest02.백준.DFS.단지번호붙이기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static int N;
    public static int cnt;
    public static int result;
    public static int[][] Arr = new int[N][N];

    public static ArrayList<Integer> rand = new ArrayList<>();

    private static boolean dfs(int x, int y) {

        if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        }

        if (Arr[x][y] == 1) {

            cnt += 1;
            Arr[x][y] = 0;

            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);

            return true;
        }

        return false;


    }

    public static void solution(int n, int[][] arr) {

        N = n;
        Arr = arr;


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (dfs(i, j)) {
                    rand.add(cnt);
                    cnt = 0;
                    result += 1;
                }
            }
        }
        System.out.println("result = " + result);
        System.out.println(Arrays.toString(rand.toArray()));


    }


    public static void main(String[] args) {

        int n = 7;

        int[][] arr = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };

        solution(7, arr);

    }
}
