package codeTest.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Attendance {
    public static void main(String[] args) throws IOException {

        // 97 ~ 122
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int max = input.charAt(0);
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            if (max < input.charAt(i)) {
                index = i;
                max = input.charAt(i);
            }
        }

        if (index != 0) {
            int min = input.charAt(0);
            for (int k = 0; k < index; k++) {
                if (min > input.charAt(k)) {
                    System.out.println(input.substring(0, k - 1) + input.substring(k));
                    return;
                }
            }
        }

        System.out.println(input.substring(0, index) + input.substring(index + 1));

    }
}