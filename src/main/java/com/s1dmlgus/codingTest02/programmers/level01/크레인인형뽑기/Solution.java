package com.s1dmlgus.codingTest02.programmers.level01.크레인인형뽑기;

import java.util.Stack;

public class Solution {

//    int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
//    int[][] board = {{0, 0, 0, 0, 0},
//                     {0, 0, 1, 0, 3},
//                     {0, 2, 5, 0, 1},
//                     {4, 2, 4, 4, 2},
//                     {3, 5, 1, 3, 1}};


    public int solution(int[][] board, int[] moves) {

        int answer = findStack(board, moves);

        return answer;
    }

    private int findStack(int[][] board, int[] moves) {

        Stack<Integer> st = new Stack<>();
        st.push(0);
        int count = 0;

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {

                    count = countStack(st, board[i][move - 1], count);
                    board[i][move - 1] = 0;
                    break;
                }

            }
        }

        return count;
    }

    private int countStack(Stack<Integer> st, int i, int count ) {

        if (st.peek() == i) {
            st.pop();
            return count += 2;
        }
        st.push(i);

        return count;
    }

    
    public static void main(String[] args) {

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};

        Solution solution = new Solution();
        solution.solution(board, moves);

    }

}
