/*MÉDIA FATORIAL*/
/*
  Este programa calcula a média aritmética de três números fatoriais.
  Ele solicita ao usuário que digite três números inteiros, calcula o fatorial de cada um deles e encontra a média desses resultados.
*/
import java.util.Scanner;
public class mediaFatorial{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // Um objeto Scanner para ler a entrada do usuário, ou seja, ele é usado para ler o que o usuário digitar
        final int quantidade = 3;
        // Define a quantidade de números a serem processados como uma constante durante o código
        System.out.println("Vamos calcular a média aritimética dos números fatorias que voçê escolher!");
        //imprime uma contextualização para o usuário entender o que acontecerá no codigo

        int [] numeros = new int[quantidade];
        // Declara um array para armazenar os resultados dos fatoriais

        for(int i = 0; i < quantidade; i++){
        // Loop para pedir ao usuário que digite 3 números
        
            System.out.println("Digite um número: ");
            int n = ler.nextInt();

            if(n > 0){
            // Verifica se o número digitado é positivo
                int resultado = 1;
                // Variável para armazenar o resultado do fatorial

                for(int j = 1; j <= n ; j++){
                // Loop para calcular o fatorial do número
                    resultado*=j;
                }
                numeros[i] = resultado;
                // Armazena o resultado do fatorial no array
            }
            else{
                System.out.println("Dado inválido");
                // Caso o número seja inválido (menor ou igual a zero), armazena 0
                numeros[i] = 0;
            }
        }
        int soma = 0;
        /*É uma variável para acumular a soma dos valores dos fatoriais que foram armazenados no vetor numeros*/

        for (int valor : numeros) {
        // Loop aprimorado (for-each) para somar os valores no array
            soma += valor;
        }
        float media = (float) soma / quantidade;
        // Calcula a média, convertendo a soma para float para obter um resultado com casas decimais

        System.out.printf("O valor da média fatorial é: %.2f%n", media);
        // Exibe o resultado da média com duas casas decimais
        System.out.printf("O calculo da média aritimética é: (%d + %d + %d)/3 %n", numeros[0], numeros[1], numeros[2]);
        // Exibe a fórmula do cálculo para o usuário

        ler.close();
        // Fecha o objeto Scanner para liberar recursos
    }
}