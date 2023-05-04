package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010_다리놓기 {
    static int[] NArr;
    static int[] MArr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            NArr = new int[Integer.parseInt(stk.nextToken())];
            MArr = new int[Integer.parseInt(stk.nextToken())];


        }


    }
}
