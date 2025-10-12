/*Escreva um programa para ler 5 valores inteiros. Caso um valor 
digitado seja menor que 10, deverá ser exibida a mensagem “Valor 
Menor que 10”. */

package questao02;

import java.util.Scanner;

public class ValoresInteiros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva cinco valores inteiros: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira um valor: ");
            int n = leitor.nextInt();
            if (n < 10) {
                System.out.println("Esse valor é menor que 10\n");
            }    
        }
    }
}
