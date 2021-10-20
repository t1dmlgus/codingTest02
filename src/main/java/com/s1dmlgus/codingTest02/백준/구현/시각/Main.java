package com.s1dmlgus.codingTest02.백준.구현.시각;

import java.nio.charset.Charset;

public class Main {

    public static void solution(int N){

        int cntH = 0;
        int cntM = 0;
        int cntS = 0;

        int cnt = 0;

        for (int h = 0; h < N+1; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (String.valueOf(h).contains("3") || String.valueOf(m).contains("3") || String.valueOf(s).contains("3") ) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println("cnt = " + cnt);

    }


    public static void main(String[] args) {

        int N = 5;


        solution(5);
    }
}
