package org.example.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5585_거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 1000 - Integer.parseInt(br.readLine());
        int result = 0;
        int[] arr = {500, 100, 50, 10, 5, 1};

        for(int i : arr) {
            if(N >= i) {
                result += N / i;
                N %= i;
            }
        }

        System.out.println(result);
        br.close();
    }
}
