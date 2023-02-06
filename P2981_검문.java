package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2981_검문 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] NArr = new int[N];
        for(int i = 0 ; i < N; i++) {
            NArr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N; i++) {
            search(NArr);
        }
    }

    static void search(int[] arr) {

    }
}
