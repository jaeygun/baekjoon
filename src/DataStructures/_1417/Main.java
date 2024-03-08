package DataStructures._1417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception{

        int userCnt = 0;
        int buyVoteCnt = 0;
        PriorityQueue<Integer> userQueue = new PriorityQueue<>(Collections.reverseOrder());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        userCnt = Integer.parseInt(br.readLine());

        int ownerVoteCnt = Integer.parseInt(br.readLine());;
        for (int i=0; i<userCnt-1; i++) {
            userQueue.add(Integer.parseInt(br.readLine()));
        }

        // 출마한 후보가 1명일 때
        if (userCnt == 1) {
            System.out.println(buyVoteCnt);
            return;
        }

        // 표 매수
        buyVoteCnt = buyVote(ownerVoteCnt, userQueue, buyVoteCnt);
        System.out.println(buyVoteCnt);
    }

    /**
     * 표 매수
     * 
     * @param ownerVoteCnt 주인공 득표수
     * @param userQueue 주인공을 제외한 후보자 큐
     * @param buyVoteCnt 매수한 투표 수
     * @return buyVoteCnt 매수한 투표 수
     */
    private static int buyVote(int ownerVoteCnt, PriorityQueue<Integer> userQueue, int buyVoteCnt) {

        int headVoteCnt;
        while (ownerVoteCnt <= userQueue.peek()) {
            headVoteCnt = userQueue.poll();
            headVoteCnt--;
            ownerVoteCnt++;
            buyVoteCnt++;
            userQueue.add(headVoteCnt);
        }

        return buyVoteCnt;
    }
}
