package codeTest.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StrZip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String inputStr = br.readLine();

        int min = inputStr.length();

        // System.out.println(min);
        for (int j = 1; j < inputStr.length()-1; j++) {
            System.out.println("size "+j);
            int size = j;
            int i = size;
            int count = 1;

            String strPattern = inputStr.substring(0, size);
            // System.out.println("first pattern " + strPattern);
            Map<String, Boolean> triger = new HashMap<>();
            triger.put(strPattern, true);
            while (true) {

                if (i + size > inputStr.length()) {

                    if (triger.get(strPattern) && count == 1) {
                        System.out.println(strPattern);
                        sb.append(strPattern);
                    }

                    if (count > 1) {
                        sb.append(count).append(inputStr.substring(i - 1));
                        // System.out.println(inputStr.substring(7));
                    } else {
                        sb.append(inputStr.substring(i - 1));
                    }
                    break;

                }

                if (!inputStr.substring(i, i + size).equals(strPattern)) {

                    if (count > 1) {
                        sb.append(count).append(strPattern);
                        triger.put(strPattern, false);
                        System.out.println(count + " " + strPattern);
                    } else {
                        sb.append(strPattern);
                        triger.put(strPattern, false);
                        System.out.println(strPattern);
                    }

                    count = 1;
                    strPattern = inputStr.substring(i, i + size);
                    triger.put(strPattern, true);

                    // System.out.println("new pattern " + strPattern);

                } else {
                    count++;
                }

                i += size;
            }

            System.out.println(sb.toString());
            min = sb.length() < min ? sb.length() : min;
            System.out.println(min);
            sb.setLength(0);
        }

        System.out.println("final "+min);

    }
}
