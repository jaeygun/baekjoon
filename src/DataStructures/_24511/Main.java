package DataStructures._24511;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qsLength = Integer.parseInt(br.readLine());

        Object[] qsArr = new Object[qsLength];
        String[] qsFlagArr = br.readLine().split(" "); // 0 1 1 0
        String[] qsElementArr = br.readLine().split(" "); // 1 2 3 4
        for (int i=0; i<qsFlagArr.length; i++) {
            switch(Integer.parseInt(qsFlagArr[i])) {
                case 0:
                    Deque<Integer> queue = new ArrayDeque<Integer>();
                    queue.add(Integer.parseInt(qsElementArr[i]));
                    qsArr[i] = queue;
                    break;
                case 1:
                    Stack<Integer> stack = new Stack<Integer>();
                    stack.add(Integer.parseInt(qsElementArr[i]));
                    qsArr[i] = stack;
                    break;
                }
        }

        int inputArrLength = Integer.parseInt(br.readLine());
        int[] inputArr = new int[inputArrLength];
        String[] value = br.readLine().split(" ");
        for (int j=0; j<inputArrLength; j++) {
            inputArr[j] = Integer.parseInt(value[j]); // 2 4 7
        }

        int element = 0;
        StringBuilder sb = new StringBuilder();
        for (int k=0; k<inputArr.length; k++) {
            element = inputArr[k]; // 2
            sb.append(test(qsArr, qsFlagArr, element, 0));
        }
        System.out.println(sb.toString());
    }

    private static int test(Object[] qsArr, String[] qsFlagArr, int element, int idx) {

        if (idx == qsArr.length) {
            return element;
        }

        if (Integer.parseInt(qsFlagArr[idx]) == 0) {
            Deque<Integer> queue = (Deque<Integer>) qsArr[idx];
            queue.add(element);
            element = queue.poll();
        } else {
            Stack<Integer> stack = (Stack<Integer>) qsArr[idx];
            stack.add(element);
            element = stack.pop();
        }
        idx++;
        test(qsArr, qsFlagArr, element, idx);

        return element;
    }
}