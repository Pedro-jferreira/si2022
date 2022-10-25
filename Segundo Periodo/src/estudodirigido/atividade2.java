package estudodirigido;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class atividade2
{
    static File arquivo = new File("C:\\Users\\pedro\\IdeaProjects\\si2022\\Segundo Periodo\\src\\estudodirigido\\login.txt");
    static FileWriter arq;

    static {
        try {
            arq = new FileWriter(arquivo,true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static PrintWriter gravarArq = new PrintWriter(arq);
    static FileReader lerarquivo;

    static {
        try {
            lerarquivo = new FileReader(arquivo);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static String user;
    static boolean found;
    public static void verificarseoarqexist(){

        try
        {
            if (!arquivo.exists())
            {
                arquivo.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void MensagemdeErro(){
        JOptionPane.showMessageDialog(null, """
                         usuario invalido
                     atente- se aos requisitos""", "erro!!",JOptionPane.INFORMATION_MESSAGE);

    }
     public static void CadastrodeLogin() {
         user = JOptionPane.showInputDialog(null, """
                         -DIGITE SEU NOME DE USUARIO-

                 - come?ar com uma letra ou underline
                 - pode conter apenas letras e numeros e underline
                 - minimo de 8 letrar e maximo de 16
                 - nao pode conter carcterer especial
                 - nao pode conter espacos em branco""","cadastro de login",JOptionPane.QUESTION_MESSAGE);
         if (user.length() >=8 && user.length()<= 16)
         {
             VerificaodeLogin(user);
         }else MensagemdeErro();
     }
     public static void VerificaodeLogin(String user)
     {
             Pattern pattern = Pattern.compile("^[A-z_].(?!.*[\\s]).(?!.*[\\p{Punct}&&[^_]]).(?=\\w)");
             Matcher matcher = pattern.matcher(user);
             found = matcher.find();

             if (!getLerarquivo()&&found)
             {
                 gravarArq.println(user);
                 gravarArq.flush();
                 senha();
             } else MensagemdeErro();
     }

    public static boolean getLerarquivo() {
        boolean y=false;
        Scanner ler = new Scanner(lerarquivo);
        while (ler.hasNext())
        {
            String x = ler.nextLine();
            if (x.equals(user))
            {
                y=true;
                JOptionPane.showMessageDialog(null, """
                        esse usuario ja existe!
                        digite um novo nome de usuario""","erro",JOptionPane.INFORMATION_MESSAGE);

            }
        }
        return y;
    }
    public static void senha(){
        JOptionPane.showInputDialog(null, """
            sua seha deve conter:
                -minimo de 8 digitos e maximo de 16 digitos
                -deve incluir pelo menos um numero e 2 letras
                -deve incluir pelo menos uma letra maiuscula e uma minuscula
                -pode conter caracteres especiais
                -nao pode conter numeros em sequencia
                -não pode conter espaco em branco
                
                digite sua senha:
                """, "cadastrar senha",JOptionPane.QUESTION_MESSAGE);
    }




    public static void main(String[] args) throws IOException {
             while (true) {
                 verificarseoarqexist();
                 CadastrodeLogin();
                 if (found){senha();}
         }}}
