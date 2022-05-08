package codeTest.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Firefighter {
    static String[][] fireArr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int Xlength = Integer.parseInt(st.nextToken());
        int Ylength = Integer.parseInt(st.nextToken());

        fireArr = new String[Xlength][Ylength];

        for (int i = 0; i < Xlength; i++) {
            st = new StringTokenizer(br.readLine(), ".&", true);
            // fireArr[i] = br.readLine().split("");
            System.out.println(st.countTokens());
            for (int j = 0; j < st.countTokens(); j++) {
                String target = st.nextToken();
                fireArr[i][j] = target;
            }
        }

        System.out.println(Arrays.deepToString(fireArr));
        // somebodyHelp(4, 4, 0);
    }

    static void somebodyHelp(int x, int y, int lifepoint) {
        String target = fireArr[x][y];
        System.out.println(x + "," + y + "," + lifepoint + " " + target);

        if (target.equals("&")) {
            System.out.println("도달");
            System.out.println(lifepoint);
            return;
        } else if (target.equals("#")) {
            System.out.println(x + ", " + y + " : 벽");
            return;
        }

        if (y - 1 >= 0 && y - 1 <= fireArr.length - 1) {
            somebodyHelp(x, y - 1, lifepoint + 1);
        }

        // if(y + 1 >= 0 && y + 1 <= fireArr.length-1) {
        // somebodyHelp(x, y+1, lifepoint+1);
        // }

        // if(x - 1 >= 0 && x - 1 <= fireArr.length-1) {
        // somebodyHelp(x - 1 , y, lifepoint+1);
        // }

        // if(x + 1 >= 0 && x + 1 <= fireArr.length-1) {
        // somebodyHelp(x + 1, y, lifepoint+1);
        // }

        return;
    }
}
