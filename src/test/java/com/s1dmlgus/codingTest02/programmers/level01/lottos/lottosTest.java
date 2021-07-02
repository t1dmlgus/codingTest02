package com.s1dmlgus.codingTest02.programmers.level01.lottos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 로또의 최고 순위와 최저 순위
 *
 * 순위	당첨 내용
 * 1	6개 번호가 모두 일치
 * 2	5개 번호가 일치
 * 3	4개 번호가 일치
 * 4	3개 번호가 일치
 * 5	2개 번호가 일치
 * 6(낙첨)	그 외
 *
 *
 * 요구사항
 * 1. 최소 일치번호찾기
 * 2. 최대 일치번호찾기
 * 3. 순위 반환
 *
 * lottos    : [44, 1, 0, 0, 31, 25]
 * win_nums  : [31, 10, 45, 1, 6, 19]
 * result    : [3, 5]
 *
 * lottos    : [0, 0, 0, 0, 0, 0]
 * win_nums  : [38, 19, 20, 40, 15, 25]
 * result    : [1, 6]
 *
 * lottos    : [45, 4, 35, 20, 3, 9]
 * win_nums  : [20, 9, 3, 45, 4, 35]
 * result    : [1, 1]
 *
 *
 *
 */

class lottosTest {

    private lottos lotto;

    @BeforeEach
    void setUp() {
        lotto = new lottos();
    }

    @Test
    public void 로또_최소갯수() throws Exception{
        //given
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        //when

        //then
        int[] a = {1, 1};
        assertThat(lotto.solution(lottos, win_nums)).isEqualTo(a);

    }
    @Test
    public void 로또_최대갯수() throws Exception{
        //given
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        //when

        //then
        int[] a = {1, 1};
        assertThat(lotto.solution(lottos, win_nums)).isEqualTo(a);

    }

    @Test
    public void 순위반환() throws Exception{
        //given
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        //when

        //then
        int[] a = {1, 1};
        assertThat(lotto.solution(lottos, win_nums)).isEqualTo(a);

    }
}