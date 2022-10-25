package listas;

import lista.JogoDaVelha;

import java.util.Scanner;

public class atv01 {

    private final int [][] tabuleiro = new int[3][3];
    private int jogador = 1;

    public boolean jogar(int x, int y) {
        if ((x < 0) || (x > 2) || (y < 0) || (y > 2)) {
            return false;
        }
        if (tabuleiro[x][y] != 0) {
            return false;
        }
        tabuleiro[x][y] = jogador;
        jogador = (jogador == 1) ? 2 : 1;
        return true;
    }

    public int vencedor() {
        for (int j = 0; j < 3; j++) {
            // Testar as linhas
            for (int linha = 0; linha < 3; linha++) {
                boolean fechou = true;
                for (int coluna = 0; coluna < 3; coluna++) {
                    if (tabuleiro[linha][coluna] != j) {
                        fechou = false;
                        break;
                    }
                }
                if (fechou) {
                    return j;
                }
            }
            // Testar as colunas
            for (int coluna = 0; coluna < 3; coluna++) {
                boolean fechou = true;
                for (int linha = 0; linha < 3; linha++) {
                    if (tabuleiro[linha][coluna] != j) {
                        fechou = false;
                        break;
                    }
                }
                if (fechou) {
                    return j;
                }
            }
            // Testar as diagonais
            boolean Fechou = true;
            for (int posicao = 0; posicao < 3; posicao++) {
                if (tabuleiro[posicao][posicao] != j) {
                    Fechou = false;
                    break;
                }
            }
            if (Fechou) {
                return j;
            }
            Fechou = true;
            for (int posicao = 2; posicao >= 0; posicao--) {
                if (tabuleiro[posicao][2 - posicao] != j) {
                    Fechou = false;
                    break;
                }
            }
            if (Fechou) {
                return j;
            }
        }
        boolean empate = true;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha][coluna] == 0) {
                    empate = false;
                    break;
                }
            }
        }
        if (empate) {
            return 3;
        }
        return 0;
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                switch (tabuleiro[linha][coluna]) {
                    case 0 -> out.append("_ ");
                    case 1 -> out.append("O ");
                    case 2 -> out.append("X ");
                }
            }
            out.append("\n");
        }
        return out.toString();
    }


    private void executar() {
        Scanner scan = new Scanner(System.in);
        while (vencedor() == 0) {
            System.out.println(this);
            System.out.println("Jogador: " + jogador);
            System.out.print("linha: ");
            int linha = scan.nextInt();
            System.out.print("coluna: ");
            int coluna = scan.nextInt();
            if (!jogar(linha, coluna)) {
                System.out.println("Jogada invalida, tente novamente...");
            }
        }
        System.out.println(this + " "+this);
        System.out.println("o jogador "+vencedor()+" venceu");
    }

    public static void main(String [] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.executar();
    }
}

