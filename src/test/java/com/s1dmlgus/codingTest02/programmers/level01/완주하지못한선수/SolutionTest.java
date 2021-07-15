package com.s1dmlgus.codingTest02.programmers.level01.완주하지못한선수;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 제목
 * ------------------------------------------------------
 * 완주하지 못한 선수
 *
 *
 * 요구사항
 * ------------------------------------------------------
 *  1. 스택에 각 문자열 넣기
 *  2. 비교하기
 *
 *
 *
 *
 * 입출력 예
 * ------------------------------------------------------
 *
 * participant	                                        completion	                                return
 * ["leo", "kiki", "eden"]	                            ["eden", "kiki"]	                        "leo"
 * ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
 * ["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	                "mislav"
 *
 *
 * 느낀점
 * ------------------------------------------------------
 *
 *
 */

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();

    }

    @Test
    public void 비교하기() throws Exception{
        //given

        // "leo"

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        //when


        //then

        assertThat(solution.solution(participant, completion)).isEqualTo("mislav");


    }


}