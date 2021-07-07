package com.s1dmlgus.codingTest02.programmers.level01.K번째수;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


/**
 * 제목
 * -----------------------------------------------------------------------
 * K번째수
 *
 *
 * 요구사항
 *-----------------------------------------------------------------------
 * 1. 자른다.
 * 2. 정렬
 * 3. 반환
 *
 *
 * 입출력
 * -----------------------------------------------------------------------
 * array	                commands	                        return
 * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 *
 *
 * 느낀점
 * -----------------------------------------------------------------------
 *
 *  1. 배열의 index를 잘 파악하는 게 중요하다.
 *  2. 테스트 코드를 작성하는 게 더 어렵게 느껴졌다.
 *     반복문을 사용하여 하나의 반복문에 자르고, 정렬, 반환 하는 편이 더 깔끔했다.
 *
 *
 */

class SolutionTest {

    private Solution solution;
    private int[] solution1;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution1 = solution.solution(array, commands);

    }

    @Test
    public void 배열_자른다() throws Exception{

        //then

        int[] array01 = {5,2,6,3};
        assertThat(solution1).isEqualTo(array01);

    }

    @Test
    public void 배열정렬() throws Exception{

        //then

        int[] sort01 = {2, 3, 5, 6};
        assertThat(solution1).isEqualTo(sort01);
    }


}