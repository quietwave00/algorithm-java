package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class checkP2981_검문 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> resultList = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        int[] NArr = new int[N];
        for(int i = 0 ; i < N; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            NArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(NArr);
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < NArr[0]; j++) { //- 연산
                for(int k = 1; k <= NArr[N - 1]; k++) { //% 연산
                    if((NArr[i] - j) % k == 0) {
                        resultList.add(k);
                    }
                }
            }
        }

        //출력
        for(int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }
        br.close();
    }
}
