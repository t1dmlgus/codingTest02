package com.s1dmlgus.codingTest02.백준단계별풀어보기.문자열.숫자의합;

public class Sol {

    public static void solution(String s) {

        int sum = 0;

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            sum += aChar - '0';
        }

        System.out.println("sum = " + sum);

    }

    public static void main(String[] args) {

        String s = "10987654321";
        solution(s);

    }
}
