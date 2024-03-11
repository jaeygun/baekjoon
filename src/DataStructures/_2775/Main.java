package DataStructures._2775;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCnt = Integer.parseInt(br.readLine());

        int floor;
        int room;
        for (int i=0; i<caseCnt; i++) {
            floor = Integer.parseInt(br.readLine());
            room = Integer.parseInt(br.readLine());

            /*
             * 0층 배열 생성
             * ex) room = 5 > {1, 2, 3, 4, 5}
             */
            int[] arr = new int[room];
            for (int j=0; j<room; j++) {
                arr[j] = j+1;
            }

            /*
             * 생성한 0층배열에서 1층의 2호부터 순서대로 이전 호수의 거주자 수를 더하기
             * 어차피 1호는 항상 1명이라 1호는 제외
             */
            for (int j=0; j<floor; j++) {
                for (int k=1; k<room; k++) {
                    arr[k] += arr[k-1];
                }
            }
            System.out.println(arr[room-1]);
        }
    }
}
