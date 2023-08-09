package org.example.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class P4963_섬의개수 {
    static int[][] arr;
    static int[] dx = new int[]{1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = new int[]{0, 0, -1, 1, 1, -1, 1, -1};
    static List<Integer> countList = new ArrayList<>();
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            /*
             * Input
             */
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(stk.nextToken());
            int h = Integer.parseInt(stk.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            arr = new int[h][w];

            for (int i = 0; i < h; i++) {
                stk = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(stk.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println("");
            }

            /*
             * Sol
             */
            count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] == 1) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        arr[x][y] = 0; //방문

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            x = point[0];
            y = point[1];

            for (int i = 0; i < 8; i++) { //대각선까지
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (arr[nx][ny] != 0) //옮긴 좌표가 0이 아니면
                {
                    arr[nx][ny] = 0; //방문 처리 해주고
                    queue.add(new int[]{nx, ny}); //큐에 넣어줌
                }
            }
        }
    }
}