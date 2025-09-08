/*A média das médias: Um programa que imprima a média aritmética da soma das duas médias escolhidas pelo usuário.*/

import java.util.Scanner;
public class Media{
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in); 
       System.out.println("Vamos calcular a média das médias, então primeiramente iniciaremos com a primeira média! "); 
        /*Vamos calcular o valor da primeira média*/

       System.out.println("Digite o primeiro número: ");
       double a = ler.nextDouble();
        /*Atribuimos um valor para "a", ou seja, o número escolhido vai ser armazenado na variável "a"*/
       System.out.println("Digite o segundo número: ");
       double b = ler.nextDouble();  
        /*Atribuimos um valor para "b", ou seja, o número escolhido vai ser armazenado na variável "b"*/
       System.out.println("Digite o terceiro número: ");
       double c = ler.nextDouble();
        /*Atribuimos um valor para "c", ou seja, o número escolhido vai ser armazenado na variável "c"*/
       float media1 = (float) ((a+b+c)/3);
       System.out.printf("O valor da primeira média é: %.2f", media1);
        /*Apresentando o valor da primeira média aritimética*/

       System.out.println("\nAgora faremos a segunda média!");
        /*Vamos calcular o valor da segunda média*/

       System.out.println("Digite o primeiro número: ");
       double x = ler.nextDouble();
        /*Atribuimos um valor para "x", ou seja, o número escolhido vai ser armazenado na variável "x"*/
       System.out.println("Digite o segundo número: ");
       double y = ler.nextDouble();  
        /*Atribuimos um valor para "y", ou seja, o número escolhido vai ser armazenado na variável "y"*/  
       System.out.println("Digite o terceiro número: ");
       double z = ler.nextDouble();
        /*Atribuimos um valor para "z", ou seja, o número escolhido vai ser armazenado na variável "z"*/
       float media2 = (float) ((x+y+z)/3);
       System.out.printf("O valor da segunda média é: %.2f", media2);
        /*Apresentando o valor da segunda média aritimética*/


       System.out.println("\nAgora faremos a média das medias!");
       /*Vamos calcular o valor da média aritimética das médias*/

       float resultado = (float) ((media1+media2)/2);
       System.out.printf("O resultado entre as duas médias foi: %.2f", resultado);
        /*Apresentando o valor da média aritimética entre a primeira média com a segunda média*/
    }
}