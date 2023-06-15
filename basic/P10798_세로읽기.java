package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798_세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] charArray = new char[5][];

        // 이차원 배열에 담기
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            charArray[i] = new char[str.length()];
            for (int j = 0; j < str.length(); j++) {
                charArray[i][j] = str.charAt(j);
            }
        }

        // 꺼내서 세로로 읽기
//	 a
//	 ab
//	 abc
//	 abcd
//	 abcde

        // 꺼내서 세로로 읽기
        int maxLength = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i].length > maxLength) {
                maxLength = charArray[i].length;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < charArray[j].length) {
                    result.append(charArray[j][i]);
                }
            }
        }
        br.close();
        System.out.println(result.toString());

    }
}
