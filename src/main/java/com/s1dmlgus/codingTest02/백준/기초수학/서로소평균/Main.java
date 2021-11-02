package com.s1dmlgus.codingTest02.백준.기초수학.서로소평균;

import java.util.ArrayList;

public class Main {


    /**
     * 수열 갯수 : N
     * 입력된 수 : X
     * 
     * 서로소 - 최대 공약수가 1인 두 자연수
     */

    public static void solution(int x, int[] arr) {

        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            int gcd = gcd(x, arr[i]);
            if (gcd == 1) {
                cnt++;
                answer += arr[i];
            }
        }
        answer /= cnt;

        System.out.println("answer = " + answer);
    }


    // 최대 공약수
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
    
    
    public static void main(String[] args) {

        int[] arr = {4, 2, 8, 5, 7};
        int x = 4;

        solution(x, arr);


    }
}
