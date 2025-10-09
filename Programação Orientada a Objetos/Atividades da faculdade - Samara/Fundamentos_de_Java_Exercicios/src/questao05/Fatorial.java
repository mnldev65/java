/*Faça uma função para calcular n! para qualquer n >= 0*/

package questao05;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler_fatorial = new Scanner(System.in);

        System.out.println("Vamos calcular o fatorial do número que voçê escolher");

        System.out.println("Escolha um número inteiro maior que zero");
        int num = ler_fatorial.nextInt();

        if (num > 0) {
            int resultado = 1;
            for (int i = 1; i <= num; i++) {
                resultado*=i;
            }
            System.out.printf("O resultado fatorial foi %d", resultado);
        }
        else{
            System.out.println("\nDado inválido!");
        }
    }
}
