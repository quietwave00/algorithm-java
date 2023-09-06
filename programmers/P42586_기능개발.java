package org.example.programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P42586_기능개발 {

    public static void main(String[] args) {
        int[] progresses = { 95, 90, 99, 99, 80, 99 };
        int[] speeds = { 1, 1, 1, 1, 1, 1 };
        System.out.println(Arrays.toString(solution(progresses, speeds)));

    }

    static int[] solution(int[] progresses, int[] speeds) {
        int taskSize = progresses.length;
        Queue<Integer> task = new LinkedList<>();
        //얼마나 걸리는지->나누기 버림 이용해서
        int[] dayArr = new int[taskSize];
        for (int i = 0; i < taskSize; i++) {
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                dayArr[i] += 1;
            }
            task.add(dayArr[i]);
        }
        System.out.println(Arrays.toString(dayArr));




        //max값 저장해놓기
        //Deque 활용
        int[] countArr = new int[taskSize];
        int count = 1;
        int index = 0;
        int day = task.poll();

        while (!task.isEmpty()) {
//            System.out.println("day: " + day + ", peek: " + task.peek() + ", index: " + index);
            if (task.peek() < day) {
                System.out.println("if");
                countArr[index] = ++count;
                count = 1;
            } else {
                System.out.println("else");
                countArr[index] = count;
            }
            day = task.poll();
            index++;
        }

        int[] resultArr = new int[index];
        for (int i = 0; i < index; i++) {
            resultArr[i] = countArr[i];
        }

        return resultArr;
    }
}
