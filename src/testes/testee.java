package testes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class testee {
    public static void main(String[] args) throws InterruptedException {
        Random aleatorio = new Random();
        int countp = 0;
        int[] numerosAleatorios = new int[10];
        for (int i = 0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = aleatorio.nextInt(-20,20);
        }
        System.out.println(Arrays.toString(numerosAleatorios));
        TimeUnit.SECONDS.sleep(1); //esperar um segundo para a próxima impressãoTimeUnit.SECONDS.sleep(1).

        while (true){
            Scanner ler = new Scanner(System.in);
            System.out.println("\nDigite a opção desejada:");
            System.out.println("1 - Quantidade de números pares e ímpares:");
            System.out.println("2 - Quantidade de números primos:");
            System.out.println("3 - Quantidade de números positivos e negativos:");
            System.out.println("4 - Quantidade de múltiplos de valor escolhido pelo usuário:");
            System.out.println("5 - Maior e menor valor encontrados no vetor:");
            System.out.println("6 - Se existem duplicados, quantos e quais são:");
            System.out.println("7 - Sair do programa.");

            int resposta = ler.nextInt();
            switch (resposta) {
                case 1 -> {
                    System.out.println("Opção 1.");
                    quantidadeNumerosParesImpares(numerosAleatorios);
                }
                case 2 -> {
                    System.out.println("Opção 2.");
                    for (int i = 0; i < numerosAleatorios.length; i++) {
                        if (verificaPrimorapido(numerosAleatorios[i]))
                            System.out.println(numerosAleatorios[i] + " e primo. Posicao no vetor: " + i);
                    }
                }
                case 3 -> System.out.println("Opção 3.");
                case 4 -> System.out.println("Opção 4.");
                case 5 -> System.out.println("Opção 5.");
                case 6 -> System.out.println("Opção 6.");
                case 7 -> {
                    System.out.println("Opção 7.");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
    public static void quantidadeNumerosParesImpares(int[] vetor){
        int qtdPar = 0, qtdImpar = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                qtdPar++;
            } else {
                qtdImpar++;
            }
        }
        System.out.printf("Existem %d números pares e %d números ímpares.", qtdPar, qtdImpar);
    }

        public static boolean verificaPrimorapido(int x){
            if (x <= 1)
                return false;
            if (x == 2 || x == 3)
                return true;
            else{
                for(int j = 2; j <= Math.sqrt(x) ; j++){
                    if( x % j == 0)
                        return false;
                }
                return true;
            }
        }

}
