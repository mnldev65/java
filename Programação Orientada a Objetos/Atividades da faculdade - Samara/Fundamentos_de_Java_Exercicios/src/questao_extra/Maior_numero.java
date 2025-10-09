/*Faça um programa em Java que leia dois números e exiba o maior 
deles. */

package questao_extra;

import java.util.Scanner;

public class Maior_numero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float num1 = ler.nextFloat();

        System.out.println("Digite um número: ");
        float num2 = ler.nextFloat();

        if (num1 > num2) {
            System.out.printf("O maior número escolhido foi %.2f", num1);
        }
        else if (num2 > num1){
            System.out.printf("O maior número escolhido foi %.2f", num2);
        }
        else{
            System.out.printf("Ambos os números escolhidos são iguais");
        }

    }
}
