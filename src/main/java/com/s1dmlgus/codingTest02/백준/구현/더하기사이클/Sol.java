package com.s1dmlgus.codingTest02.백준.구현.더하기사이클;

import java.util.HashSet;
import java.util.Set;

public class Sol {


    public static Set<Integer> set = new HashSet<>();

    public static void solution(int N) {

        StringBuilder sb = new StringBuilder();
        int a1;
        int b1;


        char c11;
        int cnt = 0;

        while (!set.contains(N)) {

            set.add(N);
            if (N < 10) {
                a1 = 0;
                b1 = String.valueOf(N).charAt(0) - '0';
            }else {
                a1 = String.valueOf(N).charAt(0) - '0';
                b1 = String.valueOf(N).charAt(1) - '0';
            }

            // 8
            int c1 = a1 + b1;

            if (c1 < 10) {
                c11 = Integer.toString(c1).charAt(0);
            }else {
                c11 = Integer.toString(c1).charAt(1);
            }

            sb.append(b1);
            sb.append(c11);
            N = Integer.parseInt(sb.toString());
            sb.setLength(0);
            cnt++;
        }

        System.out.println("cnt = " + cnt);


    }

    public static void main(String[] args) {

        int N = 71;
        solution(N);

    }
}
