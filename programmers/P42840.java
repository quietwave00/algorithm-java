package org.example.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42840 {
    public static void main(String[] args) {
        int[] answers = { 1, 3, 2, 4, 2 };

        System.out.println(Arrays.toString(solution(answers)));
    }

    static int[] solution(int[] answers) {
        int[] countArr = new int[3];
        int[] case1 = { 1, 2, 3, 4, 5 };
        int[] case2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] case3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        for (int i = 0; i < answers.length; i++) {
            if (case1[i % case1.length] == answers[i]) {
                countArr[0]++;
            }

            if (case2[i % case2.length] == answers[i]) {
                countArr[1]++;
            }

            if (case3[i % case3.length] == answers[i]) {
                countArr[2]++;
            }
        }

        // 가장 높은 점수 확인
        int highScore = 0;
        for (int count : countArr) {
            if (highScore < count) {
                highScore = count;
            }
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < countArr.length; i++) {
            if (highScore == countArr[i]) {
                resultList.add(i + 1);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

}
