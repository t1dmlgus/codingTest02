package com.s1dmlgus.codingTest02.백준.정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {

    public String solution(int[] numbers) {

        StringBuilder sb = new StringBuilder();

        String[] str = new String[numbers.length];

        for (int i = 0; i < str.length; i++) {

            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if (str[0].equals("0")) {
            return "0";
        }

        for (String s : str) {
            sb.append(s);
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        int[] numbers = {3, 30, 34, 5, 9};

        Solution2 solution2 = new Solution2();
        solution2.solution(numbers);
    }
}

