package listas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class atv270922 {
    public static void main(String[] args) throws FileNotFoundException {
        String line1;
        Scanner input = new Scanner(new File("Segundo Periodo/src/listas/file.txt"));
        System.out.println("digite algo");
        line1= input.next();
        line1=line1+input.nextLine();
        System.out.println(line1);
        input.close();

    }
}
