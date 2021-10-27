package com.s1dmlgus.codingTest02.백준.정렬.H_Index;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {

            if (citations[i] >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }

        System.out.println("answer = " + answer);

        return answer;
    }


    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};

        Solution solution = new Solution();
        solution.solution(citations);

    }
}
