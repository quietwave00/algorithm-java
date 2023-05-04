package org.example.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class P5086_배수와약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numStr = "";

        while(!numStr.equals("0 0")) {
            numStr = br.readLine();
            StringTokenizer stk = new StringTokenizer(numStr);
            int num1 = Integer.parseInt(stk.nextToken());
            int num2 = Integer.parseInt(stk.nextToken());

            if(num1 < num2 && num2 % num1 == 0) {
                bw.write("factor" + "\n");
            } else if(num1 > num2 && num1 % num2 == 0) {
                bw.write("multiple" + "\n");
            } else if(num1 == 0 && num2 == 0) {
                break;
            } else {
                bw.write("neither" + "\n");
            }

        }
        bw.flush();
        br.close();
        bw.close();


    }
}
