package DataStructures._24511;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qsLength = Integer.parseInt(br.readLine());

        String[] qsFlagArr = br.readLine().split(" "); // 0 1 1 0
        int length = 0;
        for (int i=0; i<qsFlagArr.length; i++) {
            if (Integer.parseInt(qsFlagArr[i]) == 1) {
                continue;
            }
            length++;
        }
        
        String[] qsElementArr = br.readLine().split(" "); // 1 2 3 4
        Deque<Integer> queue = new ArrayDeque<>();
        int idx = qsElementArr.length;
        while (idx > 0) {
            if (Integer.parseInt(qsFlagArr[idx-1]) == 0) {
                queue.add(Integer.parseInt(qsElementArr[idx-1]));
            }
            idx--;
        }

        int inputArrLength = Integer.parseInt(br.readLine());
        int[] inputArr = new int[inputArrLength];
        String[] value = br.readLine().split(" ");
        for (int i=0; i<inputArrLength; i++) {
            inputArr[i] = Integer.parseInt(value[i]); // 2 4 7
        }

        int element = 0;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<inputArr.length; i++) {
            element = inputArr[i];
            queue.add(element);
            sb.append(queue.poll());
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}