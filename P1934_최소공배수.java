package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class P1934_최소공배수 {
    public static void main(String[] args) throws IOException {
        //유클리드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;
        int temp = 0;
        for(int i = 0; i < T; i++) { //1수~1000
            StringTokenizer stk = new StringTokenizer(br.readLine());
            A = Integer.parseInt(stk.nextToken()); //1
            B = Integer.parseInt(stk.nextToken()); //45000
            if(A < B) { //큰값이 A에 오게
                temp = A;
                A = B;
                B = temp;
            }
            int result = GCD(A, B);
            bw.write(A * B / result + " \n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    static int GCD(int num, int n) {
        if(n == 0) { //나머지가 0이 되는 조건
            return num;
        } else {
            return GCD(n, num % n);
        }

    }
}
