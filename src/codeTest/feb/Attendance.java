package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Attendance {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		int[] arr = new int[23]; // ���옣怨듦컙 誘몃━ �깮�꽦
		// ���봽�꽆踰꾨룄 媛숈� 諛⑹떇�씤�뜲 �븳踰� ���뼱蹂대㈃ 醫뗭쓣�벏

//		 String[] input = br.readLine().split(" ");
//		 for(int i = 0; i<input.length; i++) {
//			 int idx = Integer.parseInt(input[i])-1;
//			 arr[idx]++;
//		 }

		// �엯�젰媛� �씫�쓬
		String input = br.readLine();

		// split怨� �룞�씪�븳 �룞�옉�븯�뒗�뜲 �넗�겙留뚮뱺�떎怨� �깮媛곹븯硫� �맆�벏
		// �뙆�씪誘명꽣濡쒕뒗 ���긽媛믨낵 �몢踰덉㎏ �뙆�씪誘명꽣濡쒕뒗 regx瑜� �꼶�뼱以�
		StringTokenizer st = new StringTokenizer(input, " ");

		for (int i = 0; i < N; i++) {
			// �넗�겕�굹�씠���뒗 nextToken�쑝濡� 遺꾨━�븳 媛믩뱾�쓣 �븯�굹�뵫 遺덈윭�삱 �닔 �엳�뒗�뜲
			// 肄붾뱶 諛섎났�쓣 �뵾�븯湲곗쐞�빐�꽌 for臾� �룎由�
			// String�삎�깭 媛믪쓣 諛섑솚�븯湲� �븣臾몄뿉 Integer �궗�슜
			int idx = Integer.parseInt(st.nextToken());
			arr[idx - 1]++; // 占썩석占쏙옙 1占쏙옙占쏙옙 占쏙옙占쏙옙占싹니깍옙 0占쏙옙 index占쏙옙 占쌍억옙占쌍깍옙 占쏙옙占쌔쇽옙 -1占쏙옙 占쏙옙占쏙옙
			// idx�뒗 nextToken�뿉�꽌 諛쏆� 媛�, 洹몃윭�땲源� �엯�젰諛쏆� 媛믪씤�뜲 �뿬湲곗꽌
			// �씤�뜳�뒪媛믪씠�땲源� -1�쓣 �빐以섏꽌 �룎由щ㈃ �빐�떦�씤�뜳�뒪�뿉
			// �빐�떦 踰덊샇媛� 遺덈졇�뒗吏� 泥댄겕 媛��뒫 ++�빐二쇰땲源� 1�뵫 �뜑�빐二쇨퀬 紐뉖쾲 遺덈��뒗吏� 泥댄겕媛��뒫
			// �씤�뜳�뒪媛믪�  0 遺��꽣 �떆�옉�븯怨� �넗�겙�� �떆�옉�씠 1遺��꽣�땲源� -1�엫
		}

		// 援녹씠 �뼢�룷濡� 寃곌낵媛� 異쒕젰 怨듬갚�쑝濡� 援щ텇
		for (int result : arr) {
			System.out.print(result + " ");
		}

	}
}
