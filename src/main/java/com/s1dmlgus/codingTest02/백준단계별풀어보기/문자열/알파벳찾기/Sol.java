package com.s1dmlgus.codingTest02.백준단계별풀어보기.문자열.알파벳찾기;

import java.util.Arrays;

public class Sol {

    public static int[] visited = new int[26];

    public static void solution(String s) {

        Arrays.fill(visited, -1);
        
        char[] cs = s.toCharArray();

        for (int i = 0; i < cs.length; i++) {
            int i1 = (int) cs[i] - 97;
            System.out.println("i = " + i);
            visited[i1] = i;
        }

        System.out.println("Arrays.toString(visited) = " + Arrays.toString(visited));

    }

    public static void main(String[] args) {

        String s = "baekjoon";
        solution(s);

    }

}
