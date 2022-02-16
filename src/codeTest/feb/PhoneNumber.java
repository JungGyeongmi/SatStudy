package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class PhoneNumber {

	public static void main(String[] args) throws IOException {
		// String[] temp = {"97674223", "119", "1195524421"};		

		// �엯異쒕젰 �떆�옉
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// split �쑝濡� �옄瑜대뒗 寃쎌슦
		//String[] temp = br.readLine().split(",");
		
		// tokenizer �쑝濡� �옄瑜대뒗 寃쎌슦, �씠寃� �뜑 鍮좊Ⅴ�젮�굹?
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, ",");
		String[] temp = new String[st.countTokens()];
		int i = 0;
		while(st.hasMoreTokens()) {
			temp[i] = st.nextToken();
			i ++;
		}
		
		
		// �븿�닔 �꽔怨� test 珥덇린�솕
		boolean test = solution(temp);
		
		// 寃곌낵 異쒕젰
		System.out.println(test);

		// �엯異쒕젰 �떕�븘以�
		br.close();
	}
	
	
	static boolean solution(String[] phone_book) {
		// true濡� 珥덇린�솕
		boolean answer = true;
		
		// �씤�뒪�꽩�뒪 �깮�꽦
		CheckNumber cn = new CheckNumber();
		// �냼�듃濡� �젙�젹�븯�뒗�뜲 �젙�젹湲곗��� �깮�꽦�븳 �씤�뒪�꽩�뒪濡�
		Arrays.sort(phone_book, cn);
		
		// �젙�젹�릺怨좊굹�꽌 媛��옣 泥� 踰덉㎏ �씤�뜳�뒪�뿉 �뱾�뼱媛�
		String test = phone_book[0];
		
		// 湲곗��젏�씤 0踰� �씤�뜳�뒪瑜� �젣�쇅�븯怨� 1踰� �씤�뜳�뒪 遺��꽣 phone_book array�쓽 湲몄씠留뚰겮 �룎由�
		for(int i = 1; i<phone_book.length; i++) {
			// �빐�떦 �씤�뜳�뒪�쓽 String�쓽 泥섏쓬遺��꽣 湲곗��젏�쓽 湲몄씠源뚯�(�씤�뜳�뒪�뒗 -1�씠�땲源�)subString�쑝濡� �옄瑜닿퀬 洹� 媛믪씠
			// test(phone_book[0]), 湲곗� 媛믨낵 媛숈�吏� 鍮꾧탳�븿
			if(phone_book[i].substring(0, test.length()).equals(test)) {
			// subString�쑝濡� �옄瑜대뒗�뜲 �떆�옉吏��젏遺��꽣 湲몄씠-1(�씤�뜳�뒪�땲源�) 洹몃윭硫� 湲곗��젏�씤 phone_book[0]�쓽
			// �쟾泥� 湲몄씠濡� 鍮꾧탳媛��뒫 �씠寃� equals�븳吏� test(�젙�젹���긽)�옉
			// 媛숈쑝硫� 寃곌낵 異쒕젰臾쇱씤 answer�뿉 false �꽔�뼱以� 
			// boolean 湲곕낯�씠 false�땲源� �븘�땲硫� answer瑜� 珥덇린�솕 �븞�빐二쇨퀬 not�씪�븣 true �꽔�뼱以섎룄 �릺寃좎�留�
			// 媛믪� 珥덇린�솕 �빐二쇰뒗寃� 醫뗭쑝�땲源�
				answer = false;
			}
		}
		return answer;
	}

}

// Sort�쓽 �젙�젹 湲곗� �젣怨�, 湲곕낯�� �궗�쟾�젙�젹�씠湲� �븣臾몄뿉
class CheckNumber implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {	
		// o2媛믪씠 湲몃㈃ �쓬�닔 諛섑솚
		// �쓬�닔 諛섑솚�븯硫� 湲곗� 媛믪씠 �븵�쑝濡쒓컧
		// �뼇�닔 諛섑솚�븯硫� 湲곗� 媛믪씠 �뮘濡쒓컧
		// 湲곕낯 �삤由꾩감�닚�씠湲곕븣臾몄뿉
		return o1.length()-o2.length();
	}
	
}
