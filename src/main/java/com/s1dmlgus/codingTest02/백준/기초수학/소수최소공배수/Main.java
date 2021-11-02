package com.s1dmlgus.codingTest02.백준.기초수학.소수최소공배수;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static ArrayList<Integer> primeArr = new ArrayList<>();

    public static void solution(int N, int[] arrA) {

        int answer = 1;

        //1. 소수를 찾는다.
        //2. 최소공배수를 구한다.
        //* 최대 공약수 : GCD(a, b)

        for (int i : arrA) {
            isPrime(i);
        }
        if (primeArr.isEmpty()) {
            answer = -1;
        }
        for (Integer aa : primeArr) {
            answer = lcm(answer, aa);
        }

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

    // 최소 공배수
    public static int lcm(int x, int y) {
        return x / gcd(x, y) * y;
    }



    public static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        primeArr.add(n);
        return true;
    }


    public static void main(String[] args) {
        int N = 5;
        int[] arrA = {2, 3, 5, 6, 8};

        solution(N, arrA);


    }

}
