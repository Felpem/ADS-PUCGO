package lab_prog.lacos_de_repeticao.e_005;

import java.util.Scanner;

public class Divisiveis_5 {
    public static void main(String[] args) {
        int sequencia, div5, leitura, soma = 0;
        Scanner leia = new Scanner(System.in);

        for(sequencia = 0; sequencia < 10; sequencia++){
            System.out.print("Numero "+(sequencia+1)+": ");
            leitura = leia.nextInt();
            div5 = leitura % 5;
            if (div5 == 0) {
                soma =+ leitura;
            }
        }
        System.out.println("A soma dos Números diviseis por 5 é " + soma);
    } 
}
