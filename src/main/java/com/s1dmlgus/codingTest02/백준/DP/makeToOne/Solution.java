package com.s1dmlgus.codingTest02.백준.DP.makeToOne;

public class Solution {

    public static int[] d = new int[30001];             // 카운트 갯수

    public int solution(int n){
        int answer = 0;

        for (int i = 2; i <= 26; i++) {

            // 현재 수에서 1을 빼는 경우
            d[i] = d[i - 1] + 1;

            // 현재 수가 2로 나누어 떨어지는 경우
            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);        // 여기서 +1 은 카운트 갯수: 1
            }

            // 현재 수가 3로 나누어 떨어지는 경우
            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }

            // 현재 수가 5로 나누어 떨어지는 경우
            if (i % 5 == 0) {
                d[i] = Math.min(d[i], d[i / 5] + 1);
            }

        }
        System.out.println(d[26]);


        return answer;
    }



    public static void main(String[] args) {
        int n = 26;

        Solution solution = new Solution();
        solution.solution(26);
    }
}
