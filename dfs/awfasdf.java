package org.example.dfs;

import java.io.*;

public class awfasdf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];

        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int index = 0;
        int max = 0;

        for(int value : arr) {
            count++;
            if(value > max) {
                max = value;
                index = count;
            }
        }

        bw.write(max);
        System.out.println(max);
        bw.newLine();
        bw.write(index);
        bw.flush();
        bw.close();
    }

}
