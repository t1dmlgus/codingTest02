package com.s1dmlgus.codingTest02.programmers.level01.완주하지못한선수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solution {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};

        Stack<String> st = new Stack<>();

        ArrayList<String> al = new ArrayList<>(Arrays.asList(participant));

        for (String s1 : completion) {
            if (al.contains(s1)) {
                al.remove(s1);
            }
        }
        answer = al.get(0);


        return answer;
    }

}
