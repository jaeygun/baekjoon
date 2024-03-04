package DataStructures._10773;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i=0; i<a; i++) {
            check(Integer.parseInt(br.readLine()));
        }
        print(st);
    }

    public static void check(int num) {

        if (num != 0) {
            st.push(num);
        } else {
            st.pop();
        }
    }
    
    public static void print(Stack<Integer> st) {

        int totalValue = 0;
        int size = st.size();
        for (int i=0; i<size; i++) {
            totalValue += (int) st.pop();
        }
        System.out.println(totalValue);
    }
}
