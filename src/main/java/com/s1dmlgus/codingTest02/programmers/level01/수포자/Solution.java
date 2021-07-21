package com.s1dmlgus.codingTest02.programmers.level01.수포자;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int[] answers) {
        int[] answer = {};

        final int[] p1 = {1,2,3,4,5};
        final int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        final int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();


        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);


        for (int i = 0; i < answers.length; i++) {
            if (answers[i%5] == p1[i]) {
                map.put(1, map.get(1) + 1);
            }
            if (answers[i%8] == p2[i]) {
                map.put(2, map.get(2) + 1);
            }
            if (answers[i%10] == p3[i]) {
                map.put(3, map.get(3) + 1);
            }
        }

        Integer max = Collections.max(map.values());


        for (Map.Entry<Integer, Integer> fmap : map.entrySet()) {
            if (fmap.getValue().equals(max)) {
                System.out.println("fmap = " + fmap);
                list.add(fmap.getKey());
            }
        }
        answer = list.stream().sorted().mapToInt(s -> s).toArray();


        return answer;
    }
}
