package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P3036_링 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] NArr = new int[N];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            NArr[i] = Integer.parseInt(stk.nextToken());
        }

        for(int i = 1; i < N; i++) {
            int result = GCD(NArr[0], NArr[i]); //최대공약수
            System.out.println(NArr[0] / result + "/" + NArr[i] / result);
        }

        br.close();

    }
    static int GCD(int num, int n) {
        if(n == 0) {
            return num;
        } else {
            return GCD(n, num % n);
        }
    }
}
