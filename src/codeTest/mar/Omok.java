package codeTest.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Omok {

    static String[][] omokPan = new String[19][19]; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer("");
        // 초기화
        for(int i = 0; i < omokPan.length; i++) {
            sb = new StringTokenizer(br.readLine());
            int j = 0;
            while(sb.hasMoreTokens()){
                omokPan[i][j]=sb.nextToken();
                j++;
            }
        }
    }
}
