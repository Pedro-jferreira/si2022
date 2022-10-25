package atividades;
import java.io.File;
import java.util.Scanner;
public class LeituraArquivosDeitelExemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome do arquivo ou diretório:");
        analyzePath(input.nextLine());

    }
    public static void analyzePath(String path){
        File name = new File(path);
        if(name.exists()){
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    name.getName(), "exists ",
                    (name.isFile() ? "is a file" : "is not a file"),
                    (name.isDirectory() ? "is a directory" : "is not a directory"),
                    (name.isAbsolute() ? "is a absolute path" : "is not a absolute path"),
                    "Last modified: ", name.lastModified(),
                    "Length: ", name.length(),
                    "Path:", name.getPath(),
                    "Absolute Path:" , name.getAbsolutePath(),
                    "Parent:", name.getParent());
            if(name.isDirectory()){
                String[] directory = name.list();
                System.out.println("\n\n Quantidade de itens: " + directory.length);
                Scanner input = new Scanner(System.in);
                String dados = "";
                System.out.println("digite o tipo de arquivo que voce quer encontrar");
                dados = input.next();
                System.out.println("\n\n Directory contents:\n");

                int[] count = new int[2];
                for(String directoryName : directory){
                    if(directoryName.contains(dados))
                        count[0]++;

                }
                System.out.printf("Quantidade de arquivos baixados em %s: %d",dados,
                        count[0]);

            }//fim do if isDirectory
        }//fim do if externo exists
        else{ //se não for arquivo ou diretório, gera uma mensagem de erro:
            System.out.printf("%s %s", path, "does not exists.");
        }//fim do else
    }//fim do método

}//fuim da classe