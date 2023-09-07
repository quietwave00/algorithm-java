package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2869_달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        int V = Integer.parseInt(stk.nextToken());

        //낮, 밤 -> A, B값 한 번씩 반복해서 V에 도달하면 됨
        int result = 0;
        int day = 0;
        while(result < V) {
            result += A - B;
            day++;
            System.out.println("result: " + result + ", day: " + day);
        }


    }
}
