package listas;

import java.awt.im.spi.InputMethodContext;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class menubtn {
    public static void main(String[] args) {
        imprimirmenu();

    }
    public static void imprimirmenu(){
        String titulo ="|\t*__* Batalha Naval *__*\t |",
                linhas ="|----------------------------|",
                vai = "\n|\t\t  ",volta= "\t\t\t |",
                jogar= "jogar(1)", ajuda="ajuda(2)",creditos="creditos(3)",sair="sair(4)";

        System.out.println(linhas);
        System.out.println(titulo);
            System.out.println(linhas);
            System.out.println( "|\t\t  "+jogar+volta+vai+ajuda+
                    volta+"\n|\t\t"+creditos+"\t\t\t |"+vai+sair+volta);
            System.out.println(linhas);
            controlemenu();


        }
        public static void controlemenu() {
            String selecionarop= "0";
            Scanner input= new Scanner(System.in);

            System.out.println("digite o numero de uma opcao");
            selecionarop = input.next();
            switch (selecionarop) {
                case "1":opcoesdejogo();
                break;
            case "2":textodeajuda();
            break;
                case "3":creditos();
                break;
                case "4":sair();System.exit(0);
                break;
                default:
                    System.out.println("plis no very");


            }

        }

            public static void opcoesdejogo(){
        Scanner input =new Scanner(System.in);
                System.out.println("multiplayer(1)\n vs computador(2)\n\n voltar ao menu inicial(3)"); String op = "0";
                op = input.next();
                switch (op) {
                    case "1":p1xp2();
                        break;
                    case "2":p1xbot();
                        break;
                    case "3":imprimirmenu();
                    default:



                }}
            public static void textodeajuda(){}
            public static void creditos(){}
            public static void sair(){}
            public static void p1xp2(){}
            public static void p1xbot(){}
        }




