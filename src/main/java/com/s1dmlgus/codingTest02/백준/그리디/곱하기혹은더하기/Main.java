package com.s1dmlgus.codingTest02.백준.그리디.곱하기혹은더하기;

import java.util.ArrayList;

public class Main {

    public static int solution(String input) {

        int result = input.charAt(0) - '0';

        for (int i = 1; i < input.length(); i++) {
            int num = input.charAt(i) - '0';

            if (result <= 1 || num <= 1) {
                result += num;
            }else {
                result *= num;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String input = "02984";
        solution(input);

    }
}
