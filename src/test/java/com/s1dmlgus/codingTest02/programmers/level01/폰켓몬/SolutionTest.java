package com.s1dmlgus.codingTest02.programmers.level01.폰켓몬;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 제목
 * ------------------------------------------------------
 * 폰켓몬
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


    Solution solution;

    int[] nums = {3,3,3,2,2,2};
    int result = 2;


    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void 폰켓몬_가져갈_개수() throws Exception{
        //given

        //when


        //then
        Assertions.assertThat(solution.solution(nums)).isEqualTo(2);
    }

}