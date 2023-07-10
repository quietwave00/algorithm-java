package org.example.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10974_모든순열 {
    static int N;
    static int[] arr;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visit = new boolean[N];

        dfs(0);
    }

    private static void dfs(int count) {
        if(count == N) {
            for(int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            return;
        }
        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                arr[count] = i + 1;
                visit[i] = true;
                dfs(count + 1);
                visit[i] = false;
            }
        }
    }
}
