import java.util.Scanner;
public class Vetor_String {
    public static void main(String[] args) {
        String[] estados = new String[11];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "RJ";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";
        estados[10] = "PA";

        for (int i = 0; i < estados.length; i++) {
            System.out.println("Estado " + i + ":" + estados[i]);
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a sigla de estado voçê quer buscar? ");
        String siglaBusca = leitor.nextLine();

        //Busca linear
        boolean encontrou = false;
        for (int i = 0; i < estados.length; i++) {
            String elemento = estados[i];
            if (elemento.equalsIgnoreCase(siglaBusca)) {
                encontrou = true;
                break;
            }
        }
        if (encontrou == true) {
            System.out.println("Encontrou");
        }
        else{
            System.out.println("Não encontrou");
        }
    }
}
