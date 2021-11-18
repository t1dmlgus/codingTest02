package com.s1dmlgus.codingTest02.programmers.devTest02.로또의최고순위와최저순위;

import java.util.Arrays;

public class Sol {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int min = 0;
        int max = 0;
        
        for (int i = 0; i< lottos.length; i++) {

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    lottos[i] = 0;
                    min++;
                }
            }
        }

        for (int lotto : lottos) {
            if (lotto == 0) {
                max++;
            }
        }
        answer[0] = max;
        answer[1] = min;

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

        for (int k = 0; k < answer.length; k++) {
            if (answer[k] == 2) {
                answer[k] = 5;
            } else if (answer[k] == 3) {
                answer[k] = 4;
            } else if (answer[k] == 4) {
                answer[k] = 3;
            } else if (answer[k] == 5) {
                answer[k] = 2;
            } else if (answer[k] == 6) {
                answer[k] = 1;
            }else {
                answer[k] = 6;
            }
        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {

        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        Sol sol = new Sol();
        sol.solution(lottos, win_nums);
    }
}
