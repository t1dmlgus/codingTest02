package com.s1dmlgus.codingTest02.naver.sol1;

import java.sql.Array;
import java.util.*;

public class Solution {

    public int solution(String[] id_list, int k) {
        int answer = 0;

        // 하루에 들렸는지..

        // 하루 map
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashSet<String> set = new HashSet<>();


        for (int i = 0; i < id_list.length; i++) {
            map.put(i, id_list[i]);
        }


        // 구현이 안되면
        // 더 세분화 하지 않아서...




        for (int i = 0; i < id_list.length; i++) {
            String[] s = map.get(i).split(" ");
            // JAY ELLE JAY MAY
            set.addAll(Arrays.asList(s));
            for (String s1 : set) {
                map2.put(s1, map2.getOrDefault(s1, 0) + 1);

                if (map2.get(s1) > k) {
                    map2.put(s1, k);
                }
            }

        }

        for (Integer value : map2.values()) {
            answer += value;
        }


        for (Map.Entry<String, Integer> stringIntegerEntry : map2.entrySet()) {
            System.out.println("stringIntegerEntry = " + stringIntegerEntry);
        }




//        for (String s : id_list) {
//            for (String s2 : s.split(" ")) {
//
//                map.put(s2, map.getOrDefault(s2, 0) + 1);
//                if (map.get(s2) > k) {
//                    map.put(s2, k);
//                }
//            }
//        }





        return answer;
    }

    public static void main(String[] args) {


        String[] id_list = {"JAY",                  // JAY
                            "JAY ELLE JAY MAY",     // JAY ELLE MAY
                            "MAY ELLE MAY",         // MAY ELLE
                            "ELLE MAY",             // ELLE MAY
                            "ELLE ELLE ELLE",       // ELLE
                            "MAY"                   // MAY
                            };
        int k = 3;


//        String[] id_list = {"A B C D", "A D", "A B D", "B D"};
//        int k = 2;


        Solution solution = new Solution();
        solution.solution(id_list, k);


    }
}



