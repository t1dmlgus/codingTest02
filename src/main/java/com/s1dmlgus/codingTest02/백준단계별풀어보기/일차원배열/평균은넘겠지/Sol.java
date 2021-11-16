package com.s1dmlgus.codingTest02.백준단계별풀어보기.일차원배열.평균은넘겠지;

import java.text.DecimalFormat;

public class Sol {

    public static void solution(int n, int[] ar) {

        DecimalFormat df = new DecimalFormat("0.000");

        double avg = 0.0;
        int cnt = 0;

        for (int i : ar) {
            avg += i;
        }
        avg /= n;

        for (int i : ar) {
            if(i > avg)
                cnt++;
        }
        double v = cnt / (double) n * 100;
        String format = df.format(v);

        System.out.println("format = " + format);

    }

    public static void main(String[] args) {

        int n = 7;
        int[] ar = {100, 95, 90, 80, 70, 60, 50};
        solution(n, ar);
    }
}
