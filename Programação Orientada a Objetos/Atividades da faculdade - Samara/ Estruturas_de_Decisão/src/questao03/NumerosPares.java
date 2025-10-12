/*Crie um programa que mostre na tela todos os números pares que 
estão no intervalo entre 1 e 50*/

package questao03;

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Mostraremos todos os números pares no intevalo de um a cinquenta");

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
