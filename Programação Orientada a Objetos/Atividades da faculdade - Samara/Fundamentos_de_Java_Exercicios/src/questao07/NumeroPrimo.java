/*Peça ao usuário um número e diga se ele é primo. Obs: Um número 
primo tem apenas dois divisores (1 e ele mesmo). */

package questao07;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner view = new Scanner(System.in);
        System.out.println("Vamos ver se o número que voçê escolher é primo!");

        System.out.println("Digite um número inteiro:");
        int num = view.nextInt();

        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }

         if (contador == 2) {
            System.out.printf("O número %d é primo, pois tem apenas dois divisores: 1 e ele mesmo.%n", num);
        } else {
            System.out.printf("O número %d não é primo, pois tem %d divisores.%n", num, contador);
        }
    }
}
