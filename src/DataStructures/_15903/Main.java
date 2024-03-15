package DataStructures._15903;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] value = br.readLine().split(" "); // 3 1
        int n = Integer.parseInt(value[0]); // 3개의 자연수
        int m = Integer.parseInt(value[1]); // 1번의 반복

        String[] numbers = br.readLine().split(" "); // 3 2 6
        PriorityQueue<Long> queue = new PriorityQueue<Long>();
        for (int i=0; i<numbers.length; i++) {
            queue.add(Long.parseLong(numbers[i]));
        }

        // 위의 for문이 끝나면 queue에 2 3 6이 들어간다.
        for (int i=0; i<m; i++) {
            long  totalNumber = 0;
            totalNumber += queue.poll();
            totalNumber += queue.poll();
            queue.add(totalNumber);
            queue.add(totalNumber);
        }

        long result = 0;
        int size = queue.size();
        for (int i=0; i<size; i++) {
            result += queue.poll();
        }
        System.out.println(result);
    }
}
