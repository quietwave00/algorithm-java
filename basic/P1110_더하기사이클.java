package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1110_더하기사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int temp = N;
        int count = 0;


            do {
                int a = N / 10;
                int b = N % 10;
                N = (b * 10) + ((a + b) % 10);
//                System.out.println("N: " + N);
                count++;
            } while(temp != N);
            System.out.println(count);

            br.close();
            }

}
