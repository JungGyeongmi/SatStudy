package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PickaFarm {

	public static void main(String[] args) throws IOException {
		/*
		 // N+1/2
		int n  = 3;
		int temp = 0;
		// 증가
		for (int i = 1; i <= n; i++) {
			System.out.print(i-1+" ");
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
				temp += j;
			}
			for (int k = 0; k < (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 감소
		for (int i = n-1; i >0; i--) {
			System.out.print(2*n-i-1+" ");
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = (2 * i) - 1; k >0 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tn = Integer.parseInt(br.readLine());
		
		for(int i = 0; i< tn; i++) {
			int size = Integer.parseInt(br.readLine());
			int result = 0;
			
			System.out.println();
			for(int j = size/2; j >= 0; j--){ // 배열 윗부분 계산
				String[] str = br.readLine().trim().split("");
                for(int k = j; k < size - j; k++){
//	                	System.out.print(str[k]+" ");
                	result += Integer.parseInt(str[k]);
                }
//	                System.out.println();
            }

            for(int j = 1; j <= size / 2; j++){ // 배열 아랫부분 계산
            	String[] str = br.readLine().trim().split("");
                for(int k = j; k < size - j; k++) {
//	                	System.out.print(str[k]+" ");
                	result += Integer.parseInt(str[k]);
                }
//	                System.out.println();
            }
            System.out.printf("#%d %d", i+1, result);
            br.close();		
		}
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int tn = Integer.parseInt(br.readLine());
//		int[][] arrt =  new int[tn][tn];
//		
//		for(int i = 0; i< tn; i++) {
//			int size = Integer.parseInt(br.readLine());
//			int result = 0;
//			
//			System.out.println();
//			 for(int j = size/2; j >= 0; j--){ // 배열 윗부분 계산
//				 br.readLine().trim().split("");
//	                for(int k = j; k < size - j; k++){
////	                	result += Integer.parseInt(str[k]);
//	                }
//	            }
//
//	            for(int j = 1; j <= size / 2; j++){ // 배열 아랫부분 계산
//	            	String[] str = br.readLine().trim().split("");
//	                for(int k = j; k < size - j; k++) {
//	                	result += Integer.parseInt(str[k]);
//	                }
//	            }
//	            System.out.printf("#%d %d", i+1, result);
//	            br.close();		
//		}

	}
}
