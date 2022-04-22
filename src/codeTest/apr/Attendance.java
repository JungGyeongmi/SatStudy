package codeTest.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Attendance {
    public static void main(String[] args) throws IOException {
        
        // 97 ~ 122
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] inputArr = br.readLine().toCharArray();
        int max = inputArr[0];
                
        int index = 0;
        for(int i = 0; i < inputArr.length; i++) {
            if(max < inputArr[i]) {
                index = i;
            }
        }   
        
        for (int j = 0; j < inputArr.length; j++) {
            if(j == index) {continue;}
            sb.append(inputArr[j]);
        }
        
		System.out.println(sb.toString());
    }
}