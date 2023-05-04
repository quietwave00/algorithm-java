package org.example.algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = new int[3];
        String numStr = "";
        while(true) {
            numStr = br.readLine();
            StringTokenizer stk = new StringTokenizer(numStr);
            for(int i = 0; i < 3; i++) {
                num[i] = Integer.parseInt(stk.nextToken());
            }
            Arrays.sort(num);
            if(numStr.equals("0 0 0")) {
                break;
            }
            if(num[2] * num[2] == num[0] * num[0] + num[1] * num[1]) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();






    }
}
