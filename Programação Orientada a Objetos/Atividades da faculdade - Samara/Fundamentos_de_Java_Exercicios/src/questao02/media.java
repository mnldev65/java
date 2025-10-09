/*Crie uma função que leia dois números e retorne a média entre 
eles. Logo após, vocês vão utilizar a função e exibir na tela o resultado 
dela.  */

package questao02;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Vamos fazer a média de dois números!");

        System.out.println("insira um número: ");
        float n1 = read.nextFloat();

        System.out.println("insira um número: ");
        float n2 = read.nextFloat();

        float media = (n1 + n2)/2;
        System.out.printf("O valor da média entre os dois é de %.2f", media);
    }
}
