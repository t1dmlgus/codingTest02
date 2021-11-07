package com.s1dmlgus.codingTest02.우테코4기;

import ch.qos.logback.core.pattern.color.ANSIConstants;

import java.util.*;

public class Solution04 {

    public int[] solution(String s) {

        // count
        int count = 1;
        char[] items = s.toCharArray();
        Stack<Character> st = new Stack<>();

        st.push(items[0]);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < items.length; i++) {

            char item = items[i];
            if (st.peek().equals(item)) {
                count++;
            }else {
                arr.add(count);
                st.clear();
                count = 1;
            }
            st.push(item);

        }
        arr.add(count);

        // 마지막 문자가 같을 경우
        if (s.charAt(0) == s.charAt(items.length-1)) {
            int sameCount = arr.get(0) + arr.get(arr.size() - 1);
            arr.remove(0);
            arr.remove(arr.size() - 1);
            arr.add(0, sameCount);
        }


        // arraylist -> array 변환
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }


    public static void main(String[] args) {

        String s = "aaaabbaaa";

        Solution04 solution04 = new Solution04();
        solution04.solution(s);

    }
}
