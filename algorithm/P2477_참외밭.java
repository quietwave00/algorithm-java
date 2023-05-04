package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2477_참외밭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(stk.nextToken());

        int heightMax = 0;
        int widthMax = 0;
        int heightIndex = -1;
        int widthIndex = -1;

        int[] direction = new int[6];
        int[] length = new int[6];

        for(int i = 0 ; i < 6; i++) {
            stk = new StringTokenizer(br.readLine());
            direction[i] = Integer.parseInt(stk.nextToken());
            length[i] = Integer.parseInt(stk.nextToken());
            if(direction[i] == 1 || direction[i] == 2) {
                if(heightMax < length[i]) {
                    heightMax = length[i];
                    heightIndex = i;
                }
            } else {
                if(widthMax < length[i]) {
                    widthMax = length[i];
                    widthIndex = i;
                }
            }
        }
        int fullSize = heightMax * widthMax;
        int minSize = length[(heightIndex + 3) % 6] * length[(widthIndex + 3) % 6];

        System.out.println((fullSize - minSize) * count);

        br.close();
    }
}
