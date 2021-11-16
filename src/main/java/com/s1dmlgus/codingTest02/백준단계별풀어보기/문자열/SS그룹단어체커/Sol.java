package com.s1dmlgus.codingTest02.백준단계별풀어보기.문자열.SS그룹단어체커;

import java.util.Arrays;

public class Sol {

    public static boolean[] visited = new boolean[26];


    public static void solution(int n, String[] ar) {

        int cnt = 0;
        char before = '?';

        String s = ar[0];

        for (int k = 0; k < ar.length; k++) {

            for (int i = 0; i< ar[k].length(); i++) {
                int vint = ar[k].charAt(i) - 'a';
                char c = ar[k].charAt(i);

                if (!visited[vint] || before == c) {
                    visited[vint] = true;
                    before = c;
                } else if (visited[vint]) {
                    before = '?';
                    break;
                }
            }
            Arrays.fill(visited, false);
            if (before != '?') {
                cnt++;
            }
        }

        System.out.println("cnt = " + cnt);


    }

    public static void main(String[] args) {

        int n = 3;
        String[] ar = {"ab", "aa", "aca", "ba", "ba"};
        solution(n, ar);
    }
}
