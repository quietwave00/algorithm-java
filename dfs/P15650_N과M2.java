package org.example.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15650_N과M2 {
    static int N;
    static int M;
    static int start;
    static int[] arr;
    static boolean[] mark;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());

        arr = new int[M];
        mark = new boolean[N];

        dfs(0, 0);
        System.out.println(sb);
    }

    // 4 2
    // mark[0] == false 걸림!
    // mark[0] = true;
    // arr[0] = 1
    // dfs(1)
    // mark[0] == true
    // mark[1] == false 걸림!
    // mark[1] == true
    // arr[1] == 2
    // dfs(2)
    // if문 걸림
    // arr의 길이만큼 value 쌓음...
    // return
    // mark[1] = false; 반복문 계속~
    // mark[2] =

    // (1)이랑 차이점 depth 전의 노드들은 검사를 안해야됨 == 시작점이 다름

    private static void dfs(int depth, int start) {

        if (depth == M) {
            for (int value : arr) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            if (!mark[i]) {
                mark[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1, i);
                mark[i] = false;
            }
        }
    }
}

