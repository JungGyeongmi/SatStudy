package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cipher {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �빐�떦 臾몄옄�뿴�뿉�꽌 �뜑�빐以� 媛믪쓣 int N�쑝濡� 諛쏆쓬
		//int N = 5;
		int N = Integer.parseInt(br.readLine());
		char[] input = br.readLine().toCharArray(); 
		// �엯�젰諛쏆� �븳 以꾩쓣 �씫�뼱�뱾�씠�뒗�뜲 洹멸쾬�쓣 Char ���엯�쓽 �뼱�젅�씠濡� 諛붾줈 蹂��삎�빐�꽌 input諛곗뿴�뿉 ���옣
		
		for(int i = 0; i < input.length; i++) {
			input[i] = (char)(input[i] + N);
			// input 諛곗뿴�쓣 �씤�뜳�떛 �빐二쇰㈃�꽌 �빐�떦 媛믪뿉�꽌 N�쓣 �뜑�빐以�
			// char�삎�깭�뒗 湲곕낯�쟻�쑝濡� int瑜� �뜑�빐二쇰㈃ int�삎�쑝濡� 怨꾩궛�릺�뒗�뜲
			// �씠瑜� �떎�떆 char�삎�쑝濡� 蹂��삎�빐二쇰㈃ 臾몄옄�뿴 媛믪쑝濡� 蹂� �닔 �엳�쓬
			// �븘�뒪�궎肄붾뱶 �벝�븣 �씠�젃寃뚰븿
		}

		// 蹂�寃쎈맂 input char 諛곗뿴�쓣 異쒕젰
		// char 諛곗뿴�� for臾� �룎由ъ� �븡�븘�룄 諛붾줈 臾몄옄�뿴濡� 異쒕젰 媛��뒫�븿
		// 湲곕낯�삎�씠�씪�꽌
		System.out.println(input);
	}
}
