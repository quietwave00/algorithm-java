package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978_소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        int count = 0;
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++) {
            num = Integer.parseInt(stk.nextToken());
            for(int j = 2; j <= num; j++) {
                if(j == num) {
                    count++;
                }
                if(num % j == 0) {
                    break;
                }
            }

        }

        System.out.println(count);
        br.close();
    }
}
