/*MÉDIA FATORIAL*/
/*
  Este programa calcula a média aritmética de três números fatoriais.
  Ele solicita ao usuário que digite três números inteiros, calcula o fatorial de cada um deles e encontra a média desses resultados.
*/
import java.util.Scanner;
public class mediaFatorial{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int quantidade = 3;
        System.out.println("Vamos calcular a média aritimética dos números fatorias que voçê escolher!");

        int [] numeros = new int[quantidade];

        for(int i = 0; i < quantidade; i++){
        
            System.out.println("Digite um número: ");
            int n = ler.nextInt();

            if(n > 0){
                int resultado = 1;

                for(int j = 1; j <= n ; j++){
                    resultado*=j;
                }
                numeros[i] = resultado;
            }
            else{
                System.out.println("Dado inválido");
                numeros[i] = 0;
            }
        }
        int soma = 0;

        for (int valor : numeros) {
            soma += valor;
        }
        float media = (float) soma / quantidade;

        System.out.printf("O valor da média fatorial é: %.2f%n", media);
        System.out.printf("O calculo da média aritimética é: (%d + %d + %d)/3 %n", numeros[0], numeros[1], numeros[2]);

        ler.close();
    }
}