package com.s1dmlgus.codingTest02.백준.그리디.거스름돈;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int solution(int n){

        /**
         * 1. moneyType
         * 2. 나눌 수
         *
         *
         */

        int change = 1000-n;


        ArrayList<Integer> moneyType = new ArrayList<>(Arrays.asList(500,100,50,10,5,1));
        int cnt = 0;

        for (Integer integer : moneyType) {

            while (change> integer){

                int i = change / integer;
                change %= integer;
                cnt+=i;
            }
        }
        System.out.println("cnt = " + cnt);
        return cnt;
    }


    public static void main(String[] args) {

        int input = 1;

        Solution solution = new Solution();
        solution.solution(input);

    }
}
