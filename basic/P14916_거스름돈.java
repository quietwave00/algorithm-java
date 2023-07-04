package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14916_거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 5x + 2y
        int x = N / 5;
        int y = 0;

        // 5의 배수에서 뺀 값이 나누어 떨어지지 않으면 x값을 하나 줄여서
        if ((N - (x * 5)) % 2 != 0) {
            x -= 1;
        }
        y = (N - (x * 5)) / 2;

        if (x * 5 + 2 * y == N && x >= 0) {
            System.out.println(x + y);
        } else {
            System.out.println(-1);
        }
    }
}
