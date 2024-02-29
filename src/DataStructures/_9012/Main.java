package DataStructures._9012;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0; i<a; i++) {
            System.out.println(check(sc.next()));
        }
    }

    private static String check(String value) {

        if (!value.contains("(") || !value.contains(")")) {
            return "NO";
        }

        List<String> units = new ArrayList<>();
        Stack<String> st = new Stack<>();
        for (String s : value.split("")) {
            units.add(s);
        }

        for (String unit : units) {
            if (st.empty() && unit.equals(")")) {
                return "NO";
            }
            
            if (unit.equals("(")) {
                st.add(unit);
            }
            
            if (unit.equals(")")) {
                st.pop();
            }
        }

        if (units.size() == 0 || !st.empty()) {
            return "NO";
        }

        return "YES";
    }

}