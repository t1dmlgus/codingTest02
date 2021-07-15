package com.s1dmlgus.codingTest02.programmers.level01.크레인인형뽑기;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


/**
 * 제목
 * ------------------------------------------------------
 * 크레인 인형뽑기 게임
 *
 *
 * 요구사항
 * ------------------------------------------------------
 *  1. moves 개수 만큼, move에 해당하는 숫자뽑기
 *  2. 스택에 옮기기
 *  3. (스택) 앞, 뒤가 같으면 -> count
 *
 *
 *
 * 입출력 예
 * ------------------------------------------------------
 *
 *  board
 *  [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
 *
 *  moves
 *  [1,5,3,5,1,2,1,4]
 *
 *  result
 *  4
 *
 *
 * 느낀점
 * ------------------------------------------------------
 *
 * 반복문의 break를 정확한 이해를 하게 되고 쓸수 있게 되었다.
 *
 *
 */



public class SolutionTest {


    Solution solution;

    int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
    int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }



    @Test
    public void move에_해당하는_숫자_찾기() throws Exception{
        //given

        //when

        //then
        assertThat(solution.solution(board, moves)).isEqualTo(7);
    }

    
    @Test
    public void 스택에_옮기기() throws Exception{
        //given
        
        //when
        
        
        //then
    }
    

    @Test
    public void 스택_앞뒤가_같으면_제거() throws Exception{
        //given
        
        //when
        
        
        //then
        assertThat(solution.solution(board, moves)).isEqualTo(4);

    }
    

}
