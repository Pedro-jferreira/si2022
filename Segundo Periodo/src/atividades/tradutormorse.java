package atividades;
import java.io.*;
import java.util.Scanner;
public class tradutormorse
 {
    static FileWriter arq; static
    {
        try
        {
            arq = new FileWriter("C:\\Users\\pedro\\Downloads\\texto.txt", true);
        } catch (IOException e)
        {
            System.out.println("problema detectado, entre em contato com o desenvolvedor");
            throw new RuntimeException(e);
        }
    }
    static PrintWriter gravarArq = new PrintWriter(arq);
    String[] AlfabetoMorse =
            {
                    "/", ".-", "-...", "-.-.",  "-..", ".",  "..-.", "--.", "....",
                    "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                    ".-.", "...", "-", "..-", "...-",".--", "-..-", "-.--", "--.."
            };
    String[] Alfabetobr =
            {
                    " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                    "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            };
    String traduzido = "";
    public static void opcao1()
    {
        tradutormorse inicializartradutor = new tradutormorse();
        Scanner input = new Scanner(System.in);
        String traducao;

        System.out.println("digite o texto que voce quer traduzir para código morse:");
        String line = input.nextLine();

        traducao = inicializartradutor.traduzir_PtBrParaMorse(line);
        System.out.println("aqui esta seu codigo morse:\n" + traducao);

        gravarArq.println("\nem protugues: " + line + "\npara morse: " + traducao);
        gravarArq.flush();
    }
    public String traduzir_PtBrParaMorse(String texto)
    {
        String maiuscula = texto.toUpperCase();
        String palavras;

        for (int i = 1; i <= texto.length(); i++)
        {
            palavras = maiuscula.substring(i - 1, i);

            for (int j = 0; j < Alfabetobr.length; j++)
            {
                if (palavras.equals(Alfabetobr[j]))
                {
                    traduzido = "%s%s ".formatted(traduzido, AlfabetoMorse[j]);
                }
            }
        }
        return traduzido;
    }
    public static void opcao2()
    {
        tradutormorse inicializartradutor = new tradutormorse();
        Scanner input = new Scanner(System.in);
        String traducao;

        System.out.println("digite o codigo morse que voce quer traduzir para portugues");
        String line = input.nextLine();

        traducao = inicializartradutor.traduzir_MorseParaPTBR(line);

        System.out.println("aqui esta seu codigo morse:\n" + traducao);

        gravarArq.println("\nem morse: " + line + "\npara portugues: " + traducao);
        gravarArq.flush();
    }
    public String traduzir_MorseParaPTBR(String texto)
    {
        String[] palavras = texto.split(" ");

        for (String palavra : palavras)
        {
            for (int j = 0; j < AlfabetoMorse.length; j++)
            {
                if (palavra.equals(AlfabetoMorse[j]))
                {
                    traduzido = "%s%s".formatted(traduzido, Alfabetobr[j]);
                }
            }
        }
        return traduzido;
    }
    public static void tradutor() throws IOException
    {
        Scanner input = new Scanner(System.in);
        String escolha = "";

        while (!(escolha.equals("1") || escolha.equals("2")))
        {
            System.out.print("""
                    +------------------------------------------------------+
                    | digite (1) para codificar de portugues para morse    |
                    | digite (2) para traduzir para portugues              |
                    | digite (3) para sair do programa                     |
                    +------------------------------------------------------+""");
            escolha = input.next();

            switch (escolha) {
                case "1" ->
                {
                    opcao1();
                    tradutor();
                }
                case "2" ->
                {
                    opcao2();
                    tradutor();
                }
                case "3" ->
                {
                    arq.close();
                    System.out.println("""
                            |--------++++========[{->saindo<-}]========++++--------
                            +------------------------------------------------------+""");
                    System.exit(0);
                }
                default -> System.out.println("| Erro:(    tente novamente!!!                         |");
            }
        }
    }
    public static void main(String[] args) throws IOException
    {
        System.out.println("""
                +------------------------------------------------------+
                |   Bem vindo ao tradutor de morse -- --- .-. ... .    |""");
        tradutor();
    }
 }