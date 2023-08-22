package org.example.programmers;

import java.util.Arrays;

public class P86491 {
    public static void main(String[] args) {
        int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
//   int[][] sizes = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };
        System.out.println(solution(sizes));
    }

    static int solution(int[][] sizes) {
        int longestW = 0;
        int longestH = 0;

        for (int[] size : sizes) {
            Arrays.sort(size);
        }

        for (int[] size : sizes) {
            if (longestH < size[0]) {
                longestH = size[0];
            }

            if (longestW < size[1]) {
                longestW = size[1];
            }
        }
        return longestW * longestH;
    }

}
