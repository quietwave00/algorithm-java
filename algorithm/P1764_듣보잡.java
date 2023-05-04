package org.example.algorithm;

import java.io.*;
import java.lang.reflect.Array;
import java.net.CookieHandler;
import java.nio.BufferOverflowException;
import java.util.*;

public class P1764_듣보잡 {
    static int cnt;
//    static StringBuilder sb = new StringBuilder();
    static List<String> name = new ArrayList<>();
    static String[] NArr;
    static String[] MArr;

    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer stk = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(stk.nextToken());
            int M = Integer.parseInt(stk.nextToken());

            NArr = new String[N]; //들은 사람
            MArr = new String[M]; //본 사람

            //입력
            for(int i = 0; i < N; i++) {
                NArr[i] = br.readLine();
            }

            for(int i = 0; i < M; i++) {
                MArr[i] = br.readLine();
            }
            br.close();

            //연산
//            if(N > M) { //M이 대상이 됨
//                for(int i = 0; i < N; i++) {
//                    Arrays.sort(MArr);
//                    search(MArr, NArr[i], 0,MArr.length - 1);
//                }
//            } else {
//                for(int i = 0; i < M; i++) {
//                    Arrays.sort(NArr);
//                    search(NArr, MArr[i], 0,NArr.length - 1);
//                }
//            }
            Arrays.sort(MArr);
            Arrays.sort(NArr);
            for(int i = 0; i < N; i++) {

                search(NArr[i], 0, MArr.length - 1);
            }

            System.out.println(cnt);
//            System.out.println(sb);
            for(int i = 0; i < name.size(); i++) {
                System.out.println(name.get(i));
            }
    }
    private static void search(String key, int low, int high) throws IOException {
        int mid = (low + high) / 2;

        if(low > high) {
            return;
        }

        if(key.equals(MArr[mid])) {
//                sb.append(key + "\n");
            name.add(key);
            cnt ++;
            return;
        } else if(key.compareTo(MArr[mid]) < 0) {
            high = mid - 1;
            search(key, low, high);
        } else {
            low = mid + 1;
            search(key, low, high);
        }

    }

}


