package codeTest.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Snap {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		
		ArrayList al = new ArrayList();		
		
		while(st.hasMoreTokens()) {
			al.add(st.nextToken().trim());
		}
		
		System.out.println("ArrayList : "+al);
		
		int ori = al.size();
		
		for(int i = 0; i<ori/2; i++) {
			int idx = (int)(Math.random()*al.size());
			al.remove(idx);
		}
		
		System.out.println("SanpList : "+al);
	}
}
