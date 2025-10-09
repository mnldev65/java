/*1. Escreva um programa em Java que leia dois números inteiros e mostre a 
soma, subtração, multiplicação e divisão entre eles. */

package questao01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner view = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num1 = view.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = view.nextDouble();

        double soma = num1+num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.printf("A soma de %.2f + %.2f é igual a %.2f", num1 , num2 , soma);
        System.out.printf("\nA subtração de %.2f - %.2f é igual a %.2f", num1 , num2 , subtracao);
        System.out.printf("\nA multiplicação de %.2f * %.2f é igual a %.2f", num1 , num2 , multiplicacao);
        System.out.printf("\nA divisão de %.2f / %.2f é igual a %.2f", num1 , num2 , divisao);
    }
}
