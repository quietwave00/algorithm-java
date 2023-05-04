package org.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //N-1개 공백 N-4개
        //N-2개 공백 N-3개
        //...
        //N-N개 공백 N개
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N-i; j++) {
                System.out.print(" ");

            }

            for(int k = 1; k <= i; k++) { //4개에서 시작
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
