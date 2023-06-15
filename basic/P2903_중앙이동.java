package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//점의 개수:         4개(2) -> 9개(3) -> 25개(5)-> (9)-> 1089개(17)
//1, 2, 4, 8, 16
public class P2903_중앙이동{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 2;
        for (int i = 0; i < N; i++) {
            num += (int) (Math.pow(2, i));
        }
        br.close();
        System.out.println((int) (Math.pow(num, 2)));

    }

}
