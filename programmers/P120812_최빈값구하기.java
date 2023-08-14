package org.example.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P120812_최빈값구하기 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 3, 4 };
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        List<int[]> countList = new ArrayList<>(); // [array value, count]
        List<Integer> maxNumber = new ArrayList<>();

        // countList
        for (int n : array) {
            int cnt = 0;
            for (int value : array) {
                if (value == n) {
                    cnt++;
                }
            }
            countList.add(new int[] { n, cnt });
        }

        // 배열 맵으로 만듦(중복 제거)
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int[] countArray : countList) {
            countMap.put(countArray[0], countArray[1]);
        }

        // 가장 큰 count값 구하기
        int maxValue = 0;
        for (int value : countMap.values()) {
            maxValue = Math.max(maxValue, value);
        }

        // countMap돌면서 count값이랑 가장 큰 count값이랑 같으면 key 넣어주기
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxNumber.add(entry.getKey());
            }
        }

        if (maxNumber.size() != 1) {
            return -1;
        } else {
            return maxNumber.get(0);
        }
    }
}
