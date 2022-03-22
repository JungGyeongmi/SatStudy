package codeTest.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindBomb {
    public static void main(String[] args) throws IOException{
        int[][] arr = new int[9][9];
        
        for(int i=0;i<9;i++){
            for(int j =0; j<9; j++){
                int num = (int)(Math.random()*2);
                arr[i][j] = num;
            }
        }
        
        for(int[] a:arr)System.out.println(Arrays.toString(a));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("행 입력하삼");
        int h = Integer.parseInt(br.readLine())-1; 
        System.out.print("열 입력하삼");
        int y = Integer.parseInt(br.readLine())-1;
        
        if(arr[h][y]!=0){
            System.out.println("-1!!! 헉 똥손씨 안녕하세요^^ 원샷원지뢰~~살리고 살리고!");
            main(args);
        }

        try {
            int sum = 0;
            for(int j = -1; j<2; j++){
                for(int i = -1; i<2;i++ ){               
                   sum += arr[h+j][y+i];
                }
            }

            System.out.print("지뢰갯수는:"+sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("행렬에 0이라든지 8이라든지 식구끼리 그런거 입력하고 그러지 맙시다...^^하려면 할 수 는 있는데 너무 노가다라 못하겠어요 한번만 봐주세요");
        }

    }
}