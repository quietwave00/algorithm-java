package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        br.close();
        int[] numArr = new int[4];
        for(int i = 0; i < 4; i++) {
            numArr[i] = Integer.parseInt(stk.nextToken());
        }


    }
}