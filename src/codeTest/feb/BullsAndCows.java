package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// import static java.lang.Math.*;

public class BullsAndCows {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String randStr = "";
		while (randStr.length() < 4) {
			String temp = Integer.toString((int) (Math.random() * 9));
			if (!randStr.contains(temp)) {
				randStr += temp;
			}
		}

		int bulls = 0;
		int cows = 0;
		int totalCount = 0;
		System.out.println("game start");
		do {
			System.out.print("insert number(4) : ");
			String input = br.readLine();
			bulls = 0;
			cows = 0;
			if (check(input) && input.length() == 4) {
				String[] randArr = new String[4];
				String[] inputArr = new String[4];
				for (int i = 0; i < 4; i++) {
					randArr[i] = randStr.substring(i, i + 1);
					inputArr[i] = input.substring(i, i + 1);
				} // end of for

				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {

						if (k == j && randArr[j].equals(inputArr[k])) {
							bulls++;
							break;
						} else if (randArr[j].equals(inputArr[k])) {
							cows++;
							break;
						}
					} // end of for
				} // end of for
				totalCount++;
			} else if ("open".equals(input)) { // 移섑똿
				System.out.println(randStr);
				continue; // 諛섎났怨꾩냽 �뿬湲곗꽌�뒗 j
			} else {
				System.out.println("형식에 맞는 수를 입력해주세요");
				continue;
			} // end of if

			// �봽由고듃 媛믩뱾 �젣�뼱�븯湲�
			// �뿬湲곗꽌 �젙�떟�씤吏� �븘�땶吏� 泥댄겕�븿 �빀移섎젮�땲源� 蹂닿린 遺덊렪�빐�꽌
			// totalCount媛� 10�씤寃쎌슦 gameover �삉�뒗 bulls媛� 4�씤寃쎌슦�뿉�뒗 �젙�떟�씠湲곕븣臾몄뿉
			// �씪�떒 硫덉땄 媛쒕뀗�쑝濡� if臾� �뱾�뼱�샂
			if (totalCount == 10 || bulls == 4) {
				if (bulls == 4) { // �젙�떟�씤寃쎌슦
					System.out.println("clear");
				} else {
					System.out.println("GAME OVER"); // �젙�떟�뿉 �씠猷⑥� 紐삵븯怨� count媛� 10�씠�뤌踰꾨┛寃쎌슦
				} // �쐞�쓽 �몢 寃쎌슦 紐⑤몢 �떎�떆 �븘�옒�쓽 while臾몄쓣 ��寃뚮맖

				int temp = 0; // while臾� �젣�뼱瑜� �쐞�빐�꽌 temp瑜� �몺 if臾몄쓽 i �뿭�븷
				System.out.println("again?");
				do {
					temp++; // �뱾�뼱�삤�옄留덉옄 1 移댁슫�듃
					System.out.print("restart 1, end  0 : ");
					int checker = Integer.parseInt(br.readLine());
					if (checker == 0) { // �엯�젰媛믪쓣 checker濡� �솗�씤
						return; // 紐⑤뱺 �븿�닔瑜� �걹�깂 �뿬湲곗꽌
					} else if (checker == 1) {
						totalCount = 0;
						break;
					} else {
						System.out.println("insert 1 or 0");
						continue;
					}
				} while (temp < 5);

			} else if (totalCount != 0) {
				System.out.printf("result : %dB%dC, totalcount: %d%n", bulls, cows, totalCount);
			} // end of if
		} while (true); // end of while
	} // end of main

	public static boolean check(String str) {

		Pattern p = Pattern.compile("^[0-9]");
		Matcher m = p.matcher(str);
		return m.find();
	}
} // end of BullsAndCows
