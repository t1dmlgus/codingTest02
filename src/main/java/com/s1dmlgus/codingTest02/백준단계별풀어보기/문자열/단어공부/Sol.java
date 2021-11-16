package com.s1dmlgus.codingTest02.백준단계별풀어보기.문자열.단어공부;

public class Sol {

    //System.out.println("Arrays.toString(ar) = " + Arrays.toString(ar));
    public static void solution(String s) {

        int[] ar = new int[26];

        int cnt = 0;
        int max = -1;
        char ans = 65;

        char[] cs = s.toLowerCase().toCharArray();
        for (int i = 0; i < cs.length; i++) {
            int i1 = cs[i]-'a';
            ar[i1] += 1;
        }

        for (int i = 0; i < ar.length; i++) {

            if (max < ar[i]) {
                max = ar[i];
                ans = (char) (i + 65);
            } else if (max == ar[i]) {
                ans = '?';
            }
        }

        System.out.println("ans = " + ans);

    }

    public static void main(String[] args) {
        String s = "baaa";
        solution(s);
    }
}
