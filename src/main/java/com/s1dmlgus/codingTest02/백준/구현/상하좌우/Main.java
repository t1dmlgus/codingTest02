package com.s1dmlgus.codingTest02.백준.구현.상하좌우;

public class Main {

    public static void solution(int N, char[] move) {

        int x = 1;
        int y = 1;

        // U,R,D,L
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        char[] move_type = {'U', 'R', 'D', 'L'};

        for (char s : move) {
            for (int i = 0; i < move_type.length; i++) {
                if (s == move_type[i]) {

                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx < 1 || ny < 1 || nx > N || ny > N) {
                        break;
                    }

                    x = nx;
                    y = ny;
                    break;
                }

            }
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }


    public static void main(String[] args) {

        int N = 5;
        char[] move = {'R','R','R','U','D','D'};

        solution(N, move);

    }
}
