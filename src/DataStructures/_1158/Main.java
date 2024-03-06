package DataStructures._1158;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Josephus(br.readLine());
    }

    private static void Josephus(String value) {

        int N = Integer.parseInt(value.split(" ")[0]);
        int K = Integer.parseInt(value.split(" ")[1]);

        Deque<Integer> queue = new ArrayDeque<Integer>();
        for (int i=1; i<=N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int i = 1;
        while (!queue.isEmpty()) {
            if (i != K) {
                queue.add(queue.poll());
                i++;
            } else {
                sb.append(queue.poll());
                if (queue.isEmpty()) {
                    sb.append(">");
                } else {
                    sb.append(", ");
                }
                i = 1;
            }
        }

        System.out.println(sb.toString());
    }
}
