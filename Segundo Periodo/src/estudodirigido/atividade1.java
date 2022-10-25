package estudodirigido;
import javax.swing.*;
import java.util.Random;

public class atividade1
{
    static Random rand = new Random();
    static StringBuilder nome,embaralhado=new StringBuilder();
    public static void solicitarNome()
    {
        nome= new StringBuilder((JOptionPane.showInputDialog(null, "digite o seu nome", "pergunta",
                JOptionPane.QUESTION_MESSAGE)));
    }
    public static void magicaNasPalavras(String  nome)
    {
        for (char embaralhar : nome.toCharArray())
        {
            if (rand.nextBoolean()) embaralhado = embaralhado.append(Character.toUpperCase(embaralhar));
            else embaralhado = embaralhado.append(Character.toLowerCase(embaralhar));
        }
        JOptionPane.showMessageDialog(null, embaralhado,"aleatorizando",JOptionPane.INFORMATION_MESSAGE);
        solicitarNome();
    }
    public static void main(String[] args)
    {
            solicitarNome();
            magicaNasPalavras(String.valueOf(nome));
    }
}