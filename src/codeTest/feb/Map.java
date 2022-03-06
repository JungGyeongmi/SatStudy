package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Map {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        

        int x = Integer.parseInt(st.nextToken()); // 4
        int y = Integer.parseInt(st.nextToken()); // 5

        int[][] map = new int[x][y]; // [4][5]
 
        for(int i = 0; i<x; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<y; j++){
                map[x][y]=Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(map[0][0]);
    
    }    
}
