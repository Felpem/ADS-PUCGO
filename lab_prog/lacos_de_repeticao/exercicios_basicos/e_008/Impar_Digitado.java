package lab_prog.lacos_de_repeticao.e_008;

import java.util.Scanner;

public class Impar_Digitado {
    public static void main(String[] args) {
        int leitura=0, impar,impar_quant=0;
        Scanner leia = new Scanner(System.in);

        while (leitura != -999) {
            System.out.print("Numero: ");
            leitura = leia.nextInt();
            impar = leitura % 2;
            if (impar == 1){
                impar_quant += 1;
            }
        }
        System.out.println("Há " + impar_quant + " numeros impar");
    }
}
