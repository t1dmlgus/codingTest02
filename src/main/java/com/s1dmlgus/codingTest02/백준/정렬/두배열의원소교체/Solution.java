package com.s1dmlgus.codingTest02.백준.정렬.두배열의원소교체;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static int length;
    public static int cnt;

    public int solution(int n, int m, Integer[] a, Integer[] b) {

        int answer = 0;
        length = 5;
        cnt = m;

        // 1, 2, 3, 4, 5
        // 5, 5, 5, 6, 6



        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < cnt; i++) {

            if (a[i] < b[i]) {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }

        for (Integer integer : a) {
            answer += integer;
        }


        return answer;
    }


    public static void main(String[] args) {

        int n = 5;
        int m = 3;

        Integer[] a = {1, 2, 5, 4, 3};
        Integer[] b = {5, 5, 6, 6, 5};

        Solution solution = new Solution();
        solution.solution(n, m, a, b);

    }
}
