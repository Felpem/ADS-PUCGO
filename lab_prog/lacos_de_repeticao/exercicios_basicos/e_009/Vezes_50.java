package lab_prog.lacos_de_repeticao.e_009;

import java.util.Scanner;

public class Vezes_50 {
    public static void main(String[] args) {
        int quant_50=0, entrada=1;
        Scanner leia = new Scanner(System.in);

        while (entrada != 0) {
            System.out.print("Numero: ");
            entrada = leia.nextInt();
            if(entrada == 50){
                quant_50 += 1;
            }
        }
        System.out.println("O numero 50 foi lido " + quant_50 + " vezes");
    }
}
