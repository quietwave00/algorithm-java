package org.example.programmers;

import java.util.Arrays;

public class P17681_비밀지도 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println();
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        char[][] binaryArr1 = new char[n][n];
        char[][] binaryArr2 = new char[n][n];
        String[] resultArr = new String[n];

        /*
         * 입력
         */
        for(int i = 0; i < n; i++) {
            String binaryNum1 = Integer.toBinaryString(arr1[i]);
            String binaryNum2 = Integer.toBinaryString(arr2[i]);
            while (binaryNum1.length() < n) {
                binaryNum1 = "0" + binaryNum1;
            }
            while (binaryNum2.length() < n) {
                binaryNum2 = "0" + binaryNum2;
            }
            for(int j = 0; j < n; j++) {
                binaryArr1[i][j] = binaryNum1.charAt(j);
                binaryArr2[i][j] = binaryNum2.charAt(j);

            }
        }

        //더하기로...
        /*
         * 연산
         */
        for(int i = 0; i < n; i++) {
            StringBuilder resultCol = new StringBuilder();
            for(int j = 0; j < n; j++) {
                if(binaryArr1[i][j] == '0' && binaryArr2[i][j] == '0') { //둘다 공백이면
                    resultCol.append(" ");
                } else if(binaryArr1[i][j] == '1' && binaryArr2[i][j] == '1') { //둘다 벽이면
                    resultCol.append("#");
                } else if(binaryArr1[i][j] == '1' || binaryArr2[i][j] == '1') { //하나만 벽이면
                    resultCol.append("#");
                } else if(binaryArr1[i][j] == '0' || binaryArr2[i][j] == '0') { //하나만 공백이면
                    resultCol.append("#");
                }
            }
            resultArr[i] = resultCol.toString();
        }
        return resultArr;
    }
}
