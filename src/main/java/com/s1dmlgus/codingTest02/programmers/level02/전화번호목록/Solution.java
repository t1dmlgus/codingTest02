package com.s1dmlgus.codingTest02.programmers.level02.전화번호목록;

import java.util.HashMap;


/**
 * 1. 문제 내용
 *    접두사를 다른 매개변수에 substring 해서 생각했음
 *
 *    -> 반대로 다른 매개변수를 0부터 substring해서 hashmap에 있는지 확인
 *
 * 2. 자료구조(hashmap)
 *
 * 3. 자료구조를 쓴 이유가 있다. -> 활용할 수 있는 메소드 찾기
 *
 * 4. 반복문(for, while)
 *
 *
 *
 */


class Solution {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i< phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {

                String substring = phone_book[i].substring(0, j);
                if (map.containsKey(substring)) {
                    return false;
                }
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        Solution solution = new Solution();
        solution.solution(phone_book);

    }
}


/**
 *  Array -> startsWith() 메소드 활용
 *
 *  (효율성 검사 3, 4 실패 -> 이중 for문 때문?)
 *
 *
        for (int i = 0; i < phone_book.length; i++) {
        for (int j = i+1; j < phone_book.length; j++) {

        if(phone_book[j].startsWith(phone_book[i])){
        answer = false;
        return answer;
        }

        }

        }

*/



