/*Calcule a média de 3 notas e diga se o aluno foi aprovado ou 
reprovado. */

package questao03;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Vamos fazer a média de suas notas!");

        System.out.println("insira a primeira nota: ");
        float n1 = read.nextFloat();

        System.out.println("insira a segunda nota: ");
        float n2 = read.nextFloat();

        System.out.println("insira a terceira nota: ");
        float n3 = read.nextFloat();


        float media = (n1 + n2 + n3)/3;
        if (media >= 7) {
            System.out.printf("Parabéns, voçê passou de ano com a media de %.2f", media);
        }
        else if (media >= 4 && media < 7) {
            System.out.printf("Infelizmente voçê ficou de recuperação, porque ficou com a média de %.2f",media);
        }
        else{
            System.out.println("Infelizmente, voçê reprovou! Tente outra vez");
        }
    }
}
