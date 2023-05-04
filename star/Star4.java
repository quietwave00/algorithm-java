package org.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.IntUnaryOperator;

public class Star4 {
    public static void main(String[] args) throws IOException {
//            *****
//             ****
//              ***
//               **
//                *
//    0, 5
//    1, 4
//    2, 3
//            ...
//    4, 1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) { //1, 2, 3, 4, 5
            for(int k = N; k >= N - i; k--) { //5
                System.out.print("*");
            }

            for(int j = 0; j <= N - 1; j++) { //0, 1, 2, ..., 4
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
