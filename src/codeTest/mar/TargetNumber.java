package codeTest.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TargetNumber {

    public static int[] sum;
    public static int target;
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numbersCount = st.countTokens();
        int[] numbers = new int[numbersCount];
        int i = 0;
        while (st.hasMoreTokens()) {
            numbers[i++] = Integer.parseInt(st.nextToken());
        }
        target = Integer.parseInt(br.readLine());
        br.close();
        sum = new int[(int) Math.pow(numbersCount, 2)];
        
        int[] minusNumbers = new int [numbers.length];
        int[] plusNumbers = new int [numbers.length];
       
        for(int j = 0; j<numbers.length;j++) {
            plusNumbers[j] = numbers[j];
            minusNumbers[j] = numbers[j]*(-1);
        }

        int count = 0;

        int sum = 0;
        int checknum =0;
        for(int j=0; j<numbers.length; j++) {
            sum = 0;
            checknum += plusNumbers[j];
            for(int k = j+1; k<numbers.length; k++){
                sum+=checknum+minusNumbers[k];
            }
            if(sum==target) {
                count++;
            }
        }

        checknum = 0;


    }
}
