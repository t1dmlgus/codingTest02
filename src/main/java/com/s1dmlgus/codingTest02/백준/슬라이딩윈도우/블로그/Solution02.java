package com.s1dmlgus.codingTest02.백준.슬라이딩윈도우.블로그;

public class Solution02 {

    private static void solution(int x, int[] arr) {

        // max
        // count

        int max = 0;
        int count = 1;
        int answer = 0;

        for (int i = 0; i <= arr.length-x; i++) {
            for (int j = 0; j < x; j++) {
                answer += arr[i + j];
            }
            if (max == answer) {
                count ++;
            }else if (max < answer) {
                max = answer;
                count = 1;
            }
            answer = 0;
        }

        if (max != 0) {
            System.out.println("max = " + max);
            System.out.println("count = " + count);
        }else {
            System.out.println("SAD");
        }

    }


    public static void main(String[] args) {
        int X = 3;
        int[] arr = {0, 0, 0, 0, 0};

        solution(X, arr);

    }


}
