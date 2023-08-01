package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P10845_큐 {
    static Queue<Integer> queue = new LinkedList<>();
    static Deque<Integer> deque = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer stk = new StringTokenizer(str);

            String command = stk.nextToken();
            int num = 0;
            if (stk.hasMoreTokens()) {
                num = Integer.parseInt(stk.nextToken());
            }
            command(command, num);
        }
    }

    private static void command(String command, int num) {
            switch (command) {
                case "push":
                    queue.add(num);
                    break;
                case "pop":
                    System.out.println(queue.isEmpty() ? -1 : queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "back":
                    System.out.println(queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).peekLast());
                    break;
                case "front":
                    System.out.println(queue.isEmpty() ? -1 : queue.peek());
                    break;
            }
    }
}