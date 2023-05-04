package org.example.algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3009_네번째점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[3][2];
        int n1 = 0;
        int n2 = 0;
        for(int i = 0 ; i < 3 ; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());

            arr[i][0] = x;
            arr[i][1] = y;
        }

        for(int i = 0 ; i < 3 ; i ++){
            int cntX = 0;
            int cntY = 0;
            for(int j = 0 ; j < 3 ; j ++){

                if(arr[i][0] == arr[j][0]){
                    cntX ++;
                }

                if(arr[i][1] == arr[j][1]){
                    cntY ++;
                }


            }
            if(cntX == 1){
                n1 = arr[i][0];
            }

            if(cntY == 1){
                n2 = arr[i][1];

            }
        }
        System.out.printf("%d %d", n1,n2);

        br.close();
//        int[][] num = new int[3][2];
//        for(int i = 0; i < 3; i++) {
//            StringTokenizer stk = new StringTokenizer(br.readLine());
//            num[i][0] = Integer.parseInt(stk.nextToken());
//            num[i][1] = Integer.parseInt(stk.nextToken());
//        }
//
//        int x = num[0][0] + Math.abs(num[2][0] - num[1][0]);
//        int y = num[2][1] + Math.abs(num[0][1] - num[1][1]);
//
//        System.out.println(x + " " + y);


    }
}

