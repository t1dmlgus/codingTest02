package com.s1dmlgus.codingTest02.programmers.devTest02.행렬테두리회전하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sol {

//    public static int[] Q;
//    public static Set<Integer> SET = new HashSet<>();
//    public static int temp;
    public static int[][] AR;

    public Integer[] solution(int rows, int columns, int[][] queries) {

        ArrayList<Integer> ar = new ArrayList<>();

        // 행렬
        AR = new int[rows + 1][columns + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                AR[i][j] = (rows * (i - 1)) + j;
            }
        }
                                            //  x y ,x y
        for (int[] q : queries) {           // [[2,2,5,4],[3,3,6,6],[5,1,6,3]]

            int before = 0;
            int next = AR[q[0]+1][q[1]];    // 초기값
            int min = next;  // 초기값

            // 왼 -> 오
            for (int j = q[1]; j <= q[3]; j++) {    // 2, 2,

                before = AR[q[0]][j];
                AR[q[0]][j] = next;
                next = before; // 9 = 8
                min = Math.min(min, before);
            }
            // 오 위 -> 아래
            for (int j = q[0]+1; j <= q[2]; j++) {    // 2, 3

                before = AR[j][q[3]];
                AR[j][q[3]] = next;
                next = before;
                min = Math.min(min, before);
            }
            // 오 -> 왼
            for (int j = q[3]-1; j >= q[1]; j--) {    // 2, 3

                before = AR[q[2]][j];
                AR[q[2]][j] = next;
                next = before;
                min = Math.min(min, before);
            }
            // 왼 아래 -> 위
            for (int j = q[2]-1; j >= q[0]; j--) {    // 2, 3

                before = AR[j][q[1]];
                AR[j][q[1]] = next;
                next = before;
                min = Math.min(min, before);
            }

            System.out.println("min = " + min);
            ar.add(min);
        }

        Integer[] answer = ar.toArray(new Integer[0]);
        System.out.println("answer = " + Arrays.toString(answer));


        return answer;
    }



    public static void main(String[] args) {

        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};

        Sol sol = new Sol();
        sol.solution(rows, columns, queries);


    }

}


//        for (int i = q[1]; i <= q[3] ; i++) {
//            for (int j = q[0]; j <= q[2]; j++) {
//                set.add(ar[i][j]);
//            }
//        }


//        for (int[] q : queries) {
//
//                min = ar[q[0]][q[1]];
//
//                for (int i = 0; i < q.length; i++) {
//        if (i % 2 == 0) {
//        for (int j = q[1]; j <= q[3]; j++) {
//
//        set.add(ar[q[i]][j]);
//        min = Math.min(min, ar[q[i]][j]);
//        }
//        }else {
//        for (int j = q[0]; j <= q[2]; j++) {
//        set.add(ar[j][q[i]]);
//        min = Math.min(min, ar[j][q[i]]);
//        }
//        }
//        }
//
//        System.out.println("min = " + min);
//        set.clear();
//        }


//    private void dfs(int x, int y, int temp) {   // 2, 4, 9
//
//
//        if (x >= Q[0] || y >= Q[1] || x <= Q[2] || y <= Q[3]) {
//
//            int temp2 = AR[Q[x]][Q[y]];
//
//            AR[Q[x]][Q[y]] = temp;
//
//            SET.add(temp);
//
//            dfs(Q[x], Q[y+1], temp2);
//
//            if (x == Q[0] && y == Q[3]) {
//                dfs(Q[x+1], Q[y], temp2);
//            }
//            if (x == Q[2] && y == Q[3]) {
//                dfs(Q[x], Q[y-1], temp2);
//            }
//            if (x == Q[2] && y == Q[1]) {
//                dfs(Q[x], Q[y-1], temp2);
//            }
//
//        }
//
//
//    }
