package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2798_블랙잭 {

	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String NM = br.readLine();
//		StringTokenizer NMstk = new StringTokenizer(NM);
//		int N = Integer.parseInt(NMstk.nextToken());
//		int M = Integer.parseInt(NMstk.nextToken());
//		String arrStr = br.readLine();
//		StringTokenizer arrStk = new StringTokenizer(arrStr);
//		
//		//입력
//		int[] arr = new int[N];
//		for(int i = 0; i < N; i++) {
//			arr[i] = Integer.parseInt(arrStk.nextToken());
//		}
//		
//		//연산
//		int max = 0;
//		int index = 0;
//		int minus = M;
//		int[] card = new int[4];
//		
//		for(int i = 0; i < N; i++) {
//			do {
//				if(arr[i] <= minus) { //5 21
//					max = arr[i]; //max = 5
//					System.out.println("max: " + max);
//					card[index++] = max; //card[0] = 5
//					minus -= max; //21 - 5
//				}
//			} while(minus > 0);
//		}
//		System.out.println(card[0] + card[1] + card[2]);
//		
//	}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];  //세 수의 합
                    if (sum <= m) {  //합이 m보다 작으면 갱신할 수 있는지 확인
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.print(max);
    }

}
