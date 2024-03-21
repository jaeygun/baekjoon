package Implementation._2566;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = 0;
        int[] location = new int[2];
        for (int i=0; i<9; i++) {
            String[] numArr = br.readLine().split(" ");
            int[] nums = Arrays.stream(numArr).mapToInt(Integer::parseInt).toArray();

            for (int j=0; j<nums.length; j++) {
                if (maxNum <= nums[j]) {
                    maxNum = nums[j];
                    location[0] = i+1;
                    location[1] = j+1;
                }
            }
        }

        bw.write(maxNum + "\n");
        bw.write(location[0] + " " + location[1]);
        bw.flush();
        bw.close();
    }

}
