package estudodirigido;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class atividade2
{
    static File arqlogins = new File("C:\\Users\\pedro\\IdeaProjects\\si2022\\Segundo Periodo\\src\\estudodirigido\\login.txt");
    static File arqsenhas = new File("C:\\Users\\pedro\\IdeaProjects\\si2022\\Segundo Periodo\\src\\estudodirigido\\senha.txt");
    static FileWriter logins; static
    {
        try
        {
            logins = new FileWriter(arqlogins,true);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    static FileWriter senhas; static
    {
        try
        {
            senhas = new FileWriter(arqsenhas,true);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    static PrintWriter gravarlogins = new PrintWriter(logins);
    static PrintWriter gravarsenhas = new PrintWriter(senhas);
    static FileReader lerlogins; static
    {
        try
        {
            lerlogins = new FileReader(arqlogins);
        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
    static FileReader lersenhas; static
    {
        try
        {
            lersenhas = new FileReader(arqsenhas);
        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
    static String user,senha;
    static boolean found,comfirme;
/*    public static void verificarseoarqexist(){

        try
        {
            if (!arqlogins.exists())
            {
                arqlogins.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
    public static void MensagemdeErro(){
        JOptionPane.showMessageDialog(null, """
                         usuario invalido
                     atente- se aos requisitos""", "erro!!",JOptionPane.INFORMATION_MESSAGE);

    }    public static void MensagemdeErro2(){
        JOptionPane.showMessageDialog(null, """
                         senha invalida
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
     public static boolean VerificaodeLogin(String user)
     {
             Pattern pattern = Pattern.compile("^[A-z_].(?!.*[\\s]).(?!.*[\\p{Punct}&&[^_]]).(?=\\w)");
             Matcher matcher = pattern.matcher(user);
             found = matcher.find();
             boolean x = false;

             if (!getLerarquivo1()&&found)
             {return comfirme = true;
             } else {MensagemdeErro();}
         return x;
     }

    public static boolean getLerarquivo1() {
        boolean y=false;
        Scanner ler = new Scanner(lerlogins);
        while (ler.hasNext())
        {
            String x = ler.nextLine();
            if (x.equals(user))
            {
                y=true;
                JOptionPane.showMessageDialog(null, """
                        esse usuario ja existe!
                        digite um novo nome de usuario""","erro",JOptionPane.INFORMATION_MESSAGE);
                CadastrodeLogin();

            }
        }
        return y;
    }    public static boolean getLerarquivo2() {
        boolean y=false;

            if (senha.equals(user))
            {
                y=true;
                JOptionPane.showMessageDialog(null, """
                        senha é igual usuario!
                        digite uma senha diferente""","erro",JOptionPane.INFORMATION_MESSAGE);

            }

        return y;
    }
    public static void CadastrarSenha(){

        if (comfirme)
        {        senha = JOptionPane.showInputDialog(null, """
            sua senha deve conter:
                -minimo de 8 digitos e maximo de 16 digitos
                -deve incluir pelo menos um numero e 2 letras
                -deve incluir pelo menos uma letra maiuscula e uma minuscula
                -pode conter caracteres especiais
                -nao pode conter numeros em sequencia
                -não pode conter espaco em branco
                
                digite sua senha:
                """, "cadastrar senha",JOptionPane.QUESTION_MESSAGE);
            VerificaodeSenha(senha);
        }else MensagemdeErro2();}


    private static void VerificaodeSenha(String senha)
    {
        Pattern pattern = Pattern.compile("(?=.+[a-z]).(?=.+[A-Z]).(?=.+[0-9]).(?!.*([1-9]+)\1{1,}).(?!.*[\s]).{4,12}");
        Matcher matcher = pattern.matcher(senha);
        found = matcher.find();


        if (senha.length() >=8 && senha.length()<= 16 && !getLerarquivo2()&&found)
        {
            setGravarLoginseSenhas();
        } else MensagemdeErro2();
    }
    public static void setGravarLoginseSenhas(){
        gravarlogins.println(user);
        gravarlogins.flush();
        gravarsenhas.println(senha);
        gravarsenhas.flush();
        JOptionPane.showMessageDialog(null,"usuario cadastrado com sucesso!!!!!!!","cadastrado com sucesso!!!",JOptionPane.INFORMATION_MESSAGE);
        comfirme=false;
    }


    public static void main(String[] args) throws IOException {
        while (true) {
            CadastrodeLogin();
            while (comfirme) {
                CadastrarSenha();
            }
        }
    }}
