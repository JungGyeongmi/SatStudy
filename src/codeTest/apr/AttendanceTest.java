package codeTest.apr;

import java.util.Arrays;

public class AttendanceTest {
    public static void main(String[] args) {
        
        String test = "fjwhrwehrjwhjewhrr";
        String testValue = "fjwhrwehrjwhjewhr";

        String[] testArr = {test, testValue};
        for(String result : testArr) {System.out.println(result);}

        Arrays.sort(testArr);
        
        for(String result : testArr) {System.out.println(result);}
    }
}
