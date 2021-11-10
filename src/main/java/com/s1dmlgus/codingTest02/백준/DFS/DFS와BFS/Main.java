package com.s1dmlgus.codingTest02.백준.DFS.DFS와BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    public static int N = 4;        // 정점개수
    public static int M = 5;        // 간선개수
    public static int v = 1;        // 시작정점

    public static boolean[] visited = new boolean[N+1];
    public static int[][] arr = new int[1001][1001];

    public static Queue<Integer> q = new LinkedList<>();


    private static void dfs(int v) {

        if (!visited[v]) {
            System.out.println("v = " + v);
        }
        visited[v] = true;

        for (int i = 1; i < N+1; i++) {
            if (arr[v][i] == 1 && visited[v]) {
                arr[i][v] = arr[v][i] = 0;
                dfs(i);
            }
        }

    }



    private static void bfs(int v) {

        q.offer(v);

        while (!q.isEmpty()) {
            Integer poll = q.poll();

            if(!visited[poll])
                System.out.println("poll = " + poll);

            visited[poll]=true;

            for (int i = 1; i < N+1; i++) {
                if (arr[poll][i] == 1 && visited[poll]) {
                    q.offer(i);
                    arr[poll][i] = arr[i][poll] = 0;

                }
            }
        }

    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int v = sc.nextInt();



        // 인접행렬 사용
        for (int i = 0; i < M; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x][y] = arr[y][x] = 1;

        }

        dfs(v);

        // 인접행렬 사용
        for (int i = 0; i < M; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x][y] = arr[y][x] = 1;

        }

        bfs(v);

    }

}
