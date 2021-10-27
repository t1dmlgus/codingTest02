package com.s1dmlgus.codingTest02.백준.정렬.국영수;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N;
    static Elem[] a;

    static class Elem implements Comparable<Elem> {

        public String name;
        public int kor, eng, mat;

        @Override
        public int compareTo(Elem other) {

            // 국어 - 내림차순
            if(kor != other.kor) return other.kor - kor;
            // 영어 - 올림차순
            if(eng != other.eng) return eng - other.eng;
            // 수학 - 내림차순
            if(mat != other.mat) return other.mat - mat;

            return name.compareTo(other.name);

        }

        public Elem(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }
    }


    public static void main(String[] args) {

        input();
        pro();

    }

    private static void pro() {

        Arrays.sort(a);
        for (Elem elem : a) {
            System.out.println("elem = " + elem.name);
        }

    }

    private static void input() {
        //N = scan.nextInt();
        N = 12;
        a = new Elem[N];

        a[0] = new Elem("Junkyu", 50, 60, 100);
        a[1] = new Elem("Sangkeun", 80, 60, 50);
        a[2] = new Elem("Sunyoung", 80, 70, 100);
        a[3] = new Elem("Soong",  50, 60, 90);
        a[4] = new Elem("Haebin", 50, 60, 100);
        a[5] = new Elem("Kangsoo", 60, 80,100);
        a[6] = new Elem("Donghyuk", 80, 60, 100);
        a[7] = new Elem("Sei", 70, 70, 70);
        a[8] = new Elem("Wonseob", 70, 70, 90);
        a[9] = new Elem("Sanghyun", 70, 70, 80);
        a[10] = new Elem("nsj", 80, 80, 80);
        a[11] = new Elem("Taewhan", 50, 60, 90);




//        for (int i = 0; i < N; i++) {
//            a[i] = new Elem();
//            a[i].name = scan.next();
//            a[i].kor = scan.nextInt();
//            a[i].eng = scan.nextInt();
//            a[i].mat = scan.nextInt();
//        }
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
