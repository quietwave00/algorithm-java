package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1330_두수비교하기
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(stk.nextToken());
		int B = Integer.parseInt(stk.nextToken());

		if (A > B)
		{
			System.out.println(">");
		}
		else if (A < B)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("==");
		}

		br.close();

	}

}
