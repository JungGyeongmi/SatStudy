package codeTest.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Command {
    public static void main(String[] args) throws IOException {

        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());        
        char[][] inputText = new char[50][50];
        for(int i = 0; i < N; i++) inputText[i] = br.readLine().toCharArray();
        
        /* . => 46 번
         a => 97
         z => 122
         System.out.println(+inputText[2][7]);
         System.out.println(inputText[2].length);
        */
        /*
         System.out.println(i+"다름");
         System.out.println(result.charAt(i));
        */

        // 출력
        StringBuilder result = new StringBuilder(String.valueOf(inputText[0]));
        for(int i = 0; i < inputText[0].length; i++){
            for(int j = 0; j < N-1; j++) {
                if(+inputText[j][i] != +inputText[j+1][i]) {
                    result.setCharAt(i, '?');
                }
            }
        }
        System.out.println(result);
    }
}
