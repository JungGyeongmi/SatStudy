package codeTest.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Minesweeper {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] bomb= new String[9][9];
        for(int i = 0; i<9; i++) {
            bomb[i] = br.readLine().split(" ");
        }

        // System.out.println(Arrays.deepToString(bomb));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken())-1;
        int y = Integer.parseInt(st.nextToken())-1;
        // System.out.println(x+", "+y);
        br.close();

        // System.out.println(bomb[x][y]);
        if(bomb[x][y].equals("1")) {
            System.out.println("-1");
        } else {
            int count = 0;
            int i = x==0?0:-1;
            int lengthI = x==8?1:2;
            int lengthJ = y==8?1:2;

            for(;i<lengthI; i++){
                // System.out.println("i"+i);
                int j = y!=0?-1:0;
                for(;j<lengthJ; j++){
                    // System.out.println(i+", "+j+" : "+bomb[x+i][y+j]);
                    if(bomb[x+i][y+j].equals("1")){
                        count++;
                    }
                }
            }
    
            if(count==0){
                System.out.println("0");
            } else {
                System.out.println(count);
            }
        }
    }
}
