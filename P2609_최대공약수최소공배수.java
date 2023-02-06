package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class P2609_최대공약수최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        br.close();

        List<Integer> NList = new ArrayList<>();
        List<Integer> MList = new ArrayList<>();


        for(int i = 1; i <= N / 2; i++) {
            if(N % i == 0) { //24, 1 / 24, 2 / 24, 3 / ... / 24, 12
                NList.add(i);
            }
        }

        for(int i = 1 ; i <= M / 2; i++) {
            if(M % i == 0) {
                MList.add(i); //
            }
        }
        NList.add(N); //약수 리스트에 자기 자신 추가
        MList.add(M);

//        System.out.println(NList.get(N - 1) + ", " + MList.get(M - 1));
        int max = 0;
        for(int i = 0; i < NList.size(); i++) {
            for(int j = 0; j < MList.size(); j++) {
                if(Objects.equals(NList.get(i), MList.get(j))) { //약수 리스트를 비교하여 같은 경우
                    max = Math.max(max, MList.get(j)); //일치하는 약수 중 최대값 저장
                }
            }
        }


        System.out.println(max);
        System.out.print(M * N / max);
    }
}
