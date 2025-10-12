/* Implemente um programa em Java que simule um sistema bancário simples. O programa deve: 
• Ter uma variável saldo, iniciada com R$ 1000. 
• Usar o Scanner para o usuário: 
1.Escolher uma opção: 
1 - Sacar 
2 - Depositar 
3 - Ver saldo 
2.Se a opção for saque ou depósito, informar o valor desejado. 
• Usar switch para: 
1.1: Subtrair o valor informado do saldo, se houver saldo suficiente. 
2.2: Somar o valor informado ao saldo. 
3.3: Mostrar o saldo atual. 
4.Outra opção: Mostrar "Operação inválida". */

package questao_extra;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float saldo = 1000;

        System.out.println("Bem-vindo ao Banco XValue\nEscolha uma das opções a seguir para continuar:");
        System.out.println("Digite (1) para sacar\nDigite (2) para depositar\nDigite (3) para ver saldo");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("O seu saldo atual: %.2f\n",saldo);
                System.out.print("Informe o valor que deseja sacar: ");
                float sacar = scan.nextFloat();
                if (sacar > saldo) {
                   System.out.println("\nValor insuficiente para sacar!"); 
                }else{
                    float saldoAtual = saldo - sacar;
                    System.out.printf("O valor atual do saldo agora é: %.2f",saldoAtual);
                }
                break;

            case 2:
                System.out.printf("O seu saldo atual: %.2f\n",saldo);
                System.out.print("Informe o valor que deseja depositar: ");
                float depositar = scan.nextFloat();

                float saldoAtual = saldo + depositar;
                System.out.printf("O valor atual do saldo agora é: %.2f",saldoAtual);
                break;

            case 3:
                System.out.printf("Seu saldo é: %.2f",saldo);
                break;
        
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}
