package lista;

import javax.swing.*;

public class list05 {
    public static void main(String[] args) {
        int[]n = new int[10];

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o  numero"));
        }
        for (int i = 0; i < n.length; i++) {
            if(ehPrimo(n[i]))
                System.out.println(n[i] + " é primo. Posicao no vetor: " + i);}
    }

    private static boolean ehPrimo(int numero){
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

}

