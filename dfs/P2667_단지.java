package org.example.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2667_단지 {
    static int[][] arr; //그림1
    static int[] dx = new int[]{0, 1, 0, -1}; //y축 방향
    static int[] dy = new int[]{1, 0, -1, 0}; //x축 방향
    static int totalCount = 0;
    static int count = 0;
    static int N = 0;
    static List<Integer> countList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        /*
         * Input
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N + 2][N + 2]; //상하, 좌우 0으로 채울거

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            char[] col = row.toCharArray();
            for (int j = 0; j < N; j++) {
                arr[i + 1][j + 1] = Character.getNumericValue(col[j]);
            }
        }

        /*
         * Sol
         */
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count = 0;
                if (arr[i + 1][j + 1] == 1) {
                    bfs(i + 1, j + 1);
                    countList.add(count);
                    totalCount += 1;
                }
            }
        }

        /*
         * Output
         */
        Collections.sort(countList);
        System.out.println(totalCount);
        for (int count : countList) {
            System.out.println(count);
        }

    }

    /**
     * 0110100
     * 0110101
     * 1110101
     * 0000111
     * 0100000
     * 0111110
     * 0111000
     */

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y}); //큐에 받은 좌표 넣어
        arr[x][y] = 0; //받은 값은 방문

        while (!queue.isEmpty()) {
            count += 1;
            int[] point = queue.poll();
            x = point[0];
            y = point[1];

            for (int i = 0; i < 4; i++) { //동남서북
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
