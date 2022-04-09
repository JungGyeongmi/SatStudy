package codeTest.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JollyJumpers2 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        StringBuilder sb = new StringBuilder();

        int N = 0;
        
        while(true) {

            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());

            if(N==0) {break;}

            int[] inputIntArr = new int[N];

            for(int i = 0; i < inputIntArr.length; i++) {inputIntArr[i] = Integer.parseInt(st.nextToken());}
           
            Arrays.sort(inputIntArr);
            
            Boolean checker = true;
            
            for(int i = inputIntArr.length-1; i > 0; i-- ){
                if(inputIntArr[i] - inputIntArr[i-1] == 1) {
                    continue;
                }
                checker = false;
                break;
            }
            
            sb.append(checker?"JOLLY G":"AN JOLLY G").append("\n");
        }
        System.out.println(sb.toString());
    }
}
