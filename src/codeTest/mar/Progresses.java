package codeTest.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Progresses {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 진행률
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] progresses = new int[st.countTokens()];
        for(int i= 0; i<progresses.length; i++){
           progresses[i] = 100-Integer.parseInt(st.nextToken());
        }

        // 작업속도
        st = new StringTokenizer(br.readLine());
        Float[] speed = new Float[st.countTokens()];
        for(int i= 0; i<speed.length; i++){
            speed[i] = Float.valueOf(st.nextToken());
        }

        // 필요한 예상 작업 시간
        int[] needed = new int[speed.length];
        for(int i = 0; i<progresses.length; i++){
            // System.out.println(progresses[i]/speed[i]);
            needed[i] = (int)(Math.ceil(progresses[i]/speed[i]));
        }
        
        int count = 1;
        boolean test = true;
        List<Integer> result = new ArrayList<>();
        int checker = needed[0];
        for(int i=1; i<needed.length; i++){
            if(checker >= needed[i]){
                count++;
                test = false;
            } else {
                checker = needed[i];
                // System.out.println(checker);
                test = true;
            }

            if(test){
                result.add(count);
                // System.out.println(i+" "+count);
                count=1;
            }

            if(i==needed.length-1){
                // System.out.println("마지막?"+count);
                result.add(count);
            }
        } 
    
        result.forEach(System.out::println);
    }

    public static void solution() {

    }
}
