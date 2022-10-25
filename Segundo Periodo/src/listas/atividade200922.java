package listas;

import java.util.Scanner;

public class atividade200922 {
    static Scanner input = new Scanner(System.in);
    static String nome1,nome2,genero;
    public static void main(String[] args) {
        solicitarnomes(nome1, nome2);solicitargenero(genero);
        processo(genero,nome1,nome2);
    }
    public static void solicitarnomes(String n1 ,String n2){

        System.out.println("digite o nome do pai");
        nome1 = input.next();
        System.out.println("digite o nome da mae");
        nome2 = input.next();

    }
    public static void solicitargenero(String x){

        System.out.println("digite o genero usando m para masculino \n f para feminino \ne n para neutro");
        genero = input.next();
    }
    public  static void processo(String x,String n1, String n2){
        switch (x){
            case "m"-> System.out.println(n1.substring(0,3)+n2.substring(0,3));
            case "f"-> System.out.println(n2.substring(0,3)+ n1.substring(0,3));

        }

    }
}
