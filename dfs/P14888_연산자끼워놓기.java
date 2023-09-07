package org.example.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14888_연산자끼워놓기
{
    static int N;
    static int[] arr;
    static int[] oper = new int[4]; //얘를 다 돌아야 됨
    static int[] result;
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    static int operCount;

    public static void main(String[] args) throws IOException
    {
        /*
         * 입력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++)
        {
            oper[i] = Integer.parseInt(stk.nextToken());
        }

        /*
         * 연산
         */
        calculate(arr[0], 1); //첫번째, 다음 숫자로 시작

        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void calculate(int arrNum, int index) //index = depth
    {
        //멈추는 조건: arr 수 다 돌았으면
        if (index == N)
        {
            MAX = Math.max(MAX, arrNum);
            MIN = Math.min(MIN, arrNum);
            return;
        }
        for (int i = 0; i < 4; i++)
        {
            if (oper[i] != 0)
            {
                oper[i]--;
                switch (i)
                {
                    case 0 :
                        calculate(arrNum + arr[index], index + 1);
                        break;
                    case 1 :
                        calculate(arrNum - arr[index], index + 1);
                        break;
                    case 2 :
                        calculate(arrNum * arr[index], index + 1);
                        break;
                    case 3 :
                        calculate(arrNum / arr[index], index + 1);
                        break;
                }
                oper[i]++;
            }

        }
    }

}
