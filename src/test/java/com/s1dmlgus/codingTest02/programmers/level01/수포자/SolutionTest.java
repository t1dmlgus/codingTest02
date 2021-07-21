package com.s1dmlgus.codingTest02.programmers.level01.수포자;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * 제목
 * ------------------------------------------------------
 * 수포자
 *
 *
 * 요구사항
 * ------------------------------------------------------
 *  1. 폰켓몬 가져갈 갯수
 *  2. 폰켓몬 중복제거 -> set
 *  3. nums > result ? result : nums
 *
 *
 *
 * 입출력 예
 * ------------------------------------------------------
 *
 * nums	            result
 * [3,1,2,3]	    2
 * [3,3,3,2,2,4]	3
 * [3,3,3,2,2,2]	2
 *
 *
 * 느낀점
 * ------------------------------------------------------
 *
 *
 *
 *
 */


class SolutionTest {


    @BeforeEach
    void setUp() {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    }

    int[] answer = {1,2,3,4,5};

    @DisplayName("answer와 비교")
    @Test
    public void testCompareAnswer() throws Exception{
        //given

        Solution solution = new Solution();

        //when


        //then
        Assertions.assertThat(solution.solution(answer)).isEqualTo(new int[]{1});

    }



}