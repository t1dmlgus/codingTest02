package com.s1dmlgus.codingTest02.백준.그리디.모험가길드;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static int solution(int N, Integer[] People){

        // 그룹의 최댓값
        int cnt = 0;
        // 현재 그룹 인원
        int now = 0;


        List<Integer> list = Arrays.asList(People);
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {

            now++;
            if (list.get(i) <= now) {
                cnt++;
                now = 0;
            }
        }

        // 2
        return cnt;
    }

    public static void main(String[] args) {


        int N = 5;
        Integer[] People = new Integer[]{2, 3, 1, 2, 2};

        solution(N, People);



    }
}
