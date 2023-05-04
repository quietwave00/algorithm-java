package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018_체스판다시칠하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int[][] board = new int[N][M];
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] BW = str.split("");
            for(int j = 0; j < M; j++) {
                if(BW[j].equals("B")) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 2;
                }
            }
        }

        int size = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                size += board[i][j];
            }
        }

    }
}
