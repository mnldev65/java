/*Criar um programa que calcule a média de salários de  4 
funcionários de uma empresa, pedindo ao usuário os seus salários, e 
devolvendo a média salarial. */

package questao09;
import java.util.Scanner;
public class MediaSalarial{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int quantidade = 4;

        String[] nomes = new String[quantidade];
        double[] salarios = new double[quantidade];

        System.out.println("Vamos fazer a média salarial da empresa!");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("\nDigite seu nome: ", i + 1);
            nomes[i] = ler.nextLine();

            System.out.printf("Insira seu salario: ", i + 1);
            salarios[i] = ler.nextDouble();
            ler.nextLine();

        }
        double soma = 0;
        for (double salario : salarios) {
            soma+=salario;
        }

        double media = soma/quantidade;

        System.out.println("\nResumo dos salários:");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%s: R$ %.2f%n", nomes[i], salarios[i]);
        }

        System.out.printf("\nA média salarial é: R$ %.2f%n", media);
    }
}