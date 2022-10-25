package listas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class atv02 {


    public static final int tabu = 25;
    public static final int barcos =3;
    public static  char[][]tabuleiro;
    //X= linha Y= coluna//
    public static void inicializarTabuleiro(){
        tabuleiro = new char[tabu][tabu];
        for(int X=0 ; X < tabu; X++ )
            for(int Y=0 ; Y < tabu ; Y++ )
                tabuleiro[X][Y]=0;
        System.out.println("inicializando tabuleiro\n...........\n.............\n...............\no jogo comecou!!");
    }

    public static void imprimirTabuleiro(){
        for (int l =1; l<=tabu;l++){
            System.out.print("\t"+(l));

        }
        System.out.print("\n");

            for(int X=0 ; X < tabu ; X++ ){
                System.out.print(X+1);
                for(int Y=0 ; Y < tabu ; Y++ ){
                    if(tabuleiro[X][Y]==0){
                        System.out.print("\t"+"~");
                    }else if(tabuleiro[X][Y]==1){
                        System.out.print("\t"+"*");
                    }else if(tabuleiro[X][Y]==2){
                        System.out.print("\t"+"X");
                    }

                }
                System.out.println();
            }

        }

    public static void main(String[] args) {

        inicializarTabuleiro();
        imprimirTabuleiro();

    }}