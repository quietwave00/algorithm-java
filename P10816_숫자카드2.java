package org.example;

import java.io.*;
import java.util.*;

public class P10816_숫자카드2 {
    static int count = 0;
    static Map<Integer, Integer> checkMap = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] NArr = new int[N];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            NArr[i] = Integer.parseInt(stk.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] MArr = new int[M];

        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M; i++) {
            MArr[i] = Integer.parseInt(stk.nextToken());
            checkMap.put(MArr[i], 0);
        }
        br.close();


        //연산
        Arrays.sort(MArr);

        for(int i = 0; i < N; i++) {
            search(MArr, NArr[i], 0, MArr.length - 1, i);
            count = 0;
        }

        //출력
        for(Integer key : checkMap.keySet()) {
            System.out.print(checkMap.get(key) + " ");
        }


    }

    private static void search(int[] arr, int key, int low, int high, int index) {
        while(low <= high) {
            int mid = (low + high) / 2;
            if(key == arr[mid]) {
                checkMap.put(key, checkMap.get(key) + 1);
                return;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }


    }
}
