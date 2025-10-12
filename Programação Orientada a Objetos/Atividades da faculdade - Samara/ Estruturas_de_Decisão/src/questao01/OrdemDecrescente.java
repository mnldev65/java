/*Escreva um programa que receba um número do usuário e exiba 
todos os números menores que o número digitado em ordem 
decrescente.*/

package questao01;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner view = new Scanner(System.in);
        System.out.println("Vamos analisar um número em oredem decrescente!");
        System.out.print("Digite um número inteiro: ");
        int n = view.nextInt();

        
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
