package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import static java.lang.Math.*;

public class Snap {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		int check = st.countTokens();
		List<String> al = new ArrayList<>();		
		int rand = (int)(Math.random()*100)+1; // 확실하지 않음 맞나?
		// int rand = 0;

		while(st.hasMoreTokens()) {
			al.add(st.nextToken().trim());
		}
		
		System.out.println("ArrayList : "+al);
		
		int ori = al.size();
		int idx = 0;

		if (check%2 == 0){ // 짝수
			for(int i = 0; i<ori/2; i++) {
				idx = (int)(random()*al.size());
				al.remove(idx);
			} 
			
		} else { // 홀수
			int controll = rand<=50?ori/2+1:ori/2; // 범위 조절
			for(int i = 0; i<controll; i++) {
				idx = (int)(random()*al.size()); // 사이즈가 계속 줄어드니까 이 안에 있어야함
				al.remove(idx);
			}
		}
		
		System.out.print("SanpList : "+al);
	}
}
