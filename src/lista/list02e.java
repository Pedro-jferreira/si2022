package lista;

public class list02e {
    public static void main(String[] args) {
        float[]w = {-4,2,3,4,12,6,7,8,9};
        int i;
        float maior = w[0], menor = w[0];

        for (i=0; i<9; i++){
        if (w[i] > maior){
            maior= w[i];}
        if (w[i] < menor){
            menor= w[i];}
        }
        System.out.println(maior);
        System.out.println(menor);


    }
}

