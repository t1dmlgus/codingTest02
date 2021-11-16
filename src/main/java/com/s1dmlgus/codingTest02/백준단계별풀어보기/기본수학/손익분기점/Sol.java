package com.s1dmlgus.codingTest02.백준단계별풀어보기.기본수학.손익분기점;

public class Sol {

    // A : 고정비용
    // B : 가변비용

    // C : 노트북 가격
    // 손익분기점 : 총 수입 > 총 비용

    public static void solution(int a, int b, int c) {

        int n = 1;

        if (c <= b) {
            System.out.println(-1);
        } else {
            System.out.println(a / (c - b) + 1);
        }

    }

    public static void main(String[] args) {
        int a = 1000;
        int b = 70;
        int c = 170;

        solution(a, b, c);
    }
}
