/*Crie um programa que armazene as notas de 10 alunos
recebidas pelo usuário. O programa deve retornar a maior nota
em tela.*/

package questao01;

import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        final int qtde = 10;

        String[] nomes = new String[qtde];
        double[] notas = new double[qtde];

        System.out.println("--- Cadastro de Notas de " + qtde + " Alunos ---");
        for (int i = 0; i < qtde; i++) {
            System.out.printf("\n--- Aluno %d ---\n", i + 1);
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = leitor.nextLine();

            System.out.printf("Digite a nota de " + nomes[i] + ": ", i + 1);
            if (leitor.hasNextDouble()) {
                notas[i] = leitor.nextDouble();
                leitor.nextLine();
            }else {
                System.out.println("Entrada inválida");
            }
        }

        double maiorNota = notas[0];
        String alunoMaior = nomes[0];

        for (int i = 0; i < qtde; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                alunoMaior = nomes[i];
            }
        }

        System.out.printf("A maior nota é %.2f e foi obtida por %s.%n", maiorNota, alunoMaior);
    }
}
