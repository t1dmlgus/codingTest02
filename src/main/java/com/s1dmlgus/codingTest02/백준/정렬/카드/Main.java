package com.s1dmlgus.codingTest02.백준.정렬.카드;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 백준 : 카드, 11652
 * https://www.acmicpc.net/problem/11652
 */

public class Main {

    public static int N = 6;
    public static Integer[] visited = new Integer[6];

    public static void solution(int[] card) {

        Arrays.fill(visited, 0);

        N = card.length;

        for (int i = 0; i < N; i++) {
            visited[card[i]] += 1;
        }

        int max = visited[0];
        int maxIndex = 0;

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == max) {
                maxIndex = Math.min(maxIndex, i);
            }
            if (visited[i] > max) {
                max = visited[i];
                maxIndex = i;
            }
        }

        System.out.println("max = " + max);
        System.out.println("maxIndex = " + maxIndex);

    }




    public static void main(String[] args) {

        int[] card = new int[]{1, 2, 1, 2, 1,2};
        solution(card);
    }

}
