/*A Loja Computação High Tech está com seus produtos em 
promoção. Em cada produto é vendido em 5 (cinco) prestações sem 
juros. Os produtos com valor acima de 200 reais tem 15% de desconto. 
• Construa um programa que receba o valor de um produto e mostre o 
valor das prestações.
*/

package questao10;
import java.util.Scanner;
public class HighTechOfertas{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scan.nextDouble();
        
        double valorFinal = 0;
        
        if (valorProduto > 200){
            valorFinal = valorProduto - (valorProduto * 15/100);
            System.out.println("\nProduto com 15% de desconto aplicado.");
        } 
        
        else{
            valorFinal = valorProduto;
            System.out.println("Produto sem desconto.");
        }
        
        double prestacao = valorFinal / 5;
        System.out.printf("Valor total a pagar:%.2f \n", valorFinal);
        System.out.printf("Valor de cada uma das 5 prestações: %.2f", prestacao);
    }
}