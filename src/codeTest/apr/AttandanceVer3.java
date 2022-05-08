package codeTest.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AttandanceVer3 {
    public static void main(String[] args)  throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input  = br.readLine();

        String[] tempArr = new String [input.length()];

        for ( int i = 0; i < input.length(); i++ ){
            tempArr[i] = input.substring(0, i) + input.substring(i+1);
        }

        Arrays.sort(tempArr);

        System.out.print(tempArr[0]);
    }
}
