package codeTest.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AttandanceVer2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuffer sb = new StringBuffer(input);
        
        String[] tempInputArr = input.split("");
       
        Arrays.sort(tempInputArr);

        String maxValue = tempInputArr[tempInputArr.length-1];

        int lastIndex = input.indexOf(maxValue);

        sb.deleteCharAt(lastIndex);
        System.out.println(sb.toString());

    }
    
}
