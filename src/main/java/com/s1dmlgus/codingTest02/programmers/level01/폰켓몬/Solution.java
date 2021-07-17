package com.s1dmlgus.codingTest02.programmers.level01.폰켓몬;

import java.util.HashSet;

public class Solution {

    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();

        int result = nums.length / 2;
        for (int num : nums) {
            set.add(num);
        }

        return Math.min(set.size(), result);
    }
}

