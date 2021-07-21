package com.s1dmlgus.codingTest02.programmers.level01.수포자;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score2 = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i]) {
                score2[0]++;
            }
            if (answers[i] == p2[i]) {
                score2[1]++;
            }
            if (answers[i] == p3[i]) {
                score2[2]++;
            }
        }

        int maxInt = Arrays.stream(score2).max().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < score2.length; i++) {
            if (score2[i] == maxInt) {
                list.add(i + 1);
            }
        }
        answer = list.stream().sorted().mapToInt(s -> s).toArray();

        return answer;
    }

    public static void main(String[] args) {

        //int[] answer = {1,3,2,4,2};
        int[] answer = {1,2,3,4,5};

        Solution2 solution2 = new Solution2();
        solution2.solution(answer);

    }
}
