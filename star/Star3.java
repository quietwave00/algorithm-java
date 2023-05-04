package org.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) { //1, 2, 3, 4, 5
            for(int j = N; j >= i; j--) { //5
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
