package DataStructures._10828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i=0; i<a; i++) {
            method(br.readLine());
        }
    }

    private static void method(String value) {

        if (value.equals("")) {
            return;
        }

        if (value.contains("push")) {
            st.push(Integer.parseInt(value.split(" ")[1]));
            return;
        }

        StringBuilder sb = new StringBuilder();
        switch (value) {
            case "pop" :
                if (st.empty()) {
                    sb.append(-1);
                    break;
                }
                sb.append(st.peek());
                st.pop();
                break;

            case "size" :
                sb.append(st.size());
                break;

            case "empty" :
                sb.append(st.empty() == true ? 1 : 0);
                break;

            case "top" :
                if (st.empty()) {
                    sb.append(-1);
                    break;
                }
                sb.append(st.peek());
                break;
        }

        System.out.println(sb.toString());
    }
}