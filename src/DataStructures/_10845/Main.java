package DataStructures._10845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    private static LinkedList<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i=0; i<a; i++) {
            method(br.readLine());
        }
    }

    private static void method(String input) {

        int value = 0;
        int size = queue.size();
        switch(input) {
            case "pop":
                if (size == 0) {
                    value = -1;
                } else {
                    value = queue.poll();
                }
                System.out.println(value);
                break;

            case "size":
                value = size;
                System.out.println(value);
                break;

            case "empty":
                if (size == 0) {
                    value = 1;
                }
                System.out.println(value);
                break;

            case "front":
                if (size == 0) {
                    value = -1;
                    System.out.println(value);
                    break;
                }
                value = queue.peek();
                System.out.println(value);
                break;

            case "back":
                if (size == 0) {
                    value = -1;
                    System.out.println(value);
                    break;
                }
                for (int i=0; i<size; i++) {
                    if (i+1 == size) {
                        value = queue.get(i);
                    }
                }
                System.out.println(value);
                break;

            default:
                String num = input.split(" ")[1];
                queue.add(Integer.parseInt(num));
                break;
        }
    }
}
