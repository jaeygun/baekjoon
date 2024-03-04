package DataStructures._2164;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        card(Integer.parseInt(br.readLine()));
    }

    public static void card(int cards) {

        // 여기서 큐 생성
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i=1; i<cards+1; i++) {
            queue.add(i);
        }

        int headCard = 0;
        while(queue.size() != 1) {

            // 1. 제일 앞 카드를 삭제
            queue.remove();

            // 2. 그 다음 카드를 제일 뒤로 넘기기
            headCard = queue.poll();
            queue.add(headCard);
        }

        System.out.println(queue.peek());
    }
}
