package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoffeeCoupon {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// ÀüÃ¼ ¹Ýº¹ È½¼ö

		int tn = Integer.parseInt(br.readLine());
		int[] result = new int[tn];
		for(int i = 0; i<tn; i++){
			// ÄíÆù °³¼ö
			st = new StringTokenizer(br.readLine());
			long season = Long.parseLong(st.nextToken());
			long nomal = Long.parseLong(st.nextToken());
			
			int max = (int) (season / 5);
			
			if (max > 0 && season > 4) {
				for (int j = 1; j <= max; j++) {
					if ((season + nomal) >= 12 * j && season >= 5 * j) {
						result[i] = j;
					}
				}
			} 
//			else {
//				result[i] = 0;
//				continue;
//			}
		}
		br.close();
		for(int re : result) {
			System.out.println(re);
		}
	}
}
