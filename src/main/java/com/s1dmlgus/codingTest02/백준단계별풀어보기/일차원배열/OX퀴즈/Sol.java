package com.s1dmlgus.codingTest02.백준단계별풀어보기.일차원배열.OX퀴즈;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol {

    public static void solution(String[] oxs) {

        // 연속횟수
        int cnt = 0;
        // 합계
        int sum = 0;

        String ox = oxs[0];
        char[] items = ox.toCharArray();
        for (int i = 0; i < items.length; i++) {

            if (items[i] == 'O') {
                cnt++;
                sum += cnt;
            }else {
                cnt = 0;
            }

        }
        System.out.println("sum = " + sum);



    }

    public static void main(String[] args) {

        String[] oxs = {
                "OOXXOXXOOO",
                "OOXXOOXXOO",
                "OXOXOXOXOXOXOX",
                "OOOOOOOOOO",
                "OOOOXOOOOXOOOOX"};

        solution(oxs);

    }
}
