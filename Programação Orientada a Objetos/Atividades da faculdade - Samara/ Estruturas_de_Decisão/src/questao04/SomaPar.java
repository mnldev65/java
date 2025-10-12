/*Desenvolva um programa que leia seis números inteiros e mostre a 
soma apenas daqueles que forem pares. Se o valor digitado for ímpar, 
desconsidere-o*/

package questao04;

import java.util.Scanner;

public class SomaPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Iremos mostrar somente a soma de números pares!");

        int soma = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um valor inteiro: ");
            while (!ler.hasNextInt()) {
                System.out.print("Entrada inválida.\nDigite um inteiro: ");
                ler.next();
            }
            int n = ler.nextInt();
            if (n % 2 == 0) {
                soma += n;
            }
        }

        System.out.println("Soma dos pares: " + soma);
    }
}