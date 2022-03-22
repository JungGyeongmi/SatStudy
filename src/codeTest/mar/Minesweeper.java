package codeTest.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minesweeper {
    public static void main(String[] args) throws IOException {
        double beforeTime = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] bomb= new String[9][9];
        for(int i = 0; i<9; i++) {
            bomb[i] = br.readLine().split(" ");
        }


        
		// 런타임을 측정할 코드------------------------------------
        

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
            int temp = y!=0?-1:0;
            int lengthI = x==8?1:2;
            int lengthJ = y==8?1:2;

            for(;i<lengthI; i++){
                int j = temp;
                for(;j<lengthJ; j++){
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


                
        // 코드 END -----------------------------------------------

        double afterTime = System.currentTimeMillis();
        
        // 초(s) 단위로 보기 위해 나누기 1000을 해줌
        double secDiffTime = (afterTime - beforeTime)/1000;
        
        System.out.println("1번째 solution() 런타임 : "+secDiffTime);
    }
}
