/* Leia a idade de uma pessoa e diga se ela pode votar (idade ≥ 16). */

package questao06;

import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Vamos descobrir se voçê pode votar ou não!");
        System.out.print("Insira a sua idade:");
        int idade = ler.nextInt();

        if (idade >= 16) {
            System.out.printf("\nVoçê pode votar, pois possui %d anos", idade);
        }
        else{
            System.out.println("\nInfelizmente voçê não tem a idade desejada");
        }
    }
    
}
