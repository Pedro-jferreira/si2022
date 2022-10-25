package lista;

import java.util.Random;

public class list0504 {
    public static void main(String[] args) {
        Random scan = new Random();
        int[][]pj = new int[3][10];
        int i,j;

        for (i = 0; i < 3; i++){
            for (j = 0; j < 10; j++){
                pj[i][j]= scan.nextInt(8)+1;
            }
        }

        for (i = 0; i < 3; i++){
            for(j =0; j < 10; j++){
                System.out.print( pj[i][j]+"     ");
            }
            System.out.print("\n");

        }
    }
}
