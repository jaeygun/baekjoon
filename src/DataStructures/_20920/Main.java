package DataStructures._20920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int wordCnt = Integer.parseInt(input[0]);
        int length = Integer.parseInt(input[1]);
        Map<String, Integer> wordMap = new HashMap<String, Integer>();

        String w;
        for (int i=0; i<wordCnt; i++) {
            w = br.readLine();
            if (w.length() >= length) {
                wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordMap.keySet());
        Collections.sort(words, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // 자주 등장하는 단어 순서대로 정렬
                if (Integer.compare(wordMap.get(o1), wordMap.get(o2)) != 0) {
                    return Integer.compare(wordMap.get(o2), wordMap.get(o1));
                }

                // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }

                // 등장 횟수와 길이가 같으면 사전 순으로 정렬
                return o1.compareTo(o2);
            }
        });

        for (int i=0; i<words.size(); i++) {
            bw.write(words.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
