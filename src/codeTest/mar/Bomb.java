package codeTest.mar;

import java.util.Scanner;

public class Bomb {
    public static void main(String[] args){

        double beforeTime = System.currentTimeMillis();

		// 런타임을 측정할 코드------------------------------------
        
        // 코드 END -----------------------------------------------

        Scanner sc = new Scanner(System.in);
        //각 행렬에서 사방으로 한 줄 씩 추가한 것
        //맨왼쪽 맨위 맨오른쪽 맨아래쪽까지 검사해야하므로, 정수배열로
        int arr[][] = new int[11][11];

    //9*9행, 지뢰 찾기 맵의 정보가 9행 9열로 입력된다.(지뢰:1, 빈칸:0)
        for(int i = 1; i <= 9; i++) {
            for(int j= 1; j <= 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        double afterTime = System.currentTimeMillis();
        
        // 초(s) 단위로 보기 위해 나누기 1000을 해줌
        double secDiffTime = (afterTime - beforeTime)/1000;
        
        System.out.println("1번째 solution() 런타임 : "+secDiffTime);

        beforeTime = System.currentTimeMillis();
        //10번째 행에 행 r과 열 c가 입력된다.( 1 <= r, c <= 9 )
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        
        
        
        //자신을 기준으로 다음과 같이 8방향 지뢰 갯수를 검사
        int num =  arr[r-1][c] + arr[r-1][c+1] + arr[r][c+1] + arr[r+1][c+1] + arr[r+1][c] + arr[r+1][c-1] + arr[r][c-1] + arr[r-1][c-1];
        //지뢰가 있음. 1이라면 -1출력
        if(arr[r][c] == 1) {
            System.out.println(-1);
        } else {
            //아니면 지뢰 갯수 num을 그대로 출력
            System.out.println(num);
        }


        afterTime = System.currentTimeMillis();
        
        // 초(s) 단위로 보기 위해 나누기 1000을 해줌
        secDiffTime = (afterTime - beforeTime);
        
        System.out.println("1번째 solution() 런타임 : "+secDiffTime+" ms ");
        sc.close();
    } 
}