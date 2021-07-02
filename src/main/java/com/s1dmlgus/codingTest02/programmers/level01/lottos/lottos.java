package com.s1dmlgus.codingTest02.programmers.level01.lottos;

import java.util.Arrays;

public class lottos {

    public int[] solution(int[] lottos, int[] win_nums) {

        int[] answer = {rank(lottos, lotto_max(lottos, win_nums)), rank(lottos, lotto_min(lottos, win_nums))};

        return answer;
    }

    // 순위 반환
    private int rank(int[] lottos, int lottoCount) {

        if (lottoCount == 0) {
            return 6;
        }
        return (lottos.length + 1) - lottoCount;

    }
    
    // 로또 최대갯수
    private int lotto_max(int[] lottos, int[] win_nums) {
        int min = lotto_min(lottos, win_nums);
        int count = (int) Arrays.stream(lottos).filter(i -> i == 0).count();

        return min + count;
    }

    // 로또 최소갯수
    private int lotto_min(int[] lottos, int[] win_nums) {
        return (int) Arrays.stream(lottos).filter(e -> Arrays.stream(win_nums).anyMatch(t -> t == e)).count();

    }
}
