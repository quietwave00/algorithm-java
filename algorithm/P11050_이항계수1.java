package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11050_이항계수1 {
    public static void main(String[] args) throws IOException {
        //nCk
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken()); //5
        int K = Integer.parseInt(stk.nextToken()); //2

        int num = 1;
        int check = N;
        while(check != K) {
             num *= check--;
        }
        int num2 = 1;
        int check2 = N - K;
        if(check2 == 0) {
            check2 = 1;
        }
        while(check2 != 1) {
            num2 *= check2--;
        }
        System.out.println(num / num2);
        br.close();
    }

}
