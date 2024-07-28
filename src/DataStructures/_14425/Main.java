package DataStructures._14425;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = br.readLine().split(" ");
        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);

        String[] wordArr = new String[n];
        String[] word = new String[m];

        for (int i=0; i<n; i++) {
            wordArr[i] = br.readLine();
        }

        for (int i=0; i<m; i++) {
            word[i] = br.readLine();
        }

        int count = arrayCheck(wordArr, word);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }

    private static int arrayCheck(String[] wordArr, String[] word) {

        int count = 0;
        for (int i=0; i<wordArr.length; i++) {
            for (int j=0; j<word.length; j++) {
                if (wordArr[i].equals(word[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
