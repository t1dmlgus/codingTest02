package com.s1dmlgus.codingTest02.백준.완전탐색.소수찾기;

import java.util.*;

public class Solution {

    static StringBuilder sb = new StringBuilder();

    static int N,M,cnt;
    static int[] selected, used, ints;

    static ArrayList<Integer> ar = new ArrayList<>();


    // 재귀함수
    static void rec_func(int k) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]);
            }
            ar.add(Integer.parseInt(sb.toString()));
            sb.setLength(0);
        } else {
            for (int cand = 0; cand < ints.length; cand++) {

                if(used[cand] == 1) continue;

                selected[k] = ints[cand];
                rec_func(k + 1);

                used[cand] = 1;
                used[cand] = 0;
            }
        }
    }

    public static int solution(String numbers) {

        Map<Integer, Boolean> intMap = setNumbers(numbers);

        for (Integer integer : intMap.keySet()) {
            if(isPrime(integer)){
                cnt++;
            }
        }
        return cnt;
    }

    // 재귀에 들어가는 숫자
    private static Map<Integer, Boolean> setNumbers(String numbers) {
        char[] chars = numbers.toCharArray();
        ints = new int[chars.length];

        for (int i = 0; i< chars.length; i++) {
            int i1 = chars[i] - '0';
            ints[i] = Integer.parseInt(String.valueOf(i1));
        }

        for (int i = 1; i <= ints.length; i++) {

            N = ints.length;            // 총 개수
            M = i;                      // 선택가지 수
            selected = new int[i];      //
            used = new int[N];          // 중복 x

            rec_func(0);
        }

        Map<Integer, Boolean> intMap = new HashMap<>();
        for (Integer integer : ar) {
            intMap.put(integer, false);
        }
        return intMap;
    }


    // 소수 찾는 메소드
    public static boolean isPrime(int num){

        if (num == 0 || num == 1) return false;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        String numbers = "011";
        solution(numbers);
    }
}
