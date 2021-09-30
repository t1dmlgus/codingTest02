package com.s1dmlgus.codingTest02.programmers.level01.완주하지못한선수;

import java.util.*;

/**
 *  정리
 *
 *  - hashMap<참가자, 카운트> 이용
 *  - getOrDefault 메서드를 사용하여 각 key(참가자)에 대한 value를 카운트함
 *
 *  - 25번째 줄, containsKey 필요없이 그냥 key에 put해도 된다.(효율성)
 *
 */


public class Solution {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> findParticipant = new HashMap<>();

        for (String s : participant) {
            findParticipant.put(s, findParticipant.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            if (findParticipant.containsKey(s)) {
                findParticipant.replace(s, findParticipant.get(s) - 1);
            }
        }

        for (String key : findParticipant.keySet()) {
            if (findParticipant.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Solution solution = new Solution();
        solution.solution(participant, completion);
    }

}
