package org.example.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P68644_두개뽑아서더하기 {
    static List<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) {
//        int[] numbers = {5, 0, 2, 7};
        int[] numbers = {1, 2, 6, 10, 13, 20};
        System.out.println(Arrays.toString(solution(numbers)));
    }

    static int[] solution(int[] numbers) {
        boolean[] visited = new boolean[numbers.length];
        combination(numbers, visited, numbers.length, 2, 0);
        Set<Integer> distinctSet = new HashSet<>(resultList);
        int[] sortArray = distinctSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(sortArray);
        return sortArray;
    }

    //nCr
    static void combination(int[] arr, boolean[] visited, int n, int r, int start) {
        if(r == 0) { //탐색 끝
            int sum = 0;
            for(int i = 0; i < n; i++) {
                if(visited[i]) {
                    sum += arr[i];
                }
            }
            resultList.add(sum);
            return;
        }
        for(int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited,  n, r -1, i + 1);
            visited[i] = false;
        }
    }
}

