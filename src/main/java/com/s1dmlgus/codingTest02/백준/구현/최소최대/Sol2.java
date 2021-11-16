package com.s1dmlgus.codingTest02.백준.구현.최소최대;

public class Sol2 {

    public static void solution(int[] ar) {

        int max = ar[0];
        int index = 0;

        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
            index = i;
        }

        System.out.println("max = " + max);
        System.out.println("index = " + index);

    }

    public static void main(String[] args) {

        int[] ar = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        solution(ar);
    }
}
