package lista;

import java.util.Arrays;

public class list02d {
    public static void main(String[] args) {
        int[]a = {10,20,30,40,50,60,70,80,90,1,2};
        int[]b = new int[34];
        int i;

        for (i= 0; i<34; i++){
            b[i]=a[i];
            System.out.println(Arrays.toString(b));
        }
    }
}
