package com.s1dmlgus.codingTest02.programmers.level01.K번째수;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            
            // 자르고
            int[] ints = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            // 정렬
            Arrays.sort(ints);

            // 반환
            answer[i] = ints[commands[i][2]-1];
        }

        return answer;
    }


}