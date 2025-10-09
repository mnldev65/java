/*Crie uma função que vai ler um número e dizer se é positivo, 
negativo ou neutro */

package questao04;

import java.util.Scanner;

public class Ler_num {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos analisar se seu número é positivo ou negativo!");

        System.out.println("Insira um valor: ");
        float numero = ler.nextFloat();

        if (numero >=1) {
            System.out.printf("Seu número escolhido é positivo, pois o número %.2f é maior que 1",numero);
        }
        else if (numero == 0) {
            System.out.println("\nSeu número é neutro, pois seu valor é zero");
        }
        else{
            System.out.println("\nSeu número é negativo, pois ele é abaixo de zero");
        }
    }
}
