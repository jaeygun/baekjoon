package DataStructures._7785;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int logs = Integer.parseInt(br.readLine());
        Map<String, String> memberMap = new HashMap<String, String>();
        for (int i=0; i<logs; i++) {
            String[] member = br.readLine().split(" ");
            memberMap.put(member[0], member[1]);
        }

        /*
         * 위의 Map에는 이렇게 남을 것
         * Askar enter
         * Baha leave
         * Artem enter
         */
        List<String> removeKeys = new ArrayList<>();
        for (Map.Entry<String, String> entry : memberMap.entrySet()) {
            if ("leave".equals(entry.getValue())) {
                removeKeys.add(entry.getKey());
            }
        }

        for (String key : removeKeys) {
            memberMap.remove(key);
        }

        List<String> memberList = new ArrayList<>(memberMap.keySet());
        Collections.sort(memberList, Collections.reverseOrder());
        for (int i=0; i<memberList.size(); i++) {
            bw.write(memberList.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
