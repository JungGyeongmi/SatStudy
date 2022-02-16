package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// import static java.lang.Math.*;

// �븳踰� 瑗ъ씠硫� 踰쀬뼱�궇 �닔 �뾾�뒗�꽩 吏꾩쭨 ..
public class BullsAndCows {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �옖�뜡�븳 �닽�옄瑜� String ���엯�쑝濡� �떞�쓣嫄곌퀬 �씠瑜� �쐞�븳 鍮� 臾몄옄�뿴 randStr �꽑�뼵 諛� 珥덇린�솕	
		String randStr = "";
		// while臾몄쓽 議곌굔�쓣 randStr�씠 湲몄씠媛� 4�씠�븯, 利� 3�씪�븣源뚯�瑜� true濡� �옟�쓬
		// 湲곗� 議곌굔�씤 4媛��릺硫� �뜑�씠�긽 �룎吏� �븡寃�
		while (randStr.length() < 4) {
			// Math �겢�옒�뒪 random �씠嫄� �쟾�뿭 static import �벐硫� random留� �샇異� 媛��뒫 �쐞�뿉 二쇱꽍 李멸퀬
			// String temp = Integer.toString((int) (random() * 9));
			String temp = Integer.toString((int) (Math.random() * 9));
			if (!randStr.contains(temp)) {
				// �룞�씪�븳 �닔媛� �뱾�뼱媛�硫� �븞�릺�땲源� 泥댄겕 �븘�닔
				randStr += temp;
				// �뾾�쓣�븣留� 誘몃━ �꽑�뼵�븳 臾몄옄�뿴�뿉 �닽�옄 異붽� 臾몄옄�뿴 �뜑�븯湲�
			}
		}

		// 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙 占십깍옙화 占쌜억옙
		// �븘�씡 吏꾩쭨 蹂��닔�뱾 珥덇린�솕 
		// 移댁슫�꽣�뱾
		int bulls = 0; // �씤�뜳�뒪�� 媛� 紐⑤몢 �씪移�
		int cows = 0;  //  媛� �씪移� 
		int totalCount = 0; // 珥� 紐뉙쉶 吏꾪뻾�뻽�뒗吏� 泥댄겕

		System.out.println("寃뚯엫�쓣 �떆�옉�븯吏� 以묐났�릺吏� �븡�뒗 �꽕�옄由ъ닔 �엯�젰 �꽦");

		// 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙 do-while 占쌥븝옙占쏙옙
		// do  while臾몄쓣 �궗�슜�뻽�뒗�뜲 �듅蹂꾪븳 �씠�쑀�뒗 �뾾怨� 議곌굔 �뾾�씠 �씪�떒 �룎�븘媛�寃� �븯湲곗쐞�븳 �슜�룄
		// main method 媛� �걹�굹�뒗 遺�遺� 諛붾줈 �쐞�뿉�꽌 while臾� 醫낅즺�릺�뒗�뜲 �씠嫄� true濡� 議곌굔 �꽕�젙�빐�꽌
		// �궗�떎 do while臾몄씪 �븘�슂�뒗 �뾾怨�
		// 留뚯빟 1�쉶李⑤뒗 臾댁“嫄� �룎怨� 洹� �떎�쓬 遺��꽣 議곌굔�쓣 �궗�슜�븯怨� �떢�떎怨� �뻽�쓣 寃쎌슦�뿉 �궗�슜�븯硫대맂�떎
		// �븘�떆寃껋�留� if臾몄� �룄�뒗 �슏�닔媛� �젙�빐�졇�엳�쓣�븣 �궗�슜�븯硫� 醫뗪퀬 while臾몄� 臾댄븳�씪�븣 �룎由щ㈃ 醫뗫떎
		// while臾몄쓣 議곌굔臾멸낵 諛섎났臾몄씠 �옒 �꽎�씤�삎�깭濡� �깮媛곹븯怨� �벐硫� �깮媛곷낫�떎 留롮씠 �벐�씠�뒗�벏 ! 
		do {
			System.out.print("�꽕 �옄由ъ닔瑜� �엯�젰�븯�꽭�슂 : ");
			String input = br.readLine();

			// 占쌉력곤옙 占십깍옙화
			// 諛섎났臾몄씠 �븳諛뷀�� �룎�븯�쓣�븣 媛믪쓣 珥덇린�솕�빐以섏빞�븯�땲源�
			// 泥� 踰덉㎏ 諛섎났�뿉�꽌�뒗 ���옣�맂 媛믪씠 0�씠�땲源� 洹몃�濡� 0�쑝濡� �떎�떆 珥덇린�솕�빐以섎룄 愿쒖갖
			bulls = 0;
			cows = 0;
			
			// �쑀�슚�꽦 寃��궗瑜� �쐞�븳 if臾� 湲몄씠媛� 4�씠怨� �닽�옄濡� �씠猷⑥뼱吏� 媛믪씠�뼱�빞�븿
			// check�씪�뒗 �븿�닔瑜� 留뚮뱾�뿀�쓬 �븯�떒 �솗�씤
			if (check(input) && input.length() == 4) {
				
				// 鍮꾧탳瑜� �쐞�빐�꽌 誘몃━ �깮�꽦�맂 �옖�뜡 �뒪�듃留곸쓣 �굹�닠�꽌 �꽔�뼱以� randArr怨�
				// �엯�젰�맂 媛믪쓣 �굹�닠�꽌 �꽔�뼱以� inputArr�쓣 �깮�꽦�빐以�
				// �씠嫄� 諛섎났臾� 諛뽰쑝濡� 鍮쇰넄�룄 �릺寃좊떎
				String[] randArr = new String[4];
				String[] inputArr = new String[4];

				// �깮�꽦�맂 諛곗뿴�쓣 珥덇린�솕�빐二쇰뒗 �옉�뾽 i遺��꽣 i+1源뚯��씤�뜲 -1�씠�땲源� 寃곌뎅 i留�, 
				// 利� �씤�뜳�뒪蹂� �븳湲��옄留� �븯�굹�뵫 ���옣�븯�뒗 媛쒕뀗
				// �몮�떎 String�씠�땲源� split("")�쑝濡� �빐以섎룄 �맂�떎
				for (int i = 0; i < 4; i++) {
					randArr[i] = randStr.substring(i, i + 1);
					inputArr[i] = input.substring(i, i + 1);
				} // end of for

				// �슂湲곌� 鍮꾧탳瑜� �쐞�븳 �씠以� for臾�
				// 泥� 踰덉㎏ for臾몄� 珥� 湲��옄 �닔留뚰겮 諛섎났�쓣 �룎湲곗쐞�븳 �젣�뼱�룷�씤�듃 j
				for (int j = 0; j < 4; j++) { // 4瑜� inputArr.length濡� �옟�븘以섎룄 �맂�떎
					// �몢 踰덉㎏ for臾몄�  �엯�젰諛쏆� 湲��옄留뚰겮 �룎硫댁꽌 湲곗� �닔�옉 鍮꾧탳�븯湲� �쐞�븳 �젣�뼱�룷�씤�듃 k
					for (int k = 0; k < 4; k++) { // �긽�룞
						// k�� j媛� 媛숈쓣�븣 利� �씤�뜳�뒪媛� 媛숈쑝硫댁꽌 �븻�뱶 議곌굔 �쑝濡� �빐�떦 �씤�뜳�뒪�쓽 媛믪씠 媛숈�寃쎌슦�뿉
						if (k == j && randArr[j].equals(inputArr[k])) {
							bulls++; // 遺덉뒪�씪�뒗 蹂��닔�뿉 1�쓣 �뜑�빐二쇨퀬
							break; // �빐�떦 諛섎났臾�, 利� k瑜� �굹���꽌 j濡쒓컧 �빐�떦 �씤�뜳�뒪�뒗 �뜑 鍮꾧탳�븷 �븘�슂媛� �뾾�쑝�땲源�
						} else if (randArr[j].equals(inputArr[k])) { // �씤�뜳�뒪媛� 媛숈� 寃쎌슦媛� �븘�땲�씪硫� �뿬湲곗��꽌 媛숈� 媛믪씠 �엳�뒗吏� �솗�씤
							cows++; // �엳�쑝硫� 媛믪� �엳�꽕 cows 蹂��닔 +1
							break; // �긽�룞
						}
					} // end of for
				} // end of for
				totalCount++;
			} else if ("�븘�씠怨�".equals(input)) { // 移섑똿
				System.out.println(randStr);
				continue; // 諛섎났怨꾩냽 �뿬湲곗꽌�뒗 j
			}else {
				System.out.println("以묐났�쓣 �뿀�슜�븯吏� �븡�뒗 �꽕�옄由� �닽�옄媛� �엯�젰");
				continue;
			} // end of if
			
			// �봽由고듃 媛믩뱾 �젣�뼱�븯湲�
			// �뿬湲곗꽌 �젙�떟�씤吏� �븘�땶吏� 泥댄겕�븿 �빀移섎젮�땲源� 蹂닿린 遺덊렪�빐�꽌
			// totalCount媛� 10�씤寃쎌슦 gameover �삉�뒗 bulls媛� 4�씤寃쎌슦�뿉�뒗 �젙�떟�씠湲곕븣臾몄뿉
			// �씪�떒 硫덉땄 媛쒕뀗�쑝濡� if臾� �뱾�뼱�샂
			if (totalCount == 10 || bulls == 4) {
				if (bulls == 4) { // �젙�떟�씤寃쎌슦
					System.out.println("�젙-�떟");
				} else {
					System.out.println("GAME OVER"); // �젙�떟�뿉 �씠猷⑥� 紐삵븯怨� count媛� 10�씠�뤌踰꾨┛寃쎌슦 
				} // �쐞�쓽 �몢 寃쎌슦 紐⑤몢 �떎�떆 �븘�옒�쓽 while臾몄쓣 ��寃뚮맖 

				int temp = 0; // while臾� �젣�뼱瑜� �쐞�빐�꽌 temp瑜� �몺 if臾몄쓽 i �뿭�븷
				System.out.println("�븳�뙋 �뜑?");
				do {
					temp++; // �뱾�뼱�삤�옄留덉옄 1 移댁슫�듃
					System.out.print("寃뚯엫�쓣 怨꾩냽 吏꾪뻾�븯湲� �쐞�빐�꽌�뒗 1�쓣 �븘�땲硫� 0�쓣 �엯�젰�븯�꽭�슂 : ");
					int checker = Integer.parseInt(br.readLine());
					if (checker == 0) { // �엯�젰媛믪쓣 checker濡� �솗�씤 
						return; // 紐⑤뱺 �븿�닔瑜� �걹�깂 �뿬湲곗꽌 
					} else if (checker == 1) { // �긽�룞
						totalCount = 0; // �뿬湲곗꽌 totalCount瑜� 0�쑝濡� 珥덇린�솕�빐以�
						break; // 諛섎났臾몄쑝濡� �룎�븘媛�湲곕븣臾몄뿉 �씠 �긽�쐞 諛섎났臾몄씤 �쟾泥� while臾몄쓽 泥섏쓬�쑝濡� �룎�븘媛�
					} else {
						System.out.println("0�삉�뒗 1�쓣 �엯�젰�빐二쇱꽭�슂");
						continue; // �빐�떦 諛섎났臾몄쓽 泥섏쓬�쑝濡� �룎�븘媛� temp(移댁슫�꽣)�뒗 ++�릺�뒗寃� �솗�씤
					}
				} while (temp < 5); // �뼹留뚰겮 �쓽�궗瑜� 臾쇱뼱蹂쇨퉴 �븯�떎媛� 5踰덉쑝濡� �걹�깂
			
			} else if(totalCount!=0) { // totalCount媛� 0�씠 �븘�땶寃쎌슦, 利� �젣��濡� �엯�젰媛믪쓣 諛쏆븘�꽌
				// �씠�긽�쓽 濡쒖쭅�씠 �룎�븘媛� 寃쎌슦�뿉留� �븘�옒�쓽 �뙋�젙�쓣 �봽由고듃�빐以�
				System.out.printf("�뙋�젙: %dB%dC, 諛섎났�슏�닔: %d%n", bulls, cows, totalCount);
			} // end of if
		} while (true); // end of while
	} // end of main

	public static boolean check(String str) {
		// check瑜� �쐞�빐�꽌 boolean媛믪쓣 諭됰뒗 �뒪�깭�떛�븿�닔瑜� �깮�꽦�뻽�쓬
		Pattern p = Pattern.compile("^[0-9]"); // �뙣�꽩�겢�옒�뒪�쓽 而댄뙆�씪 硫붿꽌�뱶瑜� �궗�슜�빐�꽌 �젙洹쒖떇�쓣 而댄뙆�씪�빐以�
		Matcher m = p.matcher(str);
		return m.find(); // boolean媛믪쓣 return�빐二쇰뒗 �븿�닔 
		// �뜑 媛꾨떒�븳 �궗�슜�씠 �엳�뜕�뜲 �븘吏� �븰�뒿 誘몄셿
	}
} // end of BullsAndCows
