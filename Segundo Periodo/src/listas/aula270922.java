package listas;

import java.util.Scanner;

public class aula270922 {
    static Scanner input = new Scanner(System.in);
    public static void PedirLetras(){
        System.out.println("voce quer letra maiúscula ou minuscula?"+"\n 1 para maiúsculo 2 para minusculo");
        String resposta = input.next();
        switch (resposta){
            case "1" -> Imprimir_Alfabeto('A', 'Z');
            case "2"-> Imprimir_Alfabeto('a', 'z');
        }
    }
    public static void Imprimir_Alfabeto(char a,char z){
        char ch;
        String th = ",";

        for (ch = a;ch <= z; ch++){
            System.out.print(ch+th);
        }
    }

    public static void main(String[] args) {
        PedirLetras();
    }
}
