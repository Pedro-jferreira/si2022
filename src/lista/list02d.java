package lista;

import java.util.Arrays;
import java.util.Random;

public class list02d {
    public static void main(String[] args) {
        int []a =  new int[11];
        int []b =  new int[34];
        Random ale = new Random();
        int i,j;
        float soma = 0;

        for (i= 0; i < 11; i++){
            a[i] = ale.nextInt(100);
            System.out.println("arrays a" + a[i]);

        }
            for (j = 0 ;j <a.length; j++){
                b[j] = a[j];
                b[j]= ale.nextInt(100);
                System.out.println(Arrays.toString(b));
}


        }

    }

