package codeTest.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class JollyJumpers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int[] inputArr = Arrays.stream(br.readLine().split(" ")).sorted(Comparator.reverseOrder()).mapToInt((value) -> Integer.parseInt(value)).toArray();

            Arrays.stream(inputArr).forEach(System.out::println);
    
            Boolean checker = false;
            for(int i = 0; i < inputArr.length-1; i++) {
                if (inputArr[i] - inputArr [i+1] != 1) {
                   System.out.println("d");
                   checker = false;
                   break;
                } else {
                    checker = true;
                }
            }
            System.out.println(checker?"Jolly":"Not Jolly");
            System.out.println("끝내려면 0 아니면 아무 숫자나");
            int triger = Integer.parseInt(br.readLine());
            if(triger==0) {return;} 
        }

    }
}
