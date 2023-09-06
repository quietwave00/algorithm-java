package org.example.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P11725_트리 {
    static int N;
    static List<Integer> nodeList[];
    static List<Integer> parentList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N];

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(stk.nextToken());
            int node2 = Integer.parseInt(stk.nextToken());

        }

        dfs(1);

    }

    //            1
    //       4         6
    //   2    7         3
    //                    5
    private static void dfs(int node) {
        visited[node] = true;
        for (int i = 0; i < N - 1; i++) {
            if (!visited[i]) {
                parentList.add(i);
                dfs(i);
            }
        }
    }
}
