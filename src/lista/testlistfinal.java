package lista;

import java.util.Arrays;
import java.util.Random;

public class testlistfinal{
    public static void main(String[] args) {
        Random d = new Random();

        int[][]w = new int[8][8];


        for (int i = 0; i < 8 ; i ++){
            for (int j = 0 ; j<8; j++){
                w[i][0] = d.nextInt(1+1);
                w[i][j] = d.nextInt(1+2);
                System.out.println(Arrays.deepToString(w));
            }
        }
    }
}
