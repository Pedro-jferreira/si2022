package lista;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class list02c {
    public static void main(String[] args) {
         int []c =  new int[100];
        Random ale = new Random();
        int i;
        float soma = 0;

        for (i= 0; i < 100; i++){
            c[i] = ale.nextInt(100);
            System.out.println(c[i]);
        }
        for (i=0; i<100; i++){
            soma += c[i];
            

        }
    System.out.println(soma); }
}
