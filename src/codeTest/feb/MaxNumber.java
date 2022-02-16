package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ct�씪�뒗 �씤�뒪�꽩�뒪 �깮�꽦 �젙�젹湲곗��쓣 �옟湲� �쐞�빐�꽌 �븘�옒�뿉 �옄�꽭�엳
		CompareTest ct = new CompareTest();
		// ,瑜� 湲곗��쑝濡� 媛믪쓣 諛쏆쓬
		String[] input = br.readLine().trim().split(",");
		// Arrays �겢�옒�뒪�쓽 sort 硫붿꽌�뱶瑜� �궗�슜�빐�꽌 �젙�젹湲곗��� ct�씤�뒪�꽩�뒪�쓽 comparator �궗�슜
		
		// �젙�젹 �쟾 input �뀒�뒪�듃 異쒕젰
		for(String test : input) {
			System.out.print(test);
		}

		Arrays.sort(input, ct);
		// �룎由щ㈃ �젙�젹���긽�씤 input�씠 �젙�젹�맂 �긽�깭濡� �옱�젙�쓽�릺�뒗 寃�

		// result�씪�뒗 寃곌낵媛믪쓣 異붿텧�븯湲곗쐞�븳 String , 鍮� 臾몄옄�뿴 �깮�꽦
		String result = "";
		
		// �뼢�룷瑜� �궗�슜�빐�꽌 result�뿉 �젙�젹�맂 寃곌낵媛믪씤 �젙�젹�맂 �긽�깭�쓽 input�쓣 �꽔�뼱以�
		for(String temp : input) {
			result += temp;
		}
		for(String t : input) {
			System.out.print(t);
		}

		// 寃곌낵媛� 異쒕젰
		System.out.println(result);
	}
}

// �뜑 �솗�떎�븳 鍮꾧탳諛⑸쾿�� �옒 紐⑤Ⅴ寃�
// 鍮꾧탳 �븯湲곗쐞�빐�꽌 CompareTest class �깮�꽦
// 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙
class CompareTest implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
 		// return Integer.parseInt(o2) - Integer.parseInt(o1);
		// 占싱뤄옙占쏙옙 占쏙옙占쌍몌옙 占쌤쇽옙占싹곤옙 占쏙옙占쏙옙 占쏟교밖울옙 占싫듸옙
		// �닽�옄留� 鍮꾧탳�븯硫� �겙 �닽�옄留� �븵�쑝濡쒖삤怨� �몢�빐 �빀�뻽�쓣�븣 �겙�닔媛� �븵�쑝濡� �삤吏��뒗 �븡�쓬
		return Integer.parseInt(o2+o1) - Integer.parseInt(o1+o2);
		// �몢 �닔瑜� �빀�뻽�쓣�븣 湲곗� 臾몄옄�뿴 �뜑�븯湲� �븯怨� �씤�듃�삎�쑝濡� 諛붽퓭�꽌 
		// 洹� �닔瑜� 鍮꾧탳�뻽�쓣�븣 �겙寃껋쓣 湲곗��쑝濡� 湲곗��닔 o1�쓣 �젙�젹�븯�뒗 �삎�깭�엫
		// 洹몃윭�땲源� o2媛� �븵�뿉�솕�쓣 �븣 �겕硫� �뼇�닔 諛섑솚�븯�땲源�
		// 湲곕낯�쟻�쑝濡� �삤由꾩감�닚 �젙�젹�씠 �맂�떎怨� �뻽�쓣�븣 o1�쓣 �겙�닔濡� �씤�떇�븯怨� 湲곗��닔瑜� �뮘濡� 蹂대깂
		// �옄�룞�쑝濡� o2+o1�쓽 �삎�떇�쑝濡� �젙�젹�릺怨� �떎�쓬 湲곗��닔�룄 �룞�씪�븳 諛⑹떇�쑝濡� �젙�젹 �궗�슜
		// 占쏙옙 占쌘뤄옙 占쏙옙占쏙옙占쏙옙 占쏙옙 占쏙옙占쏙옙 占쏙옙 큰占쏙옙 占쏙옙占쌔쇽옙 큰占쏙옙 占쏙옙占쏙옙占쏙옙 占쌀ㅿ옙
		// (ex) 5,6 -> 65-56 = 11=> 占쏙옙占�  
		// o1(5)占쏙옙 占쏙옙占쌔쇽옙 o2(6)占쏙옙 占쏟교쇽옙占싹깍옙 
		// 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 (占쌘듸옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙)
		// 占쏙옙占쏙옙占쏙옙 占쏙옙占식되댐옙 占쏙옙占쏙옙 o1占싱니깍옙 占쌌울옙 占싸놂옙 占쌘울옙占싸냐몌옙 占쏙옙占쏙옙占싹몌옙 占실는곤옙
		// 占쏙옙占싹댐옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占� 占쏙옙占쏙옙占식되는곤옙占쏙옙 o1占싱곤옙 占쏙옙占쏙옙占싱ㅿ옙占쏙옙..占쏙옙 占쏙옙占쏙옙 
		// 占쏙옙占� 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 o1占쏙옙 占쌘울옙 占쏙옙占쏙옙占쏙옙 크占쌕댐옙 占신니깍옙 占쌘듸옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占쌘뤄옙 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙
		
	}
}