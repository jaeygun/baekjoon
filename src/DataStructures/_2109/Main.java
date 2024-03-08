package DataStructures._2109;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int collegeCnt = Integer.parseInt(br.readLine());

        PriorityQueue<College> collegeQueue = new PriorityQueue<>(Collections.reverseOrder());
        int day, pay;
        String temp;
        for (int i=0; i<collegeCnt; i++) {
            temp = br.readLine();
            day = Integer.parseInt(temp.split(" ")[1]);
            pay = Integer.parseInt(temp.split(" ")[0]);
            collegeQueue.add(new College(day, pay));
        }
        
        int size = collegeQueue.size();
        for (int i=0; i<size; i++) {
            College college = collegeQueue.poll();
            System.out.println(college.getDay() + " > " + college.getPay());
        }

        computePrice(collegeQueue);
    }

    private static void computePrice(PriorityQueue<College> collegeQueue) {

        /*
         * 1 20
         * 1 2
         * 2 100
         * 2 8
         * 3 10
         * 10 50
         * 20 5
         */
        int totalPay = 0;
        int day = 1;
        int topPay = 0;
        College college;
        List<Integer> payList = new ArrayList<>();
        while (!collegeQueue.isEmpty()) {
            
            
        }
        System.out.println(totalPay);
    }

    static class College implements Comparable<College> {

        int day, pay;

        private int getDay() {
            return this.day;
        }

        private int getPay() {
            return this.pay;
        }

        private College(int day, int pay) {
            this.day = day;
            this.pay = pay;
        }

        @Override
        public int compareTo(College college) {
            return this.pay - college.pay;
        }
    }
}